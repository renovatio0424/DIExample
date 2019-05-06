package NoDI.MotorCycle;

public class MotorCycleImpl implements MotorCycle {
    MotorImpl motor;
    Wheel wheel;
    MotorCycleFrame frame;

    public MotorCycleImpl() {
        this.motor = new MotorImpl();
        this.wheel = new Wheel();
        this.frame = new MotorCycleFrame();
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

