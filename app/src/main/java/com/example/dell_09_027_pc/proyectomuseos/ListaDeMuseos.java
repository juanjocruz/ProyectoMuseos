package com.example.dell_09_027_pc.proyectomuseos;

import java.util.Vector;

/**
 * Created by Dell_09_027-PC on 22/07/2016.
 */
public class ListaDeMuseos {


    private Vector<Museo> listaNoticias;


    public ListaDeMuseos() {
        this.listaNoticias = new Vector<Museo>();
    }

    public Vector<Museo> getNoticias() {
        return this.listaNoticias;
    }

    public void insertarNoticia(Museo museo) {
        listaNoticias.add(museo);
    }


}
