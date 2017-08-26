package examples.jeffery.com.daggerexamples;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jeffery on 8/26/17.
 */

public class DaggerComponentWrapper {

    private static MyAppComponent component;

    public static MyAppComponent getMyAppComponent() {
        if (null == component) {
            initComponent();
        }
        return component;
    }

    private static void initComponent() {
        List<String> quotes = new ArrayList<>();
        quotes.add("Strive not to be a success, but rather to be of value. –Albert Einstein");
        quotes.add("You miss 100% of the shots you don’t take. –Wayne Gretzky");
        quotes.add("The mind is everything. What you think you become. –Buddha");
        quotes.add("The best time to plant a tree was 20 years ago. The second best time is now. –Chinese Proverb");
        quotes.add("Eighty percent of success is showing up. –Woody Allen");

        component = DaggerMyAppComponent.builder().myAppModule(new MyAppModule(quotes)).build();
    }

}
