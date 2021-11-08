package com.example.word;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity {

    EditText c;
    EditText b;
    EditText a;
    EditText d;
    EditText e;
    EditText f;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }


    public void sA(View view) {
        EditText a =  findViewById(R.id.ed);
        EditText b =  findViewById(R.id.ed0);
        EditText c =  findViewById(R.id.ed1);
        EditText d =  findViewById(R.id.ed2);
        EditText e =  findViewById(R.id.ed3);
        EditText f =  findViewById(R.id.ed4);

        String fa=a.getText().toString();
        String fb=b.getText().toString();
        String fc=c.getText().toString();
        String fd=d.getText().toString();
        String fe=e.getText().toString();
        String ff=f.getText().toString();






        TextView r =findViewById(R.id.tv4);


        r.setText(fa+"/"+fb+"/"+fc+"     "+fd+":"+fe+":"+ff);






    }
}

