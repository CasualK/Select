package com.example.select;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class select extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        TextView inform = (TextView) findViewById(R.id.info);

        Intent intent = getIntent();
        int lip_no = intent.getIntExtra("LIPS_CODE",0);

        inform.setText(String.valueOf(lip_no));
    }

}

