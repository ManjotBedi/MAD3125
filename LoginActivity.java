package com.example.macstudent.foodatdoor;


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
    Button btnSignUp;
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

        btnSignUp = findViewById(R.id.btnSignUp);
        btnSignUp.setOnClickListener(this);

        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
    }
    @Override

    public void onClick(View view) {

        if (view.getId() == btnLogin.getId()){
            String username = edtEmail.getText().toString();
            String password = edtPassword.getText().toString();

            if (username.equals("manjot") && password.equals("asdf")){
                Toast.makeText(this,"Login Successful",Toast.LENGTH_LONG).show();
                startActivity(new Intent(this, HomeActivity.class));
            }else{
                Toast.makeText(this,"Invalid username/password",Toast.LENGTH_LONG).show();
            }


        }else if(view.getId() == btnCancel.getId()){
            Toast.makeText(this,"Creating an account",Toast.LENGTH_LONG).show();

            finish();

        } else if (view.getId()== btnSignUp.getId()){
            Toast.makeText(this, "Sign Up", Toast.LENGTH_LONG).show();
            Intent SignUpIntent = new Intent(this,SignUp.class);
            startActivity(SignUpIntent);

        }
    }
}
