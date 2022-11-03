package com.example.poo_formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void iniciarTest(View view){
        Intent iPantallaTest=new Intent(this, Pregunta.class);
        startActivity(iPantallaTest);
    }
    public void admin(View view){
        Intent iPantallaAdmin= new Intent(this, loginAdmin.class );
        startActivity(iPantallaAdmin);
    }
}