package com.example.convertify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private RadioButton radioDinarToEuro;
    private EditText inputEditText;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioDinarToEuro = findViewById(R.id.radio_dinar_to_euro);
        inputEditText = findViewById(R.id.edit_float);
        resultTextView = findViewById(R.id.text_result);
    }

    public void onConvertButtonClicked(View view) {
        float inputValue = Float.parseFloat(inputEditText.getText().toString());
        float result;

        if (radioDinarToEuro.isChecked()) {
            result = dinarsToEuro(inputValue);
        } else {
            result = euroToDinars(inputValue);
        }

        resultTextView.setText(String.valueOf(result));
    }

    private float dinarsToEuro(float valeurDinar) {
        return (float) (valeurDinar / 1.47);
    }

    private float euroToDinars(float valeurEuro) {
        return (float) (valeurEuro * 1.47);
    }
}