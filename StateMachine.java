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
        System.out.println("Entered update.");
        if (GlobalState != null) {
            GlobalState.Execute();
        }
        if (CurrentState != null) {
            CurrentState.Execute();
        }
    }

    void changeState(State state) {
        if (state == null)
            return;

        PreviousState = CurrentState;

        CurrentState.Exit();
        CurrentState = state;
        CurrentState.Enter();
    }
 
    void changeActor(Actor actor) {
        if (actor == null)
            return;
        
        Owner = actor;
    }
   
    void revertToPreviousState() {
        changeState(PreviousState);
    }

    boolean isInState(State state) {
        return CurrentState == state;
    }
}