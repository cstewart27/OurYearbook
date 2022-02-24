package com.example.ouryearbook;

import static android.widget.Toast.LENGTH_SHORT;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Yearbook1 extends AppCompatActivity {



    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yearbook1);

        Button yearbook1Btn1 = (Button) findViewById(R.id.yearbook1Btn1);
        Button yearbook1Btn2 = (Button) findViewById(R.id.yearbook1Btn2);
        Button yearbook1Btn3 = (Button) findViewById(R.id.yearbook1Btn3);
        Button yearbook1Btn4 = (Button) findViewById(R.id.yearbook1Btn4);
        ImageButton ImageBtn1 = (ImageButton) findViewById(R.id.ImageBtn1);
        TextView yearbook1TextView1 = (TextView) findViewById(R.id.yearbook1TextView1);
        Uri LegoBatman = Uri.parse("app/src/main/res/drawable/legobatman.jpeg");
        createNotificationChannel();



        yearbook1Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick (View v){
                yearbook1TextView1.setText("superhero best the is Batman");
            }

        });

        yearbook1Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
        yearbook1Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), graduation1.class);
                startActivity(i);
            }
        });

        ImageBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imgView1 = (ImageView) findViewById(R.id.imageView);
                BitmapDrawable drawable = (BitmapDrawable)imgView1.getDrawable();
                Bitmap bitmap = drawable.getBitmap();
                String bitmapPath = MediaStore.Images.Media.insertImage(getContentResolver(), bitmap, "LegoBatman", null);
                Uri uri = Uri.parse(bitmapPath);
                Intent myIntent = new Intent();
                myIntent.setAction(Intent.ACTION_SEND);
                myIntent.setType("image/jpeg");
                myIntent.putExtra(Intent.EXTRA_STREAM, uri);
                startActivity(Intent.createChooser(myIntent, "Share Image Using:"));
            }
        });

        yearbook1Btn4.setOnClickListener(v -> {


                Toast.makeText(Yearbook1.this,"Reminder Set!", LENGTH_SHORT).show();
                Intent intent = new Intent(Yearbook1.this,ReminderBroadcast.class);
                PendingIntent pendingIntent = PendingIntent.getBroadcast(Yearbook1.this, 0, intent, 0);

                AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);

                long timeAtButtonClick = System.currentTimeMillis();
                long  thirtySecondsInMillis= 30000;

                alarmManager.set(AlarmManager.RTC_WAKEUP,
                timeAtButtonClick + thirtySecondsInMillis,
                        pendingIntent);
        });


    }

    //function to create notification
    private void createNotificationChannel() {

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            CharSequence name = "yearbook1ReminderChannel";
            String description = "Channel for yearbook1 Remninder";
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel("notifyUser", name, importance);
            channel.setDescription(description);

            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }

    }
}