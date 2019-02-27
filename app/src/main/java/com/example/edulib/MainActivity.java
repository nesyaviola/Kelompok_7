package com.example.edulib;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar ab = getSupportActionBar();
        ab.hide();
        TextView textView_link=findViewById(R.id.tv_signin);
        textView_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
            }
        });


    }


    public void onClick(View view) {

        EditText f_name = findViewById(R.id.f_name);
        EditText l_name = findViewById(R.id.l_name);
        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);
        EditText confirm_pass = findViewById(R.id.confirm_pass);

        if (!f_name.getText().toString().equals("") && !l_name.getText().toString().equals("") &&
        !username.getText().toString().equals("") && !password.getText().toString().equals("") &&
                !confirm_pass.getText().toString().equals("")){
            Intent intent = new Intent(this, Login.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(getApplicationContext(),"Lengkapi Form Dahulu!",Toast.LENGTH_LONG).show();
        }
    }

}
