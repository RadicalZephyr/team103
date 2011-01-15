package team103;

import battlecode.common.*;
import static battlecode.common.GameConstants.*;

class Building extends Actor {
    
    BuilderController builder;
    SensorController sensor;
    
    public Building(RobotController rc) {
        super(rc);
        ComponentController[] components = myRC.components();
        System.out.println(java.util.Arrays.toString(components));
        System.out.flush();
        mover = (MovementController) components[0];
    }

    boolean isClearInFront() {
        System.out.println("Checking in front of robot.");
        return true;
    }

}