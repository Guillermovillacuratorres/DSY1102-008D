/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionpersonas;

import java.util.Scanner;

/**
 *
 * @author Diego Alarcon
 */
public class GestionPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int opc = 0;
        
        Persona p1 = new Persona();

        while (opc != 5) {
            System.out.println("****MENU****");
            System.out.println("[1] Agregar persona");
            System.out.println("[2] Editar persona");
            System.out.println("[3] Eliminar persona");
            System.out.println("[4] Listar persona");
            System.out.println("[5] Salir");

            System.out.println("Seleccione una opcion:");
            opc = sc.nextInt();
            
            

            /*if (opc == 1) {
                System.out.println("Opcion 1");
            } else if(opc == 2){
                System.out.println("Opcion 2");
                        } else {
                System.out.println("opcion no valida");
            }
            */
            
            switch(opc){
                case 1:
                    System.out.println("Opcion 1");
                    System.out.println("Ingrese el nombre de la persona:");
                    p1.setNombre(sc.next());
                    break;
                case 2:
                    System.out.println("Opcion 2");
                    break;
                case 3:
                    System.out.println("Opcion 3");
                    break;
                case 4:
                    System.out.println("Opcion 4");
                    System.out.println(p1);
                    break;
                case 5:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opcion no es valida!!!");
            }

        }
    }

}
