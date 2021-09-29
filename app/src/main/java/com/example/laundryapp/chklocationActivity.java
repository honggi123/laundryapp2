package com.example.laundryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class chklocationActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView btn_menuhome;
    ImageView btn_menucontent;
    ImageView btn_menuleave;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.laundrylocation_boss);

        btn_menuhome = findViewById(R.id.btn_menuhome);
        btn_menucontent = findViewById(R.id.btn_menucontent);
        btn_menuleave = findViewById(R.id.btn_menuput);
        SetListener();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_menuhome:
                Intent intent = new Intent(chklocationActivity.this,chklocationActivity.class);
                finish();
                startActivity(intent);
                break;
            case R.id.btn_menucontent:
                Intent intent2 = new Intent(chklocationActivity.this,viewcontentActivity.class);
                finish();
                startActivity(intent2);
                break;
            case R.id.btn_menuput:
                Intent intent3 = new Intent(chklocationActivity.this,leaveActivity.class);
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