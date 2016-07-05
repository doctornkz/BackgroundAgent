package com.local.doctor.backgroundagent;

import android.app.Activity;
import android.app.LauncherActivity;
import android.content.Intent;
import android.util.Log;


public class MainActivity  extends Activity {
        private static final String TAG = ""; /* define log tag*/
        // Call `launchTestService()` in the activity
        // to startup the service

        public void launchTestService() {

            // Construct our Intent specifying the Service
            Intent i = new Intent(this, Agent.class);
            // Add extras to the bundle
            i.putExtra("foo", "bar");
            // Start the service
            startService(i);


            Log.e(TAG, "");

        }


    }


