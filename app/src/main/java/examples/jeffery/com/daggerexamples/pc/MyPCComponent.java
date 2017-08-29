package examples.jeffery.com.daggerexamples.pc;

import javax.inject.Singleton;

import dagger.Component;
import examples.jeffery.com.daggerexamples.RandomTextConstructorActivity;

/**
 * Created by jeffery on 8/29/17.
 */

@Singleton
@Component(modules = {PCModule.class})
public interface MyPCComponent {
    void inject(RandomTextConstructorActivity activity);

}