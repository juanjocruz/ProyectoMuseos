package com.example.dell_09_027_pc.proyectomuseos;

import android.graphics.drawable.Drawable;



    public class Item {
        private int idImagen;
        private String textoEncima;
        private String textoDebajo;

        public Item (int idImagen, String textoEncima, String textoDebajo) {
            this.idImagen = idImagen;
            this.textoEncima = textoEncima;
            this.textoDebajo = textoDebajo;
        }

        public String get_textoEncima() {
            return textoEncima;
        }

        public String get_textoDebajo() {
            return textoDebajo;
        }

        public int get_idImagen() {
            return idImagen;
        }
    }