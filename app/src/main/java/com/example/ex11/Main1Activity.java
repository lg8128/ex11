package com.example.ex11;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main1Activity extends AppCompatActivity {
    TextView tV;
    Intent gi;
    @SuppressLint("MissingInflatedID")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        gi = getIntent();
        tV = (TextView) findViewById(R.id.tV);
        Double x1=gi.getDoubleExtra("res",-1);
        tV.setText("the last result: " + x1+"");
    }

    public void btnBack(View view) {
        finish();
    }
}