package com.example.pintu.logindemo;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {


    private EditText UserName;
    private EditText Password;
    private Button Login;
    private Button CreateNewAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        UserName =(EditText) findViewById(R.id.etlogin);
        Password =(EditText) findViewById(R.id.etpassword);
        Login =(Button) findViewById(R.id.btLogin);
        CreateNewAccount =(Button) findViewById(R.id.btCreateNwAccnt);

        CreateNewAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent createNewAccountIntent = new Intent(login.this, createAccount.class);
                login.this.startActivity(createNewAccountIntent);
        }
        });

    }
}
