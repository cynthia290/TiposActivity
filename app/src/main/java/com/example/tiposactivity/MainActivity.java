package com.example.tiposactivity;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t = findViewById(R.id.txt);

        new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long l) {
                t.setText(String.valueOf(l/1000));
            }

            @Override
            public void onFinish() {
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                i.putExtra("Nombre", "Cynthia");
                startActivity(i);
                finish();
            }
        }.start();

    }
}
