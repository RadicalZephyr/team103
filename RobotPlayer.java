package team103;

import battlecode.common.*;
import static battlecode.common.GameConstants.*;

public class RobotPlayer implements Runnable {

    private final RobotController myRC;
    private StateMachine mySM;

    public RobotPlayer(RobotController rc) {
        // Store the controll class for this robot
        // All methods called on this class are provided in the API
        myRC = rc;

        if (myRC.getChassis() == Chassis.BUILDING) {
            mySM = new StateMachine(new Building(rc));
        } else {
            mySM = new StateMachine(new Actor(rc));
        }
        
        // Set up the statemachine, InConstruction is capable of
        // filtering the original robots from newly created ones.
        mySM.setCurrentState(new InConstruction(mySM.Owner, mySM));
        mySM.setGlobalState(null);
        mySM.setPreviousState(null);
    }

    public void run() {

        while (true) {
            // Last catch loop
            mySM.Update();
            myRC.yield();
        }
    }

}
