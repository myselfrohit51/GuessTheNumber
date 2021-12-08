package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class game4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game4);

        Button button10 = findViewById(R.id.button10);
        TextView textView11 = findViewById(R.id.textView11);


        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editTextNumber4 = findViewById(R.id.editTextNumber4);


                try{
                    int number = 1 + (int)(100
                            * Math.random());


                    String g =editTextNumber4.getText().toString();
                    int guess = Integer.parseInt(g);


                    if(guess<0 || guess>100){
                        textView11.setText("Invalid input, number should be between 1 and 100");}

                    else{
                        if (number == guess) {
                            textView11.setText("Congo, you guessed the right number.");
                        }
                        else{
                            textView11.setText("Oops! Number was "+number+"\n"+"Try Again");
                        }
                    }
                }
                catch (Exception e){
                    textView11.setText("Invalid Input");
                }





            }
        });
    }
}