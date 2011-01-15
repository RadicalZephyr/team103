package team103;

public abstract class State {
    abstract void Execute(Actor owner);

    abstract void Enter(Actor owner);

    abstract void Exit(Actor owner);
}
