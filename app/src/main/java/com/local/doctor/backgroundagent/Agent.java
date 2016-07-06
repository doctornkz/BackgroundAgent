package com.local.doctor.backgroundagent;

import android.app.IntentService;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.StrictMode;
import android.util.Log;
import android.widget.Toast;

public class Agent extends IntentService {
    private static final String TAG = "Agent007"; /* define log tag*/
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
        Toast.makeText(this, "Service created...", Toast.LENGTH_LONG).show();
        Log.i(TAG, "Service created!");
    }
    @Override
    public void onStart(Intent intent, int startId){
        super.onStart(intent, startId);
        Log.i(TAG, "Service started");
    }

    @Override
    public void  onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Service destroyed...", Toast.LENGTH_LONG).show();

    }

    @Override
    public IBinder onBind(Intent intent){
        return null;
    }

    @Override
    public void onHandleIntent(Intent intent){


    }


}