package com.example.terrafund;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class signUp extends AppCompatActivity {


    TextView titleSignUp;
    EditText email;
    EditText pass;
    EditText confpass;
    private Bundle savedInstanceState;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.savedInstanceState = savedInstanceState;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        titleSignUp = findViewById(R.id.signUp_title);
        email = findViewById(R.id.email_adress);
        pass = findViewById(R.id.pass);
        confpass = findViewById(R.id.confpass);

    }
}