package team103;

import battlecode.common.*;
import battlecode.common.Mine;
//import static battlecode.common.GameConstants.*;

class Actor {
    final RobotController myRC;
    final MovementController motor;

    ComponentController[] components;    
    Direction curDir;
    
    double curHP, maxHP;

    Message[] inMessages;

    public Actor(RobotController rc) {
        myRC = rc;
        components = myRC.components();
        System.out.println(java.util.Arrays.toString(components));
        System.out.flush();

        motor = (MovementController) components[0];

        curDir = myRC.getDirection();

        curHP = myRC.getHitpoints();
        maxHP = curHP;

    }

    boolean isClearInFront() {
        System.out.println("Checking in front of robot.");
        return motor.canMove(curDir);
    }
    
}

class SensorActor extends Actor {

    SensorController sensor;
    Mine mine; // This will never do anything, and probably won't run

     public SensorActor(RobotController rc) {
        super(rc);
    }
    
    void setSensor(SensorController sensor) {
        this.sensor = sensor;
    }

    boolean canSeeMine() {
        return sensor.canSenseObject(mine);
    }

}

class Building extends Actor {
    
    BuilderController builder;
    SensorController sensor;
    
    public Building(RobotController rc) {
        super(rc);
        
    }

}