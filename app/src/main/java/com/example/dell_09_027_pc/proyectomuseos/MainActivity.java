package com.example.dell_09_027_pc.proyectomuseos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{

    private Button nombre;
    private Button tipo;
    private Button ubicacion;
    private ListaDeMuseos mListaDeMuseos;
    private int LISTADO_DE_MUSEOS=1;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Lista_entrada> datos = new ArrayList<Lista_entrada>();

        nombre = (Button) findViewById(R.id.buttonNombre);
        tipo = (Button) findViewById(R.id.buttonTipo);
        ubicacion = (Button) findViewById(R.id.buttonubicacion);

        JSONAsyncTask miJSONAsyncTask = new JSONAsyncTask();


        nombre.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getApplicationContext(),NombreActivity.class);
                i.putExtra("LISTASERIALIZABLE", (Serializable) mListaDeMuseos);
                startActivityForResult(i,LISTADO_DE_MUSEOS);
            }
        });

        tipo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),TipoActivity.class);
                startActivity(i);
            }
        });

        ubicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),UbicacionActivity.class);
                startActivity(i);
            }
        });




    }
}
