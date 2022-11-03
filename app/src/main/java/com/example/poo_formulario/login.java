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
<<<<<<< HEAD
        Intent iPantallaTest=new Intent(this, ContenedroPreguntas.class);
=======
        Intent iPantallaTest=new Intent(this, Pregunta.class);
>>>>>>> 5fcdc0ed3ba9c7b247526042dd4980241a6120c2
        startActivity(iPantallaTest);
    }
    public void admin(View view){
        Intent iPantallaAdmin= new Intent(this, loginAdmin.class );
        startActivity(iPantallaAdmin);
    }
}