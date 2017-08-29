package examples.jeffery.com.daggerexamples.pc;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jeffery on 8/29/17.
 */

@Module
public class PCModule {

    private final Motherboard mb;

    public PCModule(Motherboard mb) {
        this.mb = mb;
    }

    @Provides
    @Singleton
    public Motherboard provideMotherboard() {
        return this.mb;
    }

}