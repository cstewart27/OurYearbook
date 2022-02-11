package com.example.ouryearbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class graduation1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graduation1);

        Button graduation1Btn1 = (Button) findViewById(R.id.graduation1Btn1);
        Button graduation1Btn2 = (Button) findViewById(R.id.graduation1Btn2);


        graduation1Btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(getApplicationContext(),Yearbook1.class);
                startActivity(i);
            }
        });

        graduation1Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });


    }
}