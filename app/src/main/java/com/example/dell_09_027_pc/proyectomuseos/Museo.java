package com.example.dell_09_027_pc.proyectomuseos;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Dell_09_027-PC on 21/07/2016.
 */
public class Museo {
    String nombre;
    String direccion;
    String telefono;
    String url;
    String email;
    String gps;
    String horarios;
    String foto;
    String descripcion;
    String tipo;


    public Museo(   ) {
        this.nombre = "";
        this.direccion = "";
        this.telefono = "";
        this.url = "";
        this.email = "";
        this.gps="";
        this.horarios = "";
        this.foto = "";
        this.descripcion = "";
        this.tipo = "";

    }

    public Museo(String nombre, String direccion, String telefono, String url, String email,String gps, String horarios, String foto, String descripcion, String tipo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.url = url;
        this.email = email;
        this.gps=gps;
        this.horarios = horarios;
        this.foto = foto;
        this.descripcion = descripcion;
        this.tipo = tipo;

    }
    public Museo(JSONObject objeto) {


        try {
            this.setNombre(objeto.getString("nombre"));
            this.setDireccion(objeto.getString("direccion"));
            this.setTelefono(objeto.getString("telefono"));
            this.setUrl(objeto.getString("url"));
            this.setEmail(objeto.getString("correo-electronico"));
            this.setGps(objeto.getString("localizacion"));
            this.setHorarios(objeto.getString("horario"));
            this.setFoto(objeto.getString("foto"));
            this.setDescripcion(objeto.getString("descripcion"));
            this.setTipo(objeto.getString("tipo"));

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEmail() {
        return email;
    }


    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
