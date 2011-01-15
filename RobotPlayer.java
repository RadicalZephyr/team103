package team103;

import battlecode.common.*;
import static battlecode.common.GameConstants.*;

public class RobotPlayer implements Runnable {

    private final RobotController myRC;
    private final StateMachine mySM;
    private final MethodActor mover;

    public RobotPlayer(RobotController rc) {
        myRC = rc;
        mover = new Mover();
        mySM = new StateMachine(mover);
    }

    public void run() {
        ComponentController[] components = myRC.newComponents();
        System.out.println(java.util.Arrays.toString(components));
        System.out.flush();


        while (true) {
            // Last catch loop
            myRC.yield();
        }
    }

}

