package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class game7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game7);

        Button button18 = findViewById(R.id.button18);
        TextView textView20 = findViewById(R.id.textView20);

        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText editTextNumber6 = findViewById(R.id.editTextNumber6);

                try{

                    //int number = 1 + (int)(50
                    //       * Math.random()*());

                    Random rand = new Random();
                    int number = rand.nextInt(50);
                    number = (number * 2) % 100;


                    String g =editTextNumber6.getText().toString();
                    int guess = Integer.parseInt(g);



                    if(guess<0 || guess>100 || guess%2!=0){
                        textView20.setText("Invalid input, number should be between 1 to 100 and even");}

                    else{
                        if (number == guess) {
                            textView20.setText("Congo, you guessed the right number.");
                        }
                        else{
                            textView20.setText("Oops! Number was "+number+"\n"+"Try Again");
                        }
                    }
                }
                catch (Exception e){
                    textView20.setText("Invalid Input");
                }


            }

        });


    }
}