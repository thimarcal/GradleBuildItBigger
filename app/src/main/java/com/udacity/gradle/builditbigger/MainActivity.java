package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import nanodegree.thiago.andjoke.JokeUiAcivity;
import nanodegree.thiago.jokeslib.Jokes;


public class MainActivity extends AppCompatActivity implements RetrieveJokeTask.JokeReceivedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {
        new RetrieveJokeTask(this).execute(new Pair<Context, String>(this, null));
    }


    @Override
    public void onJokeReceived(String joke) {
        Intent jokeActivityIntent = new Intent(this, JokeUiAcivity.class);
        jokeActivityIntent.putExtra(getString(R.string.joke_extra), joke);

        startActivity(jokeActivityIntent);
    }
}
