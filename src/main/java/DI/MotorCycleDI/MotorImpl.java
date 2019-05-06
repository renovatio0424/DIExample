package DI.MotorCycleDI;

public class MotorImpl implements Motor {
    boolean isRunning = false;

    @Override
    public void ready() {
        this.isRunning = true;
    }

    @Override
    public void run() {
        System.out.println("run ==3");
    }

}
