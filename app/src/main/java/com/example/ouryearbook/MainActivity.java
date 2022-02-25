package com.example.ouryearbook;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mainBtn1 = (Button) findViewById(R.id.mainBtn1);
        Button mainBtn2 = (Button) findViewById(R.id.mainBtn2);
        Button mainBtn3 = (Button) findViewById(R.id.mainBtn3);
        Button mainBtn4 = (Button) findViewById(R.id.mainBtn4);

        mainBtn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(getApplicationContext(),Yearbook1.class);
                startActivity(i);
            }
        });

        mainBtn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(getApplicationContext(),Yearbook2.class);
                startActivity(i);
            }
        });

        mainBtn3.setOnClickListener(new View.OnClickListener(){
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v){
                Intent i = new Intent(getApplicationContext(),Yearbook3.class);
                startActivity(i);
            }
        });

        mainBtn4.setOnClickListener(new View.OnClickListener(){
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v){
                Intent i = new Intent(getApplicationContext(),Yearbook4.class);
                startActivity(i);
            }
        });



    }
}