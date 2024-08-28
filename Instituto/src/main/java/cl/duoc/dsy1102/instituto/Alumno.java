/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.dsy1102.instituto;

/**
 *
 * @author Cetecom
 */
public class Alumno {
    private double nota;
    private String carrera, asignatura;
    private int semestre;
    private Persona persona;

    public Alumno(double nota, String carrera, String asignatura, int semestre, Persona persona) {
        this.nota = nota;
        this.carrera = carrera;
        this.asignatura = asignatura;
        this.semestre = semestre;
        this.persona = persona;
    }

    public Alumno() {
    }
    
    
    
    
    

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    
    
    @Override
    public String toString(){
        return "Rut: " + persona.getRut() + " Correo: " + persona.getCorreo() + " Nombre: " + persona.getNombre() + " Asignatura: " + asignatura;
    }
    
    
    
    
    
    
    
}
