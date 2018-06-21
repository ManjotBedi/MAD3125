package com.example.macstudent.day3;


import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnLogin;
    Button btnCancel;
    EditText edtEmail;
    EditText edtPassword;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(this);

        btnCancel = findViewById(R.id.btnCancel);
        btnCancel.setOnClickListener(this);

        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
    }
    @Override

    public void onClick(View view) {

        if (view.getId() == btnLogin.getId()){
            String username = edtEmail.getText().toString();
            String password = edtPassword.getText().toString();

            if (username.equals("mad@summer.com") && password.equals("qwer")){
                Toast.makeText(this,"Login Successful",Toast.LENGTH_LONG).show();
                startActivity(new Intent(this, HomeActivity.class));
            }else{
                Toast.makeText(this,"Invalid username/password",Toast.LENGTH_LONG).show();
            }


        }else if(view.getId() == btnCancel.getId()){
            Toast.makeText(this,"Creating an account",Toast.LENGTH_LONG).show();

            Intent signUpIntent = new Intent(this,HomeActivity.class);
            startActivity(signUpIntent);
        }
    }
}

