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
        if (myRC.getChassis() == Chassis.BUILDING) {
            mySM.changeActor(new Building(myRC));
        }

        mySM.changeState(new InConstruction(mySM.Owner, mySM));
        
        while (true) {
            // Last catch loop
            mySM.Update();
            myRC.yield();
        }
    }

}
