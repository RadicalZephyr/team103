package team103;

import battlecode.common.*;
import static battlecode.common.GameConstants.*;

public class Mover extends Actor {

    WeaponController mainwep;
    WeaponController subwep;
    
    SensorController sensor;

    BroadcastController broadcast;

    public Mover(RobotController rc) {
        super(rc);
    }
}