package team103;

import battlecode.common.*;
import static battlecode.common.GameConstants.*;

public class RobotPlayer implements Runnable {

    private final RobotController myRC;
    private StateMachine mySM;

    public RobotPlayer(RobotController rc) {
        myRC = rc;
        mySM = new StateMachine(new Mover(rc));
    }

    public void run() {
        if (myRC.getChassis() == Chassis.BUILDING)
            mySM = new StateMachine(new Building(myRC));
            
        ComponentController[] components = myRC.newComponents();
        System.out.println(java.util.Arrays.toString(components));
        System.out.flush();


        while (true) {
            // Last catch loop
            mySM.Update();
            myRC.yield();
        }
    }

}

