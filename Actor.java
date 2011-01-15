package team103;

import battlecode.common.*;
import static battlecode.common.GameConstants.*;

public abstract class Actor {
    private final RobotController myRC;

    public Actor(RobotController rc) {
        myRC = rc;
    }

    abstract boolean isClearInFront();
    
}
