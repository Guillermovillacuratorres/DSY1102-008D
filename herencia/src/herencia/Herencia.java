/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

import java.time.LocalDate;
import java.util.ArrayList;
import models.Docente;
import models.Estudiante;
import models.Persona;

/**
 *
 * @author Cetecom
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fechaActual = "2025-09-30";
        LocalDate now = LocalDate.parse(fechaActual);
        Estudiante estu = new Estudiante(6.6,"Navarrete","Hombre","123",12,now);
        Docente doce = new Docente();
        
        
        System.out.println(estu);
        
        //doce.saludar();
        //estu.saludar();
        
        ArrayList<Persona> personas = new ArrayList<>();
        
        personas.add(estu);
        personas.add(doce);
        
        for(Persona i : personas){
            //System.out.println("FOR: " + i);
            i.saludar();
            if(i instanceof Estudiante){
                System.out.println("hay un estudiante en la lista.");
            }
        }
        
    }
    
}
