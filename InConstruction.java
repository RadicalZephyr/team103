package team103;

import battlecode.common.*;
import static battlecode.common.GameConstants.*;

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
            if (isRecycler()) {
                System.out.println("Identified Recycler.");
                fsm.setGlobalState(new RecyclerGlobal(owner, fsm));
            }
            break;
        case LIGHT:
            if (isConstructor()) {
                System.out.println("Identified Constructor.");
                fsm.setGlobalState(new ConstructorGlobal(owner,fsm));
            }
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
        return (owner.components[1].type() == ComponentType.CONSTRUCTOR &&
                owner.components[2].type() == ComponentType.SIGHT);
    }

    boolean isRecycler() {
        return (owner.components[1].type() == ComponentType.BUILDING_SENSOR &&
                owner.components[2].type() == ComponentType.RECYCLER);
    }
}
