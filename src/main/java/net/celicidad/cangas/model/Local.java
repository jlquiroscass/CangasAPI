package net.celicidad.cangas.model;

import java.io.Serializable;

public class Local implements Serializable {
    int id;
    String type;
    String nombre;
    String direccion;
    String telefono;
    Double latitud;
    Double longitud;
    String web;

    public Local() {
    }

    public Local(int id, String type, String nombre, String direccion, String telefono, Double latitud, Double longitud, String web) {
        this.id = id;
        this.type = type;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.latitud = latitud;
        this.longitud = longitud;
        this.web = web;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }
}
