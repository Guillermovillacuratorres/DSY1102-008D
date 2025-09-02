/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionpersonas;

/**
 *
 * @author Guillermo Villacura
 */
public class Persona {
    private String nombre;
    private int edad;
    private double altura;
    private boolean casado;

    public Persona() {
    }

    public Persona(String nombre, int edad, double altura, boolean casado) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.casado = casado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + ", casado=" + casado + '}';
    }
    
    
}
