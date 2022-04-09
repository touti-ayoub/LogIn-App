package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username =(TextView) findViewById(R.id.username);
        TextView password =(TextView) findViewById(R.id.password);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);

        //admin and admin

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("admin")&& password.getText().toString().equals("admin")){
                    //correct login
                    Toast.makeText(MainActivity.this,"LOG IN SUCCESSFUL", Toast.LENGTH_SHORT).show();
                    weclomepage();
                } else{
                    //incorrect
                    Toast.makeText(MainActivity.this,"LOG IN FAILED", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    public void weclomepage(){
        Intent intent = new Intent(this, welcome.class);
        startActivity(intent);
    }
}