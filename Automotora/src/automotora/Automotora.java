/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package automotora;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class Automotora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Scanner entradaDos = new Scanner(System.in);
        Persona vPersona = new Persona();
        Vendedor vendedor = new Vendedor();
        
        
        int opcion = 0;
        
        while(opcion != 5){
            System.out.println("=======Menu=======");
            System.out.println("[1] - Agregar Vendedor");
            System.out.println("[2] - Agregar cliente");
            System.out.println("[3] - Agregar vehiculo");
            System.out.println("[4] - Generar venta");
            System.out.println("[5] - Salir");

            opcion = entrada.nextInt();
            entrada.nextLine();
            

            switch(opcion){
                case 1:
                    
                    
                    String nombre  = "";
                    while(true){
                        System.out.println("Ingrese el nombre del vendedor:");
                        nombre = entrada.nextLine();
                        
                        if(nombre.isEmpty()){
                            System.out.println("Debe ingresar un nombre.");
                        }else{
                            vPersona.setNombre(nombre);
                            break;
                        }
                        
                    }
                    
                    
                    
                    System.out.println("Ingrese el apellido del vendedor:");
                    vPersona.setApellido(entrada.next());
                    
                    System.out.println("Ingrese el rut del vendedor: ");
                    vPersona.setRut(entrada.next());
                    
                    System.out.println("Ingrese el numero de telefono del venededor:");
                    vPersona.setTelefono(entrada.nextInt());
                    
                    int anio, mes, dia;
                    
                    System.out.println("Ingresa el año de nacimiento del vendedor: ");
                    anio = entrada.nextInt();
                    
                    System.out.println("Ingresa el mes de nacimiento del vendedor: ");
                    mes = entrada.nextInt();
                    
                    System.out.println("Ingresa el dia de nacimiento del vendedor: ");
                    dia = entrada.nextInt();
                    
                    
                    vPersona.setFecha_nacimiento(LocalDate.of(anio,mes, dia));
                    
                    vendedor.setId_vendedor(1);
                    vendedor.setPersona(vPersona);
                    
                    System.out.println(vendedor);
                    
                    Vehiculo auto = new Vehiculo();
                    auto.mostrarInformacionObjeto(vPersona);
                    
                    break;
                case 2:
                    System.out.println("opcion 2");
                    break;
                case 3:
                    Categoria_vehiculo categoria = new Categoria_vehiculo(1,"Sedan");
                    Vehiculo vehiculo = new Vehiculo(1, 
                                                    2000,
                                                "abcd10",  
                                                "Toyota",
                                                "Corolla", 
                                                "Gris", 
                                                categoria);
                    
                    System.out.println(vehiculo.CalcularPercioVehiculoConIva());
                    vehiculo.calcularDescuento();
                    break;
                case 4:
                    System.out.println("opcion 4");
                    break;
                case 5:
                    System.out.println("Saliendo!!!");
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
            
            
        }
        
    }
    
}
