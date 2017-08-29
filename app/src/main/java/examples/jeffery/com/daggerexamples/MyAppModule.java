package examples.jeffery.com.daggerexamples;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jeffery on 8/26/17.
 */

@Module
public class MyAppModule {

    List<String> sayings = new ArrayList<>();

    MyAppModule(List<String> sayings) {
        this.sayings = sayings;
    }

    @Provides
    @Singleton
    RandomText provideRandomText() {
        return new RandomText(sayings);
    }

}

