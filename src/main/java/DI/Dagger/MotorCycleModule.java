package DI.Dagger;

import DI.MotorCycleDI.*;
import dagger.Module;
import dagger.Provides;

@Module
public class MotorCycleModule {

    @Provides
    MotorImpl provideMotor(){
        return new MotorImpl();
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
    MotorCycleImpl provideMotorCycle(MotorImpl motor, Wheel wheel, MotorCycleFrame frame){
        return new MotorCycleImpl(motor, wheel, frame);
    }

    @Provides
    Wheel provideWheel(Tire tire, WheelFrame wheelFrame){
        return new Wheel(tire, wheelFrame);
    }
}
