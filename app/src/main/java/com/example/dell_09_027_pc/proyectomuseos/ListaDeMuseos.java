package com.example.dell_09_027_pc.proyectomuseos;

import java.util.Vector;

/**
 * Created by Dell_09_027-PC on 22/07/2016.
 */
public class ListaDeMuseos {


    private Vector<Museo> listaMuseos;


    public ListaDeMuseos() {
        this.listaMuseos= new Vector<Museo>();
    }

    public Vector<Museo> getMuseo() {
        return this.listaMuseos;
    }

    public void insertarMuseo(Museo museo) {
        listaMuseos.add(museo);
    }


}
