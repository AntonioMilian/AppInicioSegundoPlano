package com.example.antonio.appiniciosegundoplano;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Antonio on 11/10/2015.
 */
public class NotifyManager {

    public void playNotification(Context context, Class<?> cls, String textNotification, String titleNotification, int drawable){

 /*NOTIFICATION VARS*/
        NotificationManager mNotificationManager;
        int SIMPLE_NOTIFICATION_ID = 1;
        //Toast.makeText(null, "alsfkjas lkfsalf", Toast.LENGTH_LONG).show();
        Notification notifyDetails= new Notification.Builder(context)
                .setContentTitle(titleNotification)
                .setSmallIcon(android.R.drawable.arrow_up_float)
                .build();
 /*NOTIFICATION INICIO*/
        mNotificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        //notifyDetails = new Notification.(drawable,titleNotification,System.currentTimeMillis());
        long[] vibrate = {100,100,200,300};
        notifyDetails.vibrate = vibrate;
        notifyDetails.defaults = Notification.DEFAULT_ALL;
        notifyDetails.flags |= Notification.FLAG_AUTO_CANCEL;

 /*NOTIFICATION FIN*/

        CharSequence contentTitle = titleNotification;
        CharSequence contentText = textNotification;

        Intent notifyIntent = new Intent(context, cls );

        notifyIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        PendingIntent intent = PendingIntent.getActivity(context, 0, notifyIntent, PendingIntent.FLAG_ONE_SHOT);

        notifyDetails.tickerText = textNotification;
        //notifyDetails.setLatestEventInfo(context, contentTitle, contentText, intent);

        try{
            mNotificationManager.notify(SIMPLE_NOTIFICATION_ID, notifyDetails);
        } catch(Exception e){

        }
    }

}
