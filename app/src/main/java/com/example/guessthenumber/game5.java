package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class game5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game5);
        Button button16 = findViewById(R.id.button16);
        TextView textView15 = findViewById(R.id.textView15);

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editTextNumberSigned = findViewById(R.id.editTextNumberSigned);

                try{

                    //int number = 1 + (int)(50
                    //       * Math.random()*());

                    Random rand = new Random();
                    int number = rand.nextInt(25);
                    number = (number * 2) % 100;


                    String g =editTextNumberSigned.getText().toString();
                    int guess = Integer.parseInt(g);



                    if(guess<0 || guess>50 || guess!=0){
                        textView15.setText("Invalid input, number should be between 1 to 50 and even");}

                    else{
                        if (number == guess) {
                            textView15.setText("Congo, you guessed the right number.");
                        }
                        else{
                            textView15.setText("Oops! Number was "+number+"\n"+"Try Again");
                        }
                    }
                }
                catch (Exception e){
                    textView15.setText("Invalid Input");
                }


            }
        });
    }
}