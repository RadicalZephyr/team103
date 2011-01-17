package team103;

import battlecode.common.*;
import static battlecode.common.GameConstants.*;

class RecyclerGlobal extends State {
    public RecyclerGlobal(Actor owner, StateMachine fsm) {
        super(owner, fsm);
    }

    void Enter() {

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
        RobotController RC = owner.myRC;
        System.out.println("Making constructors.");
        // Check for resources, space, component usage
        // if any of those are needed, switch states to idling
        while (true) {
            if (RC.getTeamResources() > Chassis.LIGHT.cost &&
                (!owner.components[0].isActive()) &&
                ((MovementController)owner.components[0]).canMove(RC.getDirection()))
                break;
            else 
                RC.yield();
        }
        
    }
                  
    void Exit() {

    }
}