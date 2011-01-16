package team103;

class InConstruction extends State {
    InConstruction(Actor owner, StateMachine fsm) {
        super(owner, fsm);
    }

    void Enter() {
        //System.out.println("Entering InConstruction state");
        if (owner.components.length == 1 || 
            owner.myRC.wasTurnedOff() == true) {
            System.out.println("Shutting down for component adding.");
            owner.myRC.turnOff();
        }
    }

    void Execute() {
        owner.components = owner.myRC.components();
        // Check capabilities        
        //System.out.println("Executing InConstruction: identifying components.");
        switch (owner.myRC.getChassis()) {
        case BUILDING:
            if (isRecycler())
                System.out.println("Identified Recycler.");
            break;
        case LIGHT:
            if (isConstructor())
                System.out.println("Identified Constructor.");
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

    boolean isConstructor() {
        return (owner.components[1] == ComponentType.CONSTRUCTOR &&
                owner.components[2] == ComponentType.SIGHT);
    }

    boolean isRecycler() {
        return (owner.components[1] == ComponentType.BUILDING_SENSOR &&
                owner.components[2] == ComponentType.RECYCLER);
    }
}
