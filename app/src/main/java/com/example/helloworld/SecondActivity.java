package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView txtUsername, txtPassword;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        txtUsername = findViewById(R.id.txtUsername);
        txtPassword = findViewById(R.id.txtPassword);

        Bundle bundle= getIntent().getExtras();

        if(bundle!=null){
            String strusername =bundle.getString("Username");
            String strpassword =bundle.getString("Password");

            txtUsername.setText(strusername);
            txtPassword.setText(strpassword);

        }

    }
}