/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Perro extends Animal{

    public Perro() {
    }

    public Perro(String nombre) {
        super(nombre);
    }
    

    @Override
    public void hacerSonido() {
        System.out.println(getNombre()  + " dice guaaaauuu!!");
    }



    
}