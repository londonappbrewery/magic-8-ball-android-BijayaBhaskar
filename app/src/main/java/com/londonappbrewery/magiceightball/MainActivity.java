package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton = findViewById(R.id.askButtion);
        final ImageView eightBallImage = findViewById(R.id.image_eightBall);

        final int[] ballArrStrings = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5 };
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random randomNumberGenerator = new Random();

                int number = randomNumberGenerator.nextInt(4);
                Log.d("Eight Ball","Number generated is :"+number);
                eightBallImage.setImageResource(ballArrStrings[number]);
            }
        });

    }

}
