package com.example.dell_09_027_pc.proyectomuseos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TipoActivity extends AppCompatActivity
{
    private Button nombre;
    private Button tipo;
    private Button ubicacion;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo);

        nombre = (Button) findViewById(R.id.buttonNombre);
        tipo = (Button) findViewById(R.id.buttonTipo);
        ubicacion = (Button) findViewById(R.id.buttonubicacion);

        nombre.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getApplicationContext(),NombreActivity.class);
                startActivity(i);
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
