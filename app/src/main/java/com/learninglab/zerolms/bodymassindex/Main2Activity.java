package com.learninglab.zerolms.bodymassindex;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Intent it = getIntent();

        if (it !=null) {

            TextView result = findViewById(R.id.result);
            TextView wordsOfJoy = findViewById(R.id.textView2);
            DecimalFormat df = new DecimalFormat();

            double BMI;
            Bundle b = it.getExtras();
            if (b != null) {

                BMI = b.getDouble("key");

            }

            else {

                BMI = 100;
            }

            result.setText(BMI + "");

            Log.d("The BMI is: ", BMI + "");

            if (BMI > 25) {

                wordsOfJoy.setText("DAYUM BRO!!! You gonna break them chairs dawg!!!!");

            } else if (BMI < 25 && BMI > 18.5) {

                wordsOfJoy.setText("Keep up the good work.");

            } else {

                wordsOfJoy.setText("Mother Earth Thanks You For Considering Her Burdens!!!");

            }
        }
    }
}

