package com.example.poo_formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class loginAdmin extends AppCompatActivity {
    EditText et1, et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_admin);
        et1=findViewById(R.id.txt_userName);
        et2=findViewById(R.id.txt_password);
        SharedPreferences preferencias = getSharedPreferences("usuarios",MODE_PRIVATE);
        SharedPreferences.Editor editor=preferencias.edit();
        editor.putString("usuario","william");
        editor.putString("contraseña","12345");
        editor.commit();
    }

    public void login(View view){
        SharedPreferences preferencias = getSharedPreferences("usuarios",MODE_PRIVATE);
        String user=preferencias.getString("usuario","");

        if (et1.getText().length()==0){
            Toast.makeText(this, "Debe ingresar el nombre de usuario",Toast.LENGTH_SHORT).show();
        }
        if ((et2.getText().length()==0)){
            Toast.makeText(this, "Debe ingresar la contraseña",Toast.LENGTH_SHORT).show();
        }

        if ((!et1.getText().toString().equals(""))&&(!et2.getText().toString().equals(""))){
            if (et1.getText().toString().equals(user)){
                Toast.makeText(this,"Bienvenido a la zona de trabajo", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Este usario no existe",Toast.LENGTH_SHORT).show();
            }
        }


    }

}