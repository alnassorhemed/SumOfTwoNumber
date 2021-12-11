package com.example.sumoftwonumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Num1,Num2;
    Button ButtonAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Num1=(EditText) findViewById(R.id.tex1);
        Num2=(EditText)findViewById(R.id.tex2);
        ButtonAdd=(Button)findViewById(R.id.btn);
        ButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String N1=Num1.getText().toString();
                String N2=Num2.getText().toString();
                int valu1=Integer.parseInt(N1);
                int value2=Integer.parseInt(N2);
                int Sum=valu1+value2;
                Toast.makeText(getApplicationContext(),String.valueOf(Sum),Toast.LENGTH_LONG).show();
            }
        });
    }
}