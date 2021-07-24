package com.example.atry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class adnext extends AppCompatActivity {
    EditText name_input,serial_input,type_input,email_input,ime_input;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adnext);
        name_input=findViewById(R.id.name);
        serial_input=findViewById(R.id.serial);
        type_input=findViewById(R.id.type);
        email_input=findViewById(R.id.email);
        ime_input=findViewById(R.id.ime);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user usr= new user(adnext.this);
                usr.addnext(type_input.getText().toString().trim(),
                name_input.getText().toString().trim(),
                        serial_input.getText().toString().trim(),
                        email_input.getText().toString().trim(),
                        ime_input.getText().toString().trim());
            }
        });
    }
}