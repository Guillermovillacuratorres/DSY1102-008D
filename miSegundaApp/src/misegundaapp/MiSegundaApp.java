/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package misegundaapp;

import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class MiSegundaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // TODO code application logic here
        Vehiculo autoUno = new Vehiculo("Nissan",2021,25,56000,true,1.5f);
        
        Vehiculo autoDos = new Vehiculo();
        
        //System.out.println(autoUno);
        //System.out.println(autoDos);
        

        System.out.println("Ingrese la marca: ");
        String marca = teclado.next();
        
        System.out.println("Año: ");
        int anio = teclado.nextInt();
        
        System.out.println("Velocidad");
        int velocidad = teclado.nextInt();
    
        System.out.println("KM: ");
        int km = teclado.nextInt();
        
        System.out.println("Automatico: ");
        boolean automatico = teclado.nextBoolean();
        
        System.out.println("Bencina: ");
        float bencina = teclado.nextFloat();
        
        Vehiculo autoTres = new Vehiculo(marca,anio,velocidad,km,automatico,bencina);
        
        
        System.out.println(autoTres);
             
        
        
        //System.out.println(autoUno.getVelocidad());
        
        teclado.close();
        
    }
    
}
