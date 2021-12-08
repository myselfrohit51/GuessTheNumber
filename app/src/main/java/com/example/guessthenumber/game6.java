package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class game6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game6);

        Button button17 = findViewById(R.id.button17);
        TextView textView17 = findViewById(R.id.textView17);

        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText editTextNumber5 = findViewById(R.id.editTextNumber5);

                try{

                    //int number = 1 + (int)(50
                    //       * Math.random()*());

                    Random rand = new Random();
                    int number = rand.nextInt(25);
                    number = (number * 2 + 1) % 100;


                    String g =editTextNumber5.getText().toString();
                    int guess = Integer.parseInt(g);



                    if(guess<0 || guess>50 || guess%2==0){
                        textView17.setText("Invalid input, number should be between 1 to 50 and odd");}

                    else{
                        if (number == guess) {
                            textView17.setText("Congo, you guessed the right number.");
                        }
                        else{
                            textView17.setText("Oops! Number was "+number+"\n"+"Try Again");
                        }
                    }
                }
                catch (Exception e){
                    textView17.setText("Invalid Input");
                }


            }

        });


    }
}