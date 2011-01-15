package team103;

import battlecode.common.*;
import static battlecode.common.GameConstants.*;

public abstract class Actor {
    final RobotController myRC;
    final MovementController motor;
    
    Direction curDir;
    
    double curHP, maxHP;

    Message[] inMessages;

    public Actor(RobotController rc) {
        myRC = rc;
        motor = (MovementController) myRC.components()[0];

        curDir = myRC.getDirection();

        curHP = myRC.getHitPoints();
        maxHP = curHP;

    }

    abstract boolean isClearInFront();
    
}
