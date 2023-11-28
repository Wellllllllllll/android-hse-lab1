package com.example.hselab1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText colorEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colorEditText = findViewById(R.id.colorEditText);
        Button launchButton = findViewById(R.id.launchButton);

        launchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selectedColor = colorEditText.getText().toString().toLowerCase();

                if (selectedColor.equals("red") || selectedColor.equals("green") || selectedColor.equals("blue")) {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("color", selectedColor);
                    startActivity(intent);
                }
            }
        });
    }
}
