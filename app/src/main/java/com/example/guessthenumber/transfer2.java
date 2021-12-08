package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class transfer2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer2);
    }
    public void even(View view){
        Intent intent = new Intent(this,game5.class);
        startActivity(intent);
        //finish();
    }

    public void odd(View view){
        Intent intent = new Intent(this,game6.class);
        startActivity(intent);
        //finish();
    }

    public void even1(View view){
        Intent intent = new Intent(this,game7.class);
        startActivity(intent);
        //finish();
    }

    public void odd1(View view){
        Intent intent = new Intent(this,game8.class);
        startActivity(intent);
        //finish();
    }
}