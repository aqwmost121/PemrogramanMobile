package com.example.newactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity2d extends AppCompatActivity {

    public static final String EXTRA_DATA = "Kosong";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2d);

        TextView Daata = findViewById(R.id.received_data);

        Daata.setText(getIntent().getStringExtra(EXTRA_DATA));
    }
}
