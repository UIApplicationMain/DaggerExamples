package examples.jeffery.com.daggerexamples;

import android.widget.ArrayAdapter;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by jeffery on 8/26/17.
 */

@Singleton
@Component(modules = { MyAppModule.class })
public interface MyAppComponent {
    void inject(RandomTextActivity activity);
    void inject(RandomTextListActivity activity);
}


