package com.example.foodapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignInActivity extends EmailPasswordActivity {
    TextView notregistered;
    Button signinBtn;
    EditText signInPassword;
    EditText signInEmail;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        getSupportActionBar().setTitle("Signin");


        notregistered = findViewById(R.id.notregistered);
        signinBtn = findViewById(R.id.signinBtn);
        signInEmail = findViewById(R.id.signInEmail);
        signInPassword = findViewById(R.id.signInPassword);


        notregistered.setOnClickListener(view -> {
//                Toast.makeText(MainActivity.this, "clicked signin", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(SignInActivity.this, SignUpActivity.class);
            startActivity(intent);
        });

        signinBtn.setOnClickListener(view -> {
//            this.signIn();
            String email = signInEmail.getText().toString();
            String password = signInPassword.getText().toString();
            if (email.length() > 0 && password.length() > 0) {
                signIn(email, password);
//                if (this.signedIn) {
////                Intent intent = new Intent(SignUpActivity.this, HomeActivity.class);
//                    Toast.makeText(SignInActivity.this, "Signing Failed!", Toast.LENGTH_LONG).show();
//                    Intent intent = new Intent(SignInActivity.this, MenuItemActivity.class);
//                    startActivity(intent);
//                    finish();
//                } else {
////                    Toast.makeText(SignInActivity.this, "Signing Failed!", Toast.LENGTH_LONG).show();
//                }
            } else {

                Toast.makeText(SignInActivity.this, "Required fields are empty!", Toast.LENGTH_LONG).show();
            }


        });
    }
}