package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class game3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game3);

        Button button9 = findViewById(R.id.button9);
        TextView textView10 = findViewById(R.id.textView10);


        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editTextNumber3 = findViewById(R.id.editTextNumber3);


                try{
                    int number = 1 + (int)(50
                            * Math.random());


                    String g =editTextNumber3.getText().toString();
                    int guess = Integer.parseInt(g);


                    if(guess<0 || guess>50){
                        textView10.setText("Invalid input, number should be between 1 and 50");}

                    else{
                        if (number == guess) {
                            textView10.setText("Congo, you guessed the right number.");
                        }
                        else{
                            textView10.setText("Oops! Number was "+number+"\n"+"Try Again");
                        }
                    }
                }
                catch (Exception e){
                    textView10.setText("Invalid Input");
                }





            }
        });
    }
}