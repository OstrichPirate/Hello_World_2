package com.example.helloworld2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDisplayButton();
    }

    private void initDisplayButton() {
        Button displayButton = findViewById(R.id.buttonDisplay);
        displayButton.setOnClickListener(new View.OnClickListener () {

            @Override
            public void onClick(View view) {
                EditText editName = findViewById(R.id.editTextName);
                TextView textDisplay = findViewById(R.id.textViewDisplay);
                String nameToDisplay = editName.getText().toString();
                Resources res = getResources();
                String displayString = res.getString(R.string.welcome_message, nameToDisplay);
                textDisplay.setText(displayString);
            }
        });
    }
}