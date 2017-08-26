package examples.jeffery.com.daggerexamples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AbsListView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.list_demo);
        listView.setOnItemClickListener(this);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1);

        List<Demo> demos = createDemos();

        for (Demo demo : demos) {
            adapter.add(demo.title);
        }

        listView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        System.out.println("position: " + position);
    }

    private class Demo {
        String title;

        Demo(String title) {
            this.title = title;
        }
    }

    private List<Demo> createDemos() {
        List<Demo> demos = new ArrayList<>();
        demos.add(new Demo("1"));
        return demos;
    }
}
