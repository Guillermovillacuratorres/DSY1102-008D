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
public class Docente extends Persona{
    private LocalDate fechaEgreso;

    public Docente() {
    }

    public Docente(LocalDate fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }

    public Docente(LocalDate fechaEgreso, String nombre, String genero, String rut, int edad, LocalDate fechaNacimiento) {
        super(nombre, genero, rut, edad, fechaNacimiento);
        this.fechaEgreso = fechaEgreso;
    }

    public LocalDate getFechaEgreso() {
        return fechaEgreso;
    }

    public void setFechaEgreso(LocalDate fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }

    @Override
    public String toString() {
        return "Docente{" + "fechaEgreso=" + fechaEgreso + '}';
    }
    
    
    public void mostrarHorario(){
        super.horario();
    }
    
    
    
}
