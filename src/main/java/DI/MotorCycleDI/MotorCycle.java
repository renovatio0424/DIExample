package DI.MotorCycleDI;

public class MotorCycle implements MotorCycleImpl {
    Motor motor;
    Wheel wheel;
    MotorCycleFrame frame;

    public MotorCycle(Motor motor,Wheel wheel, MotorCycleFrame motorCycleFrame) {
        this.motor = motor;
        this.wheel = wheel;
        this.frame = motorCycleFrame;
    }

    @Override
    public void run() {
        motor.ready();
        motor.run();
    }
}

interface MotorCycleImpl {
    void run();
}

interface MotorImpl {
    void ready();

    void run();
}

