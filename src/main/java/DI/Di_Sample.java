package DI;

import DI.MotorCycleDI.*;

public class Di_Sample {

    public static void main(String[] args) {
        MotorImpl myMotor = new MotorImpl();
        Tire myTire = new Tire();
        WheelFrame myWheelFrame = new WheelFrame();
        MotorCycleFrame myMotorCycleFrame = new MotorCycleFrame();
        Wheel myWheel = new Wheel(myTire, myWheelFrame);

        MotorCycleImpl myMotorCycle = new MotorCycleImpl(myMotor, myWheel, myMotorCycleFrame);
        myMotorCycle.run();
    }
}
