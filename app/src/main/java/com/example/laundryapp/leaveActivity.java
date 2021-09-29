package com.example.laundryapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class leaveActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView btn_menuhome;
    ImageView btn_menucontent;
    ImageView btn_menuleave;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.laundry_leave_customer);

        btn_menuhome = findViewById(R.id.btn_menuhome);
        btn_menucontent = findViewById(R.id.btn_menucontent);
        btn_menuleave = findViewById(R.id.btn_menuput);
        SetListener();
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_menuhome:
                Intent intent = new Intent(leaveActivity.this,chklocationActivity.class);
                finish();
                startActivity(intent);
                break;
            case R.id.btn_menucontent:
                Intent intent2 = new Intent(leaveActivity.this,viewcontentActivity.class);
                finish();
                startActivity(intent2);
                break;
            case R.id.btn_menuput:
                Intent intent3 = new Intent(leaveActivity.this,leaveActivity.class);
                finish();
                startActivity(intent3);
                break;
        }
    }

    public void SetListener()
    {
        btn_menuhome.setOnClickListener(this);
        btn_menucontent.setOnClickListener(this);
        btn_menuleave.setOnClickListener(this);
    }

}
