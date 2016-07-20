package com.example.dell_09_027_pc.proyectomuseos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Item> category = new ArrayList<Item>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Lista_entrada> datos = new ArrayList<Lista_entrada>();

        datos.add(new Lista_entrada(R.drawable.casa_de_jovellanos, "Museo Jovellanos", "Casa natal de Jovellanos"));
        datos.add(new Lista_entrada(R.drawable.ferrocarril, "Museo del ferrocarril", "Museo del ferrocarril"));
        datos.add(new Lista_entrada(R.drawable.pinole, "Museo Piñole", "Pinoteca en la casona natal de Piñole"));
        datos.add(new Lista_entrada(R.drawable.sidra, "Museo de la sidra", "Museo de la sidra"));





    }
}
