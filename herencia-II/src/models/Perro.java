/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Cetecom
 */
public class Perro extends Animal{
    private String garras;

    public Perro() {
    }

    public Perro(String garras) {
        this.garras = garras;
    }

    public Perro(String garras, int cantidad_patas) {
        super(cantidad_patas);
        this.garras = garras;
    }

    
    
    public String getGarras() {
        return garras;
    }

    public void setGarras(String garras) {
        this.garras = garras;
    }

    @Override
    public String toString() {
        return "Perro{" + "garras=" + garras + '}';
    }
    
    
    @Override
    public void hacerSonido(){
        System.out.println("Guau Guau Guauuuuuuuuuu....");
    }

    @Override
    public void caminar() {
        
    }
    
}
