/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.LocalDate;

/**
 *
 * @author Cetecom
 */
public class Persona {
    protected String nombre, genero,rut;
    protected int edad;
    protected LocalDate fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre, String genero, String rut, int edad, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.genero = genero;
        this.rut = rut;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", genero=" + genero + ", rut=" + rut + ", edad=" + edad + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    public void horario(){
        System.out.println("Este es tu horario!  ---->  lunes = nada");
    }
    
}
