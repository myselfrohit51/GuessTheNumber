package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class game8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game8);

        Button button19 = findViewById(R.id.button19);
        TextView textView21 = findViewById(R.id.textView21);

        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText editTextNumber7 = findViewById(R.id.editTextNumber7);

                try{

                    //int number = 1 + (int)(50
                    //       * Math.random()*());

                    Random rand = new Random();
                    int number = rand.nextInt(50);
                    number = (number * 2 + 1) % 100;


                    String g =editTextNumber7.getText().toString();
                    int guess = Integer.parseInt(g);



                    if(guess<0 || guess>100 || guess%2==0){
                        textView21.setText("Invalid input, number should be between 1 to 100 and even");}

                    else{
                        if (number == guess) {
                            textView21.setText("Congo, you guessed the right number.");
                        }
                        else{
                            textView21.setText("Oops! Number was "+number+"\n"+"Try Again");
                        }
                    }
                }
                catch (Exception e){
                    textView21.setText("Invalid Input");
                }


            }


        });
    }
}