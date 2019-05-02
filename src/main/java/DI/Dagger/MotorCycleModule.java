package DI.Dagger;

import DI.MotorCycleDI.*;
import dagger.Module;
import dagger.Provides;

@Module
public class MotorCycleModule {

    @Provides
    Motor provideMotor(){
        return new Motor();
    }

    @Provides
    MotorCycleFrame provideMotorCycleFrame(){
        return new MotorCycleFrame();
    }

    @Provides
    Tire provideTire(){
        return new Tire();
    }

    @Provides
    WheelFrame provideWheelFrame(){
        return new WheelFrame();
    }

    @Provides
    MotorCycle provideMotorCycle(Motor motor, Wheel wheel, MotorCycleFrame frame){
        return new MotorCycle(motor, wheel, frame);
    }

    @Provides
    Wheel provideWheel(Tire tire, WheelFrame wheelFrame){
        return new Wheel(tire, wheelFrame);
    }
}
