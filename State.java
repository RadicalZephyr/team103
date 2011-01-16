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

class InConstruction extends State {
    InConstruction(Actor owner, StateMachine fsm) {
        super(owner, fsm);
    }

    void Enter() {
        System.out.println("Entering InConstruction state");
        if (owner.components.length == 1 || 
            owner.myRC.wasTurnedOff() == true) {
            System.out.println("Shutting down for component adding.");
            owner.myRC.turnOff();
        }
    }

    void Execute() {
        owner.components = owner.myRC.components();
        // Check capabilities        
        System.out.println("Executing InConstruction: identifying components.");
        switch (owner.myRC.getChassis()) {
        case BUILDING:

            break;
        case LIGHT:

            break;
        case MEDIUM:

            break;
        case HEAVY:

            break;
        case FLYING:

            break;
        default:
            System.out.println("Unknown chassis type.");
            break;
        }
    }

    void Exit() {
        System.out.println("Done building.  Changing to a do-stuff state.");
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