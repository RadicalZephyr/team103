package team103;

public abstract class State {
    abstract void Execute(MethodActor owner);

    abstract void Enter(MethodActor owner);

    abstract void Exit(MethodActor owner);
}
