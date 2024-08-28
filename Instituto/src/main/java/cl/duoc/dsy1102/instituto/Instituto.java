/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cl.duoc.dsy1102.instituto;

import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class Instituto {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        
        
        
        
        
        
        System.out.println("Hello World!");
        
        Persona p1 = new Persona();
        p1.setNombre("Mario");
        p1.setCorreo("mario@gmail.com");
        p1.numero = 100;
        
        Persona p2 = new Persona("18.412.156-4", "Pedrito", "En su casa", "Masculino", "Pedrito123@hotail.com", 19, 911);
        System.out.println("NUMERO: " + p1.numero);
        
        System.out.println(p1.getNombre());
        System.out.println(p2);
        
        System.out.println(p2.validarEdad(p2.getEdad()));
        
        Alumno a1 = new Alumno();
        a1.setAsignatura("Desarrollo orientad a objetos.");
        a1.setCarrera("Informatica");
        a1.setNota(4.0);
        a1.setSemestre(8);
        a1.setPersona(p2);
        
        System.out.println(a1);
               
        
        String nombre = "Duoc";
        
        System.out.println("LARGO DE UN STRING   " + nombre.length());
        
        
        System.out.println("POSICION LETRA  " + nombre.charAt(2));
        
        
        if(nombre.equalsIgnoreCase("duoc")){
            System.out.println("SON IGUALES");
        }else
        {
                System.out.println("NO SON IGUALES");
        }
        
        
        
        System.out.println("REEMPLAZAR  " + nombre.replace("u", "X"));

        
        

        
        int opcion = 0;
        
        while(opcion != 3){
            System.out.println("=======Menú========");
            System.out.println("[1] Opcion ");
            System.out.println("[2] Opcion ");
            System.out.println("[3] Salir ");
        
            opcion = scanner.nextInt();
            System.out.println("OPCION ---> " + opcion);
            switch(opcion){
          
                case 1:
                    System.out.println("Opcion 1 seleccionada.");
                    break;
                case 2:
                    System.out.println("Opcion 2 seleccionada. ");
                    break;
                case 3: 
                    System.out.println("Saliendo de la aplicación.");
                    break;
                default:
                    System.out.println("opcion ingresada no es valida.");
                    break;
            
            }     
        }
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("Iteracion: " + i);
        }
        
        
        do {
            System.out.println("Numero"); 
        }while(1 != 1);
        
  
        

        
        
        
    }
}
