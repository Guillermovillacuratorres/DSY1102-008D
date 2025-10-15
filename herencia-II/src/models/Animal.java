/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Cetecom
 */
public abstract class Animal {
    protected int cantidad_patas;

    public Animal() {
    }

    public Animal(int cantidad_patas) {
        this.cantidad_patas = cantidad_patas;
    }

    public int getCantidad_patas() {
        return cantidad_patas;
    }

    public void setCantidad_patas(int cantidad_patas) {
        this.cantidad_patas = cantidad_patas;
    }

    @Override
    public String toString() {
        return "Animal{" + "cantidad_patas=" + cantidad_patas + '}';
    }
    
    
    public void hacerSonido(){
        System.out.println("El animal hace un sonido!");
    }
    
    
    
    public abstract void caminar();
    
}
