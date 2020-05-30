package com.example.higher_or_lower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int n;
    public void repeat(String string){

        Toast.makeText(MainActivity.this,string,Toast.LENGTH_SHORT).show();
    }
    public void clicked(View view) {

            EditText num = (EditText) findViewById(R.id.num);
            //Log.i("Value:", String.valueOf(n));
            //Log.i("Value of:",num.getText().toString());
            int guess = Integer.parseInt(num.getText().toString());
            //Log.i("Value of:",String.valueOf(guess));
            guess = guess%10;
            Log.i("Value of:",String.valueOf(guess));
            if (guess > n) {
                repeat("Lower !");
            } else if (guess < n) {
                repeat("Higher !");
            } else {
                repeat("You Gotcha !!, Try again");
                Random rand = new Random();
                n = rand.nextInt(10);
            }
        }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        n = rand.nextInt(10);
    }
}
