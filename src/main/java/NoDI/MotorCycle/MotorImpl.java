package NoDI.MotorCycle;

public class MotorImpl implements Motor {
    private boolean isRunning = false;

    @Override
    public void ready() {
        this.isRunning = true;
    }

    @Override
    public void run() {
        System.out.print("run ==3");
    }

    public boolean isRunning() {
        return isRunning;
    }
}
