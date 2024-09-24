/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class Arraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        List<String> listadoNombres = new ArrayList<>();
        String nombreAleatorio;
        
        nombreAleatorio = "Juan";
     
        
        
        listadoNombres.add("Pedro");
        listadoNombres.add("Javier");
        listadoNombres.add("Mario");
        listadoNombres.add("Fernanda");

        listadoNombres.add(nombreAleatorio);
        
        
        //listadoNombres.clear();
        //listadoNombres.remove("Pedro");
        System.out.println(listadoNombres);
        System.out.println(listadoNombres.size());
        System.out.println(listadoNombres.get(3));
        System.out.println(listadoNombres.contains("Pedro"));
        
        
        for(String i : listadoNombres){
            System.out.println(i);
        }
        
        
        
    }
    
}
