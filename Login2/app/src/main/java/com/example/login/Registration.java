package com.example.login;

import android.annotation.SuppressLint;
import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Registration extends AppCompatActivity {

    private EditText emailEditText;
    private EditText passwordEditText;
    private Button loginButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        emailEditText = findViewById(R.id.emailEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = emailEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();

                if (email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(Registration.this, "Please enter email and password", Toast.LENGTH_SHORT).show();
                } else if (!email.equals("example@example.com") || !password.equals("password123")) {
                    Toast.makeText(Registration.this, "Incorrect email or password", Toast.LENGTH_SHORT).show();
                } else {
                    // Login successful, do something here
                    Toast.makeText(Registration.this, "Login successful", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
