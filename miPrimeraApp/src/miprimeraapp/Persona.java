/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miprimeraapp;

/**
 *
 * @author Cetecom
 */
public class Persona {
    private String nombre,apeliido;
    private int edad;
    private boolean estadoCivil;
    private float peso;
    private double altura;

    public Persona() {
    }



    public Persona(String nombre, String apeliido, int edad, boolean estadoCivil, float peso, double altura) {
        this.nombre = nombre;
        this.apeliido = apeliido;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApeliido() {
        return apeliido;
    }

    public void setApeliido(String apeliido) {
        this.apeliido = apeliido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(boolean estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apeliido=" + apeliido + ", edad=" + edad + ", estadoCivil=" + estadoCivil + ", peso=" + peso + ", altura=" + altura + '}';
    }


    
    
}
