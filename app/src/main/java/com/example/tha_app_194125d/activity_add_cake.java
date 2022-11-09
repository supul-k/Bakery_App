package com.example.tha_app_194125d;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class activity_add_cake extends AppCompatActivity {

    EditText name, desc , price;
    Button insert, update, delete , view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_cake);
    }
}