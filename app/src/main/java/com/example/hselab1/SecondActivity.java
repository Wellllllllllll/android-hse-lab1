package com.example.hselab1;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String color = getIntent().getStringExtra("color");

        if (color != null) {
            View layout = findViewById(R.id.secondActivityLayout);

            switch (color) {
                case "red":
                    layout.setBackgroundColor(getResources().getColor(R.color.colorRed));
                    break;
                case "green":
                    layout.setBackgroundColor(getResources().getColor(R.color.colorGreen));
                    break;
                case "blue":
                    layout.setBackgroundColor(getResources().getColor(R.color.colorBlue));
                    break;
            }
        }
    }
}
