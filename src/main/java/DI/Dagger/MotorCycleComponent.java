package DI.Dagger;

import dagger.Component;

@Component(modules = MotorCycleModule.class)
public interface MotorCycleComponent {
    void inject(Application application);
}
