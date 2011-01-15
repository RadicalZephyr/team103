package team103;

import battlecode.common.*;
import static battlecode.common.GameConstants.*;

class Building extends Actor {
    
    BuilderController builder;
    SensorController sensor;
    
    public Building(RobotController rc) {
        super(rc);
    }

    boolean isClearInFront() {
        System.out.println("Checking in front of robot.");
        return true;
    }

}