package com.local.doctor.backgroundagent;

import android.app.IntentService;

import android.content.Intent;
import android.util.Log;

/**
 * Created by doctor on 05.07.16.
 */


public class Agent extends IntentService {
    private static final String TAG = "zxcvbnm11"; /* define log tag*/
    // Must create a default constructor
    public Agent() {
        // Used to name the worker thread, important only for debugging.
        super("zxcvbnm");
    }

    @Override
    public void onCreate()  {
        int max = 200;
        super.onCreate(); // if you override onCreate(), make sure to call super().
        // If a Context object is needed, call getApplicationContext() here.

        // Use Activity method to create a file in the writeable directory
        for (int i=0; i < max; i++) {

            try {
                Log.i(TAG, "");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Log.e(TAG, "");
            }
        }
    }


    @Override
    protected void onHandleIntent(Intent intent) {
        // This describes what will happen when service is triggered
    }
}