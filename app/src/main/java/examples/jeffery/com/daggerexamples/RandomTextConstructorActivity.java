package examples.jeffery.com.daggerexamples;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;

import javax.inject.Inject;

import examples.jeffery.com.daggerexamples.pc.MyPC;
import examples.jeffery.com.daggerexamples.pc.PCAdapter;

/**
 * Created by jeffery on 8/28/17.
 */

public class RandomTextConstructorActivity extends AppCompatActivity {

    @Inject
    MyPC myPC;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pc_constructor);

        DaggerComponentWrapper.getMyPCComponent().inject(this);

        RecyclerView list = findViewById(R.id.list_pc_parts);

        PCAdapter adapter = new PCAdapter(getApplicationContext(), myPC);
        list.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
        list.setAdapter(adapter);
    }

    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        return super.onCreateView(name, context, attrs);
    }

}
