package DI;

import DI.MotorCycleDI.*;

public class Di_Sample {

    public static void main(String[] args) {
        Motor myMotor = new Motor();
        Tire myTire = new Tire();
        WheelFrame myWheelFrame = new WheelFrame();
        MotorCycleFrame myMotorCycleFrame = new MotorCycleFrame();
        Wheel myWheel = new Wheel(myTire, myWheelFrame);

        MotorCycle myMotorCycle = new MotorCycle(myMotor, myWheel, myMotorCycleFrame);
        myMotorCycle.run();
    }
}
