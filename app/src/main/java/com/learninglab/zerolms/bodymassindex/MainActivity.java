package com.learninglab.zerolms.bodymassindex;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Button Calculate;
        Calculate = findViewById(R.id.calculate);
        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText height = findViewById(R.id.height);
                EditText weight = findViewById(R.id.weight);
                DecimalFormat df = new DecimalFormat("##.00");

                double h = Double.parseDouble(height.getText().toString());
                double w = Double.parseDouble(weight.getText().toString());
                double h2 = (h*h)/10000;
                double result = (w / h2);

                Log.d("The result is", result +"");

                Intent startIntent = new Intent(MainActivity.this, Main2Activity.class);
                Bundle b = new Bundle();
                b.putDouble("key", result);
                startIntent.putExtras(b);
                startActivity(startIntent);

            }
        });
    }
}
