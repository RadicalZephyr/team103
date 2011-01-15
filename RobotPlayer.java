package team103;

import battlecode.common.*;
import static battlecode.common.GameConstants.*;

public class RobotPlayer implements Runnable {

    private final RobotController myRC;
    private StateMachine mySM;

    public RobotPlayer(RobotController rc) {
        myRC = rc;
        mySM = new StateMachine(new Actor(rc));
    }

    public void run() {
        if (myRC.getChassis() == Chassis.BUILDING)
            mySM = new StateMachine(new Building(myRC));
            
        while (true) {
            // Last catch loop
            mySM.Update();
            myRC.yield();
        }
    }

}

