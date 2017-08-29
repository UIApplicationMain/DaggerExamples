package examples.jeffery.com.daggerexamples;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by jeffery on 8/26/17.
 */

public class CodeSamples {

    class Phone {
        private final Battery battery;
        private final Touchscreen screen;

        Phone() {
            this.battery = new Battery();
            this.screen = new Touchscreen();
        }
    }

    // Phone = new Phone();

    class ApplePhone {
        private final Battery battery;
        private final Touchscreen screen;

        ApplePhone(Battery battery, Touchscreen screen) {
            this.battery = battery;
            this.screen = screen;
        }
    }

    // Battery bestBattery = new Battery();
    // Touchscreen bestScreen = new Touchscreen();
    // ApplePhone iPhone = new ApplePhone(bestBattery, bestScreen);



    class Battery {

    }

    class Touchscreen {

    }
}

//@Singleton
//@Component(modules={A.class, B.class})
//public interface SingletonComponent {
//    A a();
//    B b();
//
//    void inject(Here here);
//}

