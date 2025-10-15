/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia.ii;

import models.Animal;
import models.Gato;
import models.Perro;

/**
 *
 * @author Cetecom
 */
public class HerenciaII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal perrito = new Perro();
        Animal gatito = new Gato();
        
        perrito.hacerSonido();
        gatito.hacerSonido();
        
        System.out.println(((Perro) perrito).getGarras());
        
        
        
        
        
    }
    
}
