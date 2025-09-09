/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria;

/**
 *
 * @author Guillermo Villacura
 */
public class Estudiante {
        private String rut,nombre,carreraUniversitaria;
        private int edad;

    public Estudiante() {
    }

    public Estudiante(String rut, String nombre, String carreraUniversitaria, int edad) {
        this.rut = rut;
        this.nombre = nombre;
        this.carreraUniversitaria = carreraUniversitaria;
        this.edad = edad;
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

    public String getCarreraUniversitaria() {
        return carreraUniversitaria;
    }

    public void setCarreraUniversitaria(String carreraUniversitaria) {
        this.carreraUniversitaria = carreraUniversitaria;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "rut=" + rut + ", nombre=" + nombre + ", carreraUniversitaria=" + carreraUniversitaria + ", edad=" + edad + '}';
    }
        
        
}
