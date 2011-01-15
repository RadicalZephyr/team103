package team103;

abstract class State {
    abstract void Execute(Actor owner);

    abstract void Enter(Actor owner);

    abstract void Exit(Actor owner);
}

class RecyclerGlobal extends State {

    void Enter(Actor owner) {
        // Do checks for calls that are made.
    }

    void Execute(Actor owner) {

    }

    void Exit(Actor owner) {

    }
}