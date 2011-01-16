package team103;

abstract class State {
    Actor owner;
    StateMachine fsm;

    public State(Actor owner, StateMachine fsm) {
        this.owner = owner;
        this.fsm = fsm;
    }

    abstract void Enter();

    abstract void Execute();

    abstract void Exit();
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