package examples.jeffery.com.daggerexamples.pc;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by jeffery on 8/29/17.
 */

@Singleton
public class MyPC {

    private final Motherboard motherboard;
    private final GPU gpu;

    @Inject
    public MyPC(Motherboard mb, GPU gpu) {
        this.motherboard = mb;
        this.gpu = gpu;
    }

    public List<String> getPcParts() {
        List<String> parts = new ArrayList<>();

        parts.add(motherboard.model);
        parts.add(gpu.model);
        parts.add("The End");

        return parts;
    }

    public int getItemCount() {
        return 3;
    }

}

