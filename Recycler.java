package team103;

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

class makeConstructors extends State {

    public makeConstructors(Actor owner, StateMachine fsm) {
        super(owner, fsm);
    }
                   
    void Enter() {

    }

    void Execute() {
        System.out.println("Making constructors.");
    }
                  
    void Exit() {

    }
}