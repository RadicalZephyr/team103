package team103;

import battlecode.common.*;
//import static battlecode.common.GameConstants.*;

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

class findFlux extends State {

    public findFlux(Actor owner, StateMachine fsm) {
        super(owner, fsm);
    }
                   
    void Enter() {

    }

    void Execute() {
        System.out.println("Looking for flux.");
        if (!owner.canSeeMine()) {
            
        }
        
    }
                  
    void Exit() {

    }
}


class Constructor extends SensorActor {
    
    public Constructor(RobotController rc) {
        super(rc);
    }
}