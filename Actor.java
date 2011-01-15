package team103;

import battlecode.common.*;
import static battlecode.common.GameConstants.*;

public abstract class Actor {
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

    abstract boolean isClearInFront();
    
}
