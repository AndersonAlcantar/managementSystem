/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistemagestion.models;

/**
 *
 * @author admin
 */
public class Cliente {
    
    private String id;
    private String Nombre;
    private String Apellido;
    private String Email;
    private String Telefono;
    
    
    
    public String getId(){
        return id;
    }
    
    public void setId(String id){
  
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
    public String getNombreCompleto(){
        return Nombre + " " + Apellido;
    }
}
