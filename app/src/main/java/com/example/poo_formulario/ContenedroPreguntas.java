package com.example.poo_formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class ContenedroPreguntas extends AppCompatActivity {
    private ArrayList<Pregunta> array_preguntas;
    private Button btn_previous, btn_next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenedro_preguntas);

        btn_previous = findViewById(R.id.btn_previus);


        btn_next = findViewById(R.id.btn_next);




        //Creamos las preguntas
        //array_preguntas.add(new Pregunta(1, R.drawable.iracamadistintashoras, "En las noches me acuesto (o voy a la cama) a diferentes horas"));
        //array_preguntas.add(new Pregunta(2, R.drawable.ejercicioantesdedormir,"Una hora antes de ir a dormir realizo ejercicio físico"));


    }
    public void onClick(View view){
        switch (view.getId()){
            case R.id.btn_next:

                break;
            case R.id.btn_previus:

                break;
        }
    }

}