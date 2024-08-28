/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.dsy1102.instituto;

/**
 *
 * @author Cetecom
 */
public class Persona {
    
    public int numero;
    
    private String rut,nombre,direccion,genero,correo;
    private int edad,telefono;

    public Persona(String rut, String nombre, String direccion, String genero, String correo, int edad, int telefono) {
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;
        this.genero = genero;
        this.correo = correo;
        this.edad = edad;
        this.telefono = telefono;
    }

    
    
    
    public Persona() {
    }
    
 
    
    

    
    
    

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
    
    
    
    
    @Override
    public String toString(){
        return "Rut: " + rut + " Correo: " + correo + " Nombre: " + nombre;
    }
    
    
    //y ---> &&
    //o --> ||
    public String validarEdad(int edad){
        if(edad >= 18){
            return "Es mayor de edad";
        }else{
            return "Es menor de edad";
        }
    }
    
    
    

    
    
    
    
    
    
    
    
    
}
