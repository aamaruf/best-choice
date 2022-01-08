package com.example.foodapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class SignUpActivity extends EmailPasswordActivity {
    TextView alreadysignin;
    Button signupBtn;
    EditText signupPassword;
    EditText signupEmailAddress;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Signup");


        alreadysignin = findViewById(R.id.alreadysignin);
        signupBtn = findViewById(R.id.signupBtn);
        signupPassword = findViewById(R.id.signupPassword);
        signupEmailAddress = findViewById(R.id.signupEmailAddress);


        alreadysignin.setOnClickListener(view -> {
//                Toast.makeText(MainActivity.this, "clicked signin", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(SignUpActivity.this, SignInActivity.class);
            startActivity(intent);
        });
//       on click Signup Button
        signupBtn.setOnClickListener(view -> {
//                Toast.makeText(SignUpActivity.this, "Signing Up Success!", Toast.LENGTH_LONG).show();
//                if ()
            String email = signupEmailAddress.getText().toString();
            String password = signupPassword.getText().toString();
            if (signUp(email, password)) {
                Intent intent = new Intent(SignUpActivity.this, HomeActivity.class);
                startActivity(intent);
                Toast.makeText(SignUpActivity.this, "Signing Up Success!", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(SignUpActivity.this, "Signing Failed!", Toast.LENGTH_LONG).show();
            }
        });
    }
}