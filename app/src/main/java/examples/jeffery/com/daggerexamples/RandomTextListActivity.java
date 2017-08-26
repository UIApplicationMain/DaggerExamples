package examples.jeffery.com.daggerexamples;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by jeffery on 8/26/17.
 */

public class RandomTextListActivity extends AppCompatActivity {

    @Inject
    RandomText rng;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_text_list);

        DaggerComponentWrapper.getMyAppComponent().inject(this);

        RecyclerView list = findViewById(R.id.list_quotes);

        SimpleAdapter adapter = new SimpleAdapter(getApplicationContext(), rng);
        list.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
        list.setAdapter(adapter);
    }

    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        return super.onCreateView(name, context, attrs);
    }

}
