package com.example.newactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class activity_var extends AppCompatActivity implements View.OnClickListener{
    Button btnEnter;
    EditText Edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_var);

        Edit = findViewById(R.id.Edit);

        btnEnter = findViewById(R.id.btnEnter);

        btnEnter.setOnClickListener(this);
    }


    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnEnter:
                Intent intent = new Intent(this, Activity2d.class);
                intent.putExtra(Activity2d.EXTRA_DATA, Edit.getText().toString());
                startActivity(intent);
                finish();
                break;

        }
    }
}