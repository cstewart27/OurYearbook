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

public class graduation4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graduation4);

        Button yearbookdashboard = (Button) findViewById(R.id.btndashboard1);

        yearbookdashboard.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick (View v) {
            Intent i = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(i);

        }
    });

    }

}






