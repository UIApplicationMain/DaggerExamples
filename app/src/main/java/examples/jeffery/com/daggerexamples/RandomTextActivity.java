package examples.jeffery.com.daggerexamples;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

/**
 * Created by jeffery on 8/26/17.
 */

public class RandomTextActivity extends AppCompatActivity {

    @Inject
    RandomText randomText;

    TextView textView;
    Button button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_text);

        textView = findViewById(R.id.text_view_display);
        button = findViewById(R.id.button_generate);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(randomText.getRandomSaying());
            }
        });

        DaggerComponentWrapper.getMyAppComponent().inject(this);
    }

    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        return super.onCreateView(name, context, attrs);
    }

}
