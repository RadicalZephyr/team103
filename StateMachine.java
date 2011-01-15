package team103;

public class StateMachine {
    MethodActor Owner;
 
    State CurrentState;
    State PreviousState;
    State GlobalState; 

    StateMachine(MethodActor owner) {
        Owner = owner;
    }
   
    // Init. methods
    void SetCurrentState(State state) {
        CurrentState = state;
    }

    void SetGlobalState(State state) {
        GlobalState = state;
    }

    void SetPreviousState(State state) {
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

    void ChangeState(State state) {

        assert (state != null): "StateMachine tried to enter a null state.";

        PreviousState = CurrentState;

        CurrentState.Exit(Owner);
        CurrentState = state;
        CurrentState.Enter(Owner);
    }
    
    void RevertToPreviousState() {
        ChangeState(PreviousState);
    }

    boolean isInState(State state) {
        return CurrentState == state;
    }
}