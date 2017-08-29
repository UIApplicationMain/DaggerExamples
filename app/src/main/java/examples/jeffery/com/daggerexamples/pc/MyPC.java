package examples.jeffery.com.daggerexamples.pc;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

/**
 * Created by jeffery on 8/29/17.
 */

public class MyPC {

    private Motherboard motherboard;

    @Inject
    public MyPC(Motherboard mb) {
        this.motherboard = mb;
    }

    public List<String> getPcParts() {
        List<String> parts = new ArrayList<>();

        parts.add(motherboard.model);
        parts.add("The End");

        return parts;
    }

    public int getItemCount() {
        return 2;
    }

}
