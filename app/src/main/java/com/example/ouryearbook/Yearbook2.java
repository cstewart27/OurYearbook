package com.example.ouryearbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Yearbook2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yearbook2);

        Button yearbook2Btn1 = (Button) findViewById(R.id.yearbook2Btn1);
        Button btnChangeText= (Button) findViewById(R.id.btnevent);
        Button btnGraduation= (Button) findViewById(R.id.btnGraduate);


        //this is how you get yearbook2 to return back to the dashboard
        yearbook2Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);


            }
        });

        btnChangeText.setOnClickListener(new View.OnClickListener(){
       @Override
          public void onClick(View view){
            final TextView textView  =(TextView) findViewById(R.id.KilluaText);
             textView.setText("The one who’s cursed is the one making wishes!” ");



                                             }


                                         });


                btnGraduation.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(getApplicationContext(), graduation2.class);
                        startActivity(i);


                    }
                });
}
}