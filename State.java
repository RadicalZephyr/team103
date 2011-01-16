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
