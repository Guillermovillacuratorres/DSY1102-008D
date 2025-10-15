/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Cetecom
 */
public class Gato extends Animal{
    private boolean pulgas;

    public Gato() {
    }

    public Gato(boolean pulgas) {
        this.pulgas = pulgas;
    }

    public Gato(boolean pulgas, int cantidad_patas) {
        super(cantidad_patas);
        this.pulgas = pulgas;
    }
    
    

    public boolean isPulgas() {
        return pulgas;
    }

    public void setPulgas(boolean pulgas) {
        this.pulgas = pulgas;
    }

    @Override
    public String toString() {
        return "Gato{" + "pulgas=" + pulgas + '}';
    }
    
    
    @Override
    public void hacerSonido(){
        System.out.println("Miaaauuuuu  miiiaaaauuu");
    }
    
    
    @Override
    public void caminar() {
        
    }
    
}
