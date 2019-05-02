package DI.Dagger;

import DI.MotorCycleDI.MotorCycle;

import javax.inject.Inject;

class Application {
    @Inject
    MotorCycle motorCycle;

    void run() {
        MotorCycleComponent component = DaggerMotorCycleComponent.builder()
                .motorCycleModule(new MotorCycleModule())
                .build();

        component.inject(this);

        motorCycle.run();
    }
}
