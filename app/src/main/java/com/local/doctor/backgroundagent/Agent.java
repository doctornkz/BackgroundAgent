package com.local.doctor.backgroundagent;

/**
 * Created by doctor on 05.07.16.
 */


import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class Agent extends Service{
    String tag="Agent";
    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this, "Service created...", Toast.LENGTH_LONG).show();
        Log.i(tag, "Service created...");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "Service started...", Toast.LENGTH_LONG).show();
        super.onStartCommand(intent, flags ,startId);
        Log.i(tag, "Service started...");
        return START_NOT_STICKY;
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Service destroyed...", Toast.LENGTH_LONG).show();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
