/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import models.RevisionTecnica;
import models.Vehiculo;

/**
 *
 * @author Cetecom
 */
public class Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List nombres = new ArrayList<>();
        ArrayList<String> animales = new ArrayList<>();
        
        nombres.add(10);
        nombres.add("Pedrito");
        
        animales.add("Perro");
        animales.add("Gatito");
        
        //System.out.println(nombres.size());
        //System.out.println(nombres);
        
        for(Object i : nombres){
            //System.out.println(i);   
        }
        
        for(String i : animales){
            //System.out.println(i);
        }
   
        //System.out.println(animales.indexOf("Gatito"));
        
        //System.out.println(animales.get(1));
        
        Scanner sc = new Scanner(System.in);
        Vehiculo auto = new Vehiculo();
        int opcion = 0;
        
        
        while(true){
            System.out.println("1 - Agregar Vehiculo");
            System.out.println("2 - Agregar revision tecnica");
            System.out.println("3 - Mostrar vehiculo");
            System.out.println("4 - Salir");
            
            System.out.println("Seleccione una opcion");
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("opcion 1");
                    break;
                case 2:
                    RevisionTecnica revision = new RevisionTecnica();
                    System.out.println("Ingrese el año de la revision:");
                    revision.setAnio(sc.nextInt());
                    auto.agregarRevisionTecnica(revision);
                    break;
                case 3:
                    System.out.println(auto.getRevisiones());
                    break;
                case 4:
                    System.out.println("opcion 1");
                    break;
            }
        }
        
        
        
    }
    
}
