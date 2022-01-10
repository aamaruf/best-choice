package com.example.foodapp;

import android.content.Intent;
import android.os.Bundle;
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


        alreadysignin = findViewById(R.id.returnMenuItem);
        signupBtn = findViewById(R.id.signinBtn);
        signupPassword = findViewById(R.id.signInPassword);
        signupEmailAddress = findViewById(R.id.signInEmail);


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
            if (email.length() > 0 && password.length() > 0) {
                if (signUp(email, password)) {
//                Intent intent = new Intent(SignUpActivity.this, HomeActivity.class);
                    Intent intent = new Intent(SignUpActivity.this, SignInActivity.class);
                    startActivity(intent);
                    Toast.makeText(SignUpActivity.this, "Signing Up Success!", Toast.LENGTH_LONG).show();
                    finish();
                } else {
                    Toast.makeText(SignUpActivity.this, "Signing Failed!", Toast.LENGTH_LONG).show();
                }
            }else{
                Toast.makeText(SignUpActivity.this, "Required fields are empty!", Toast.LENGTH_LONG).show();
            }


        });
    }
}