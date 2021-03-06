package DI.Dagger;

import DI.MotorCycleDI.MotorCycleImpl;

import javax.inject.Inject;

class Application {
    @Inject
    MotorCycleImpl motorCycle;

    void run() {
        MotorCycleComponent component = DaggerMotorCycleComponent.builder()
                .motorCycleModule(new MotorCycleModule())
                .build();

        component.inject(this);

        motorCycle.run();
    }
}
