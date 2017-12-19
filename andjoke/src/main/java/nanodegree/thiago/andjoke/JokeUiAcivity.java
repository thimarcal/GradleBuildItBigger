package nanodegree.thiago.andjoke;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class JokeUiAcivity extends AppCompatActivity {

    private TextView jokeTextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_ui_acivity);

        jokeTextview = (TextView)findViewById(R.id.joke_textview);

        Intent intent = getIntent();
        if (intent.hasExtra(getString(R.string.joke_extra))) {
            jokeTextview.setText(intent.getStringExtra(getString(R.string.joke_extra)));
        }
    }
}
