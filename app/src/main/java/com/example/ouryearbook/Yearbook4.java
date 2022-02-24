package com.example.ouryearbook;


import static com.example.ouryearbook.NOTIFICATION.CHANNEL_1_ID;
import static com.example.ouryearbook.NOTIFICATION.CHANNEL_2_ID;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

@RequiresApi(api = Build.VERSION_CODES.O)
public class Yearbook4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yearbook4);


        Button yearbookdashboard = (Button) findViewById(R.id.btndashboard);
        Button btntext= (Button) findViewById(R.id.btntext);
        Button btnplan= (Button) findViewById(R.id.btnplan);
        Button btnNotification = (Button) findViewById(R.id.btnNotification);

        btntext.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
            final TextView text  =(TextView) findViewById(R.id.txttext);
        text.setText("I play Tennis” ");

            }
        });

        btnplan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), graduation4.class);
                startActivity(i);


            }
        });

        yearbookdashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);


            }
        });
        btnNotification.setOnClickListener(new View.OnClickListener (){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), SendNotification.class);
                startActivity(i);


            }
        });


    }

}