package team103;

import battlecode.common.*;
import static battlecode.common.GameConstants.*;

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

class Mover extends Actor {

    WeaponController[] weapons;
    
    SensorController sensor;

    BroadcastController broadcast;

    public Mover(RobotController rc) {
        super(rc);
    }
    
}

class Building extends Actor {
    
    BuilderController builder;
    SensorController sensor;
    
    public Building(RobotController rc) {
        super(rc);
        
    }

}