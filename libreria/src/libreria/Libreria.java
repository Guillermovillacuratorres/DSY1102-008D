/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreria;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Guillermo Villacura
 */
public class Libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Estudiante estuUno = new Estudiante();
        Proveedor proveUno = new Proveedor();
        Producto prodUno = new Producto();
        Pedido pedidoUno = new Pedido();
        
        
        
        while(true){
            System.out.println("---MENU---");
            System.out.println("(1) - Agregar estudiante");
            System.out.println("(2) - Agregar proveedor");
            System.out.println("(3) - Agregar producto");
            System.out.println("(4) - Agregar pedido");
            System.out.println("(5) - Salir");
            
            System.out.println("Seleccione una opcion:");
            int opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Opcion 1");
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Ingrese el rut del proveedor:");
                    proveUno.setRut(sc.nextLine());
                    
                    System.out.println("Ingrese el nombre del proveedor:");
                    proveUno.setNombre(sc.nextLine());
                    
                    System.out.println("Ingrese el codigo del proveedor:");
                    proveUno.setCodigo(sc.nextLine());
                    
                    System.out.println("Ingrese la especialidad del proveedor:");
                    proveUno.setEspecialidad(sc.nextLine());
                    
                    while(true){
                        LocalDate hoy = LocalDate.now();
                        System.out.println("Ingrese la fecha de contratacion del proveedor: YYYY-MM-DD");
                        String fechaTeclado = sc.nextLine();
                        
                        LocalDate fechaContratacion = LocalDate.parse(fechaTeclado);
                        
                        if(fechaContratacion.isAfter(hoy)){
                            System.out.println("La fecha ingresada no puede ser despues de hoy!!");
                        }else{
                            System.out.println("Proveedor agregado correctamente!");
                            break;
                        }
                        
                    }
                    
                    
                    
                    
                    
                    break;
                case 3:
                    System.out.println("Opcion 3");
                    break;
                case 4:
                    System.out.println("Opcion 4");
                    break;
                case 5:
                    System.out.println("Saliendo de la aplciacion");
                    break;
                default:
                    System.out.println("Opcion no valida!!");
            }
            
            
        }
    }
    
}
