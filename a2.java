package com.example.testmatch;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class a2 extends AppCompatActivity {
    EditText user;

    EditText pass;
    EditText email;
    EditText phone;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_a2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        user=findViewById(R.id.user);
        pass=findViewById(R.id.pass);
        email=findViewById(R.id.email);
        phone=findViewById(R.id.phone);

        if(user.getText().toString().isEmpty()){
            Toast.makeText(a2.this,"Please enter your username",Toast.LENGTH_SHORT).show();
        }
        if(pass.getText().toString().isEmpty()){
            Toast.makeText(a2.this,"Please enter your password",Toast.LENGTH_SHORT).show();
        }
        if(email.getText().toString().isEmpty()){
            Toast.makeText(a2.this,"Please enter your email",Toast.LENGTH_SHORT).show();
        }
        if(phone.getText().toString().isEmpty()){
            Toast.makeText(a2.this,"Please enter your phone number",Toast.LENGTH_SHORT).show();
        }
    }

}