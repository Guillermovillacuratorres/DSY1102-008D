/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desarrolloherencia;

import cl.duoc.models.Animal;
import cl.duoc.models.Gato;
import cl.duoc.models.Perro;

/**
 *
 * @author Cetecom
 */
public class DesarrolloHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Perro perro = new Perro();
        Gato gato = new Gato();
        
        perro.setNombre("Rex");
        gato.setNombre("Tom");
        
        
        perro.hacerSonido();
        gato.hacerSonido();
        
        
        
        
        
        
        
    }
    
}
