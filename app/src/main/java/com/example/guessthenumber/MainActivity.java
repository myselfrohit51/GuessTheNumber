package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String gtn = "com.example.guessthenumber.gtn";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void start(View view){
        Intent intent = new Intent(this,rules.class);
        String message = "Rules: \n\n"
                +"You have to guess a number that should be equal to the number guessed by your device randomly." +
                " There are four option available. Choose anyone option and start guessing. If you guess the correct number, a congo message will be displayed and if you are incorrect try again" +
                " message will be displayed along with the correct number." +
                " You can try as many times as you want. Erase the previous number and enter a new number.\n";


        intent.putExtra(gtn,message);
        startActivity(intent);
        finish();
    }
}



