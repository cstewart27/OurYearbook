package com.example.ouryearbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

        mainBtn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(getApplicationContext(),Yearbook4.class);
                startActivity(i);
            }
        });

    }
}