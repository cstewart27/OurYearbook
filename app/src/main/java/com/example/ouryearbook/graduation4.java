package com.example.ouryearbook;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

public class graduation4<ResultActivity> extends AppCompatActivity {

        Button btnotification;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            //replaced .activity_main with .activity_graduation4
            //reason: fixes crash when clicking on the graduation plan button in yearbook4
            setContentView(R.layout.activity_graduation4);

            //btnotification = (Button)findViewById(R.id.btnotification);
            btnotification.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    addNotification();
                }
            });


            //moved from outside oncreate to inside oncreate
            Button yearbookdashboard1 = (Button) findViewById(R.id.btndashboard1);
            yearbookdashboard1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v){
                    Intent i=new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(i);
                }
            });


        }

        private void addNotification() {
            NotificationCompat.Builder builder =
                    new NotificationCompat.Builder(this)
                            .setContentTitle("Notifications Example")
                            .setContentText("This is a test notification");

            Intent notificationIntent = new Intent(this, MainActivity.class);
            PendingIntent contentIntent = PendingIntent.getActivity(this, 0, notificationIntent,
                    PendingIntent.FLAG_UPDATE_CURRENT);
            builder.setContentIntent(contentIntent);

            // Add as notification
            NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
            manager.notify(0, builder.build());
        }

    }





