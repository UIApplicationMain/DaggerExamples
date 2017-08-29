package examples.jeffery.com.daggerexamples;

import java.util.List;
import java.util.Random;

/**
 * Created by jeffery on 8/26/17.
 */

public class RandomText {

    List<String> sayings;
    Random rng = new Random();

    RandomText(List<String> sayings) {
        this.sayings = sayings;
    }

    public String getRandomSaying() {
        if (sayings.size() > 0) {
            int n = rng.nextInt(sayings.size());
            return sayings.get(n);
        }

        return "Empty sayings.";
    }

    public List<String> getSayings() {
        return sayings;
    }
}
