package com.example.antonio.appiniciosegundoplano;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Antonio on 13/10/2015.
 */
public class BootReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Intent service = new Intent(null, ExampleService.class);
        context.startService(service);
    }
}
