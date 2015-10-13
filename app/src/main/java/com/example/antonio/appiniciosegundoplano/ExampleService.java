package com.example.antonio.appiniciosegundoplano;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Antonio on 11/10/2015.
 */
public class ExampleService extends Service {
    private Timer mTimer = null;
    @Override
    public IBinder onBind(Intent arg0) {
        return null;
    }

    @Override
    public void onCreate(){
        super.onCreate();
        this.mTimer = new Timer();
        this.mTimer.scheduleAtFixedRate(
                new TimerTask(){
                    @Override
                    public void run() {
                        ejecutarTarea();
                    }
                }
                , 0, 100 * 60);
    }

    private void ejecutarTarea(){
        Thread t = new Thread(new Runnable() {
            public void run() {
                NotifyManager notify = new NotifyManager();
                notify.playNotification(getApplicationContext(),
                        MainActivity.class, "Tienes una notificación"
                        , "Notificación plasta de panfi", android.R.drawable.arrow_down_float);
                //Toast.makeText(null, "añsldkfj sñlkfj asdñl j", Toast.LENGTH_LONG);

            }
        });
        t.start();
    }

}
