package NoDI.MotorCycle;

public class Wheel {
    Tire tire;
    WheelFrame wheelFrame;

    public Wheel() {
        this.tire = new Tire();
        this.wheelFrame = new WheelFrame();
    }

}
