package team103;

import battlecode.common.*;
import static battlecode.common.GameConstants.*;

public class RobotPlayer implements Runnable {

    private final RobotController myRC;
    private StateMachine mySM;

    public RobotPlayer(RobotController rc) {
        myRC = rc;
        mySM = new StateMachine(new Actor(rc));

        mySM.setCurrentState(new InConstruction(mySM.Owner, mySM));
        mySM.setGlobalState(null);
        mySM.setPreviousState(null);
    }

    public void run() {
        if (myRC.getChassis() == Chassis.BUILDING) {
            mySM.changeActor(new Building(myRC));
        }

        while (true) {
            // Last catch loop
            mySM.Update();
            myRC.yield();
        }
    }

}
