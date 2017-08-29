package examples.jeffery.com.daggerexamples.pc;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jeffery on 8/29/17.
 */

@Module
public class PCModule {

    @Provides
    @Singleton
    public Motherboard provideMotherboard() {
        return new Motherboard("ASUS");
    }

    @Provides
    @Singleton
    public GPU provideGPU() {
        return new GPU("Nvidia");
    }

}

