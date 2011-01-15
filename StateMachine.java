package team103;

public class StateMachine {
    Actor Owner;
 
    State CurrentState;
    State PreviousState;
    State GlobalState; 

    StateMachine(Actor owner) {
        Owner = owner;
    }
   
    // Init. methods
    void setCurrentState(State state) {
        CurrentState = state;
    }

    void setGlobalState(State state) {
        GlobalState = state;
    }

    void setPreviousState(State state) {
        PreviousState = state;
    }

    // Usage methods
    void Update() {
        if (GlobalState != null) {
            GlobalState.Execute(Owner);
        }
        if (CurrentState != null) {
            CurrentState.Execute(Owner);
        }
    }

    void changeState(State state) {

        assert (state != null): "StateMachine tried to enter a null state.";

        PreviousState = CurrentState;

        CurrentState.Exit(Owner);
        CurrentState = state;
        CurrentState.Enter(Owner);
    }
    
    void revertToPreviousState() {
        changeState(PreviousState);
    }

    boolean isInState(State state) {
        return CurrentState == state;
    }
}