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
public class Estudiante extends Persona{
    private double promedioNotas;

    public Estudiante() {
    }

    public Estudiante(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }

    public Estudiante(double promedioNotas, String nombre, String genero, String rut, int edad, LocalDate fechaNacimiento) {
        super(nombre, genero, rut, edad, fechaNacimiento);
        this.promedioNotas = promedioNotas;
    }

    public double getPromedioNotas() {
        return promedioNotas;
    }

    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }

    @Override
    public String toString() {
        return "NOMBRE: " + super.nombre + " Edad: " + super.edad;
    }

    public void mostrarHorario(){
        super.horario();
    }
    
    
    
}
