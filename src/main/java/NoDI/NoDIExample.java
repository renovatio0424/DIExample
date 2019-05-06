package NoDI;


import NoDI.MotorCycle.MotorCycleImpl;

public class NoDIExample {
    public static void main(String[] args) {
        MotorCycleImpl myMotorCycle = new MotorCycleImpl();
        myMotorCycle.run();
    }
}
