package com.example.ouryearbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Yearbook1 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yearbook1);

        Button yearbook1Btn1 = (Button) findViewById(R.id.yearbook1Btn1);
        Button yearbook1Btn2 = (Button) findViewById(R.id.yearbook1Btn2);
        Button yearbook1Btn3 = (Button) findViewById(R.id.yearbook1Btn3);
        ImageButton ImageBtn1 = (ImageButton) findViewById(R.id.ImageBtn1);
        TextView yearbook1TextView1 = (TextView) findViewById(R.id.yearbook1TextView1);
        Uri LegoBatman = Uri.parse("app/src/main/res/drawable/legobatman.jpeg");
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








    }
}