package com.example.newactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnMove, btnMoveData, btnCall, btnWeb, btnTul;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMove = findViewById(R.id.btnMove);
        btnMove.setOnClickListener(this);

        btnMoveData = findViewById(R.id.btnMoveData);
        btnMoveData.setOnClickListener(this);

        btnCall = findViewById(R.id.btnCall);
        btnCall.setOnClickListener(this);

        btnWeb = findViewById(R.id.btnWeb);
        btnWeb.setOnClickListener(this);

        btnTul = findViewById(R.id.btnTul);
        btnTul.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnMove:
                Intent moveActivity = new Intent(this, MoveActivity.class);
                startActivity(moveActivity);
                break;

            case R.id.btnMoveData:
                Intent moveDataActivity = new Intent(this, MoveDataActivity.class);
                moveDataActivity.putExtra(MoveDataActivity.EXTRA_NAME, "Wildan Nat");
                moveDataActivity.putExtra(MoveDataActivity.EXTRA_AGE, 200);
                startActivity((moveDataActivity));
                break;

            case R.id.btnCall:
                String phoneNumber = "082222222222";
                Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(callIntent);
                break;

            case R.id.btnWeb:
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://ittelkom-pwt.ac.id/"));
                startActivity(intent);

            case R.id.btnTul:
                Intent activity_var = new Intent(this, activity_var.class);
                startActivity(activity_var);
                break;


        }
    }
}
