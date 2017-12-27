package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.runner.AndroidJUnit4;
import android.util.Pair;

import static junit.framework.Assert.assertFalse;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by thiagom on 12/26/17.
 */

@RunWith(AndroidJUnit4.class)
public class JokeRetrievalTest {

    @Test
    public void testJokeRetrieval() {
        RetrieveJokeTask retrieveJokeTask = new RetrieveJokeTask(new RetrieveJokeTask.JokeReceivedListener() {
            @Override
            public void onJokeReceived(String joke) {
                assertFalse(joke.isEmpty());
            }
        });

        retrieveJokeTask.execute(new Pair<Context, String>(null, null));
    }
}
