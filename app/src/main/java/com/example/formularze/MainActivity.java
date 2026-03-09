package com.example.formularze;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editTextImie, editTextGatunek, editTextWaga;
    Spinner spinnerGromada;
    CheckBox checkBoxWymarle, checkBoxMiesko, checkBoxRosliny;
    RadioButton radioButtonDzien, radioButtonNoc;
    Switch aSwitch;
    SeekBar seekBar;
    Button buttonDodaj;
    TextView textViewKomunikat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        editTextGatunek = findViewById(R.id.editTextText);
        editTextImie = findViewById(R.id.editTextText2);
        editTextWaga = findViewById(R.id.editTextNumber);
        spinnerGromada = findViewById(R.id.spinner);
        checkBoxWymarle = findViewById(R.id.checkBox);
        checkBoxMiesko = findViewById(R.id.checkBox2);
        checkBoxRosliny = findViewById(R.id.checkBox3);
        radioButtonDzien = findViewById(R.id.radioButtondzienny);
        radioButtonNoc = findViewById(R.id.radioButtonnocny);
        aSwitch = findViewById(R.id.switch1);
        seekBar = findViewById(R.id.seekBar);
        buttonDodaj = findViewById(R.id.button);
        textViewKomunikat = findViewById(R.id.textViewKomunikat);
    }
}