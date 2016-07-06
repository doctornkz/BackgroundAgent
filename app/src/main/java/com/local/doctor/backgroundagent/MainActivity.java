package com.local.doctor.backgroundagent;

import android.app.Activity;
import android.app.LauncherActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


public class MainActivity  extends Activity {

        @Override
        protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            TextView view = new TextView(this);
            view.setText("Service Test");
            Intent i = new Intent();
            i.setClassName("com.local.doctor.backgroundagent", "com.local.doctor.backgroundagent.Agent");
            bindService(i, null, Context.BIND_AUTO_CREATE);
            this.startService(i);
            setContentView(view);

        }

    }


