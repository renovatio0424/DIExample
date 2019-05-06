package DI.MotorCycleDI;

public class MotorCycleImpl implements MotorCycle {
    MotorImpl motor;
    Wheel wheel;
    MotorCycleFrame frame;

    public MotorCycleImpl(MotorImpl motor, Wheel wheel, MotorCycleFrame motorCycleFrame) {
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

interface MotorCycle {
    void run();
}

interface Motor {
    void ready();

    void run();
}

