/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validaciones;

import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class Validaciones {

    /**
     * @param args the command line arguments
     */
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //System.out.println(contieneNumeros("hkajdsKJADKJANSKJ5DNASKJDNKJDNola"));
        //System.out.println("hkajdsKJADKJANSKJ5DNASKJDNKJDNola".length());
        
       // String nombre = validaTexto("Ingrese su nombre:");
        //String apellido = validaTexto("Ingrese su apellido:");
        //System.out.println("Nombre: " + nombre + " Apellido: " + apellido);
        
        int edad = validaNumero("Ingrese su edad:");
        System.out.println("Edad: " + edad);
    }
    
    
    private static String validaTexto(String msg){
        while(true){
            System.out.println(msg);
            String valor = sc.nextLine();
            if(valor.isEmpty() || valor.isBlank()){
                System.out.println("El valor no puede estar vacio.");
            }else if(contieneNumeros(valor) == true){
                System.out.println("El valor no debe contener numeros.");
            }else if(valor.length() < 3){
                System.out.println("El largo no debe ser inferior a 3 caracteres.");
            }else if(valor.length() > 10){
                System.out.println("El largo no debe ser superior a 10 caracteres.");
            }else{
                return valor;
            }
        }
    }
    
    
    private static boolean contieneNumeros(String valor){//Pedrito15
        String numeros = "1234567890";
        for(char i : valor.toCharArray()){
            for(char j : numeros.toCharArray()){
                if(i == j){
                    return true; 
                }
            }
        }
        return false;
    }
    
    private static int validaNumero(String msg){
        while(true){
            try {
                System.out.println(msg);
                int valor = sc.nextInt();
                if(valor <= 0){
                    System.out.println("El valor debe ser mayor a 0.");
                }else{
                    return valor;
                }
            } catch (Exception e) {
                System.out.println("El valor debe ser numerico.");
                sc.nextLine();
            }
        }
    }
    
}
