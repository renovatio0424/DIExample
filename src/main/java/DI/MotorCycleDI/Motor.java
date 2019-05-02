package DI.MotorCycleDI;

public class Motor implements MotorImpl {
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
