package team103;

abstract class State {
    Actor owner;
    StateMachine fsm;

    public State(Actor owner, StateMachine fsm) {
        this.owner = owner;
        this.fsm = fsm;
    }

    abstract void Execute();

    abstract void Enter();

    abstract void Exit();
}

class InConstruction extends State {
    InConstruction(Actor owner, StateMachine fsm) {
        super(owner, fsm);
    }

    void Enter() {
        // Check capabilities
        if (owner.components.length == 1)
            owner.myRC.turnOff();

        owner.components = owner.myRC.components();
    }

    void Execute() {
        
    }

    void Exit() {

    }
}

class RecyclerGlobal extends State {
    public RecyclerGlobal(Actor owner, StateMachine fsm) {
        super(owner, fsm);
    }

    void Enter() {
        // Check capabilities
    }

    void Execute() {

    }

    void Exit() {

    }
}

class ConstructorGlobal extends State {
    public ConstructorGlobal(Actor owner, StateMachine fsm) {
        super(owner, fsm);
    }

    void Enter() {
        // Check capabilities
    }

    void Execute() {

    }

    void Exit() {

    }
}