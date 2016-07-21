package com.example.dell_09_027_pc.proyectomuseos;

/**
 * Created by Dell_09_027-PC on 21/07/2016.
 */
public class Museo {
    String nombre;
    String direccion;
    String telefono;
    String url;
    String email;
    String horarios;
    int foto;
    String descripcion;
    String tipo;
    String precios;

    public Museo(String nombre, String direccion, String telefono, String url, String email, String horarios, int foto, String descripcion, String tipo, String precios) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.url = url;
        this.email = email;
        this.horarios = horarios;
        this.foto = foto;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.precios = precios;
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

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
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

    public String getPrecios() {
        return precios;
    }

    public void setPrecios(String precios) {
        this.precios = precios;
    }
}
