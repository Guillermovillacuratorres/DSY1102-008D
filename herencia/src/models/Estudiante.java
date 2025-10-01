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
    
    public int sumar(){
        return 10 + 10;
    }
    
    public int sumar(int n1, int n2){
        return n1 + n2;
    }
    
    @Override
    public void saludar(){
        System.out.println("Hooola soy un estudiante");
    }
    
}
