package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns; // Import the Patterns class
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText firstName;
    EditText lastName;
    EditText email;
    EditText phno;
    CheckBox agreeCheckbox;
    Button register;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstName = findViewById(R.id.firstname);
        lastName = findViewById(R.id.lastname);
        email = findViewById(R.id.email);
        phno = findViewById(R.id.phno);
        agreeCheckbox = findViewById(R.id.checkBox);
        register = findViewById(R.id.register);

        register.setEnabled(false);
        agreeCheckbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (agreeCheckbox.isChecked()) {
                    register.setEnabled(true);
                } else {
                    register.setEnabled(false);
                }
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkDataEntered()) {
                    Intent intent = new Intent(MainActivity.this, Registration.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "Registration successful", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }

    boolean isEmpty(EditText text) {
        CharSequence str = text.getText().toString();
        return TextUtils.isEmpty(str);
    }

    // New method to check if the email address is valid
    boolean isEmail(EditText text) {
        CharSequence email = text.getText().toString();
        return (!TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }

    boolean checkDataEntered(){
//        if (isEmpty(firstName)) {
//            firstName.setError("First name is required");
//            return false;
//        }
//
//        if (isEmpty(lastName)) {
//            lastName.setError("Last name is required");
//            return false;
//        }
//
//        if (isEmpty(email)) {
//            email.setError("Email is required");
//            return false;
//        } else if (!isEmail(email)) { // Check if the email is valid
//            email.setError("Invalid email address");
//            return false;
//        }
//
//        if (isEmpty(phno)) {
//            phno.setError("Phone number is required");
//            return false;
//        }

        return true;
    }
}
