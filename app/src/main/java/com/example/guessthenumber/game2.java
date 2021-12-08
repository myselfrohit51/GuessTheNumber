package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class game2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);

        Button button8 = findViewById(R.id.button8);
        TextView textView8 = findViewById(R.id.textView8);


        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editTextNumber2 = findViewById(R.id.editTextNumber2);

                try{
                    int number = 1 + (int)(25
                            * Math.random());


                    String g =editTextNumber2.getText().toString();
                    int guess = Integer.parseInt(g);


                    if(guess<0 || guess>25){
                        textView8.setText("Invalid input, number should be between 1 and 25");}

                    else{
                        if (number == guess) {
                            textView8.setText("Congo, you guessed the right number.");
                        }
                        else{
                            textView8.setText("Oops! Number was "+number+"\n"+"Try Again");
                        }
                    }
                }
                catch (Exception e){
                    textView8.setText("Invalid Input");
                }





            }
        });
    }
}