package com.example.myviewandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
Button btnD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnD = findViewById(R.id.btnD);
        btnD.setOnClickListener(this);
        if (getSupportActionBar()!=null){
            getSupportActionBar().setTitle("Penerbangan");
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnD:
                Intent intent = new Intent(this, SignUpApp.class);
                startActivity(intent);
                break;
        }
    }
}
