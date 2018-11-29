package com.morinscompany.lesson1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        randomColor();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    protected void onResume() {
        super.onResume();

        randomColor();
    }

    public void randomColor() {
        Random random = new Random();
        int[] colors = {Color.BLUE, Color.GREEN, Color.MAGENTA, Color.RED, Color.CYAN};
        int pos = random.nextInt(colors.length);

        LinearLayout mainLayout = findViewById(R.id.mainLayout);
        mainLayout.setBackgroundColor(colors[pos]);
    }

    public void onButtonPress(View view) {
        TextView textView = (TextView) findViewById(R.id.textView);
        Button button = (Button) findViewById(R.id.button);

        textView.setText("Hello this text has changed");
        button.setBackgroundColor(Color.GREEN);

    }
}
