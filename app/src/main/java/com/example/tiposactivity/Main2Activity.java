package com.example.tiposactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Bundle bt = getIntent().getExtras();

        txt1 = findViewById(R.id.txtnombre);

        String t = getIntent().getStringExtra("nombre");

        //String t = bt.getString("nombre")

        //String t = getIntent().getExtras().getString("nombre");
        txt1.setText(t);

    }



}
