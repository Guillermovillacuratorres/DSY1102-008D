/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miprimeraapp;

/**
 *
 * @author Cetecom
 */
public class MiPrimeraApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona p1 = new Persona("Pedro","Ruiz",30,true,85.6f,1.50);
        Persona p2 = new Persona();
        
        p2.setNombre("Juanito");
        p2.setApeliido("Diaz");
        
        System.out.println("hola");
        System.out.println(p2.getApeliido() + " - " + p1.getApeliido());
        
        
        //21321
        /*
        1
        2
        3
        
        */
        
        
    }
    
}
