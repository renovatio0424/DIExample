package DI.MotorCycleDI;

public class Wheel {
    Tire tire;
    WheelFrame wheelFrame;

    public Wheel(Tire tire, WheelFrame wheelFrame) {
        this.tire = tire;
        this.wheelFrame = wheelFrame;
    }

}
