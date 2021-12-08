package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class game extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Button button3 = findViewById(R.id.button3);
        TextView textView6 = findViewById(R.id.textView6);


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editTextNumber = findViewById(R.id.editTextNumber);


                try{
                    int number = 1 + (int)(10
                            * Math.random());


                    String g =editTextNumber.getText().toString();
                    int guess = Integer.parseInt(g);


                    if(guess<0 || guess>10){
                        textView6.setText("Invalid input, number should be between 1 and 10");
                    }

                    else{
                        if (number == guess) {
                            textView6.setText("Congo, you guessed the right number.");
                        }
                        else{
                            textView6.setText("Oops! Number was "+number+"\n"+"Try Again");
                        }
                    }
                }
                catch (Exception e){
                    textView6.setText("Invalid Input");
                }







            }
        });


    }

}
