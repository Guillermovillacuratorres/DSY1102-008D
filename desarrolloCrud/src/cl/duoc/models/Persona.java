/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Persona {
    private int IdPersona;
    private String  nombre;

    public Persona() {
    }

    public Persona(int IdPersona, String nombre) {
        this.IdPersona = IdPersona;
        this.nombre = nombre;
    }

    public int getIdPersona() {
        return IdPersona;
    }

    public void setIdPersona(int IdPersona) {
        this.IdPersona = IdPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "IdPersona=" + IdPersona + ", nombre=" + nombre + '}';
    }
    
    
}
