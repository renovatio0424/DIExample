package NoDI.MotorCycle;

public class MotorCycle implements MotorCycleImpl {
    Motor motor;
    Wheel wheel;
    MotorCycleFrame frame;

    public MotorCycle() {
        this.motor = new Motor();
        this.wheel = new Wheel();
        this.frame = new MotorCycleFrame();
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

