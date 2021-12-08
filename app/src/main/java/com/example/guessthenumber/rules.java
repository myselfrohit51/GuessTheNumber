package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class rules extends AppCompatActivity {

    public static final String rtn = "com.example.guessthenumber.rtn";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.gtn);

        TextView textView2 = findViewById(R.id.textView2);
        textView2.setText(message);

    }
    public void gamepl(View view){
        Intent intent = new Intent(this,transfer.class);
        startActivity(intent);
        finish();
    }
}
