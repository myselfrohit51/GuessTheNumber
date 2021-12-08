package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class transfer extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);
    }
    public void ten(View view){
        Intent intent = new Intent(this,game.class);
        startActivity(intent);
        //finish();
    }


    public void twenty(View view){
        Intent intent = new Intent(this,game2.class);
        startActivity(intent);
        //finish();
    }

    public void fifty(View view){
        Intent intent = new Intent(this,game3.class);
        startActivity(intent);
       // finish();
    }

    public void hundred(View view){
        Intent intent = new Intent(this,game4.class);
        startActivity(intent);
        // finish();
    }

    public void next(View view){
        Intent intent = new Intent(this,transfer2.class);
        startActivity(intent);
        // finish();
    }
}