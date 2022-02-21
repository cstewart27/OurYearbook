package com.example.ouryearbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Yearbook4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yearbook4);

        Button yearbookdashboard = (Button) findViewById(R.id.btndashboard);
        Button btntext= (Button) findViewById(R.id.btntext);
        Button btnplan= (Button) findViewById(R.id.btnplan);

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
    }

}