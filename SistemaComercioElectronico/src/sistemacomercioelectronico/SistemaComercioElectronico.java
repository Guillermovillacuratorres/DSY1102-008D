/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemacomercioelectronico;

import cl.duoc.models.Cliente;
import cl.duoc.models.Electronico;
import cl.duoc.models.Pedido;
import cl.duoc.models.Producto;
import cl.duoc.models.Ropa;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class SistemaComercioElectronico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Electronico electronico1 = new Electronico("Sony", 6 , "001", "Audifonos", 40000.0);
        Ropa ropa1 = new Ropa("M", "Rojo", "002", "Camisa", 50000.0);
        Cliente cliente1 = new Cliente("001", "Juanito");
        
        Pedido pedido1 = new Pedido();
        pedido1.agregarProducto(ropa1);
        pedido1.agregarProducto(electronico1);
        electronico1.calcularDescuento(0.15);
        ropa1.calcularDescuento(0.50);
        System.out.println(pedido1.calcularTotal());
        cliente1.agregarPedido(pedido1);
        
        
        
        
        
        //CREO UNA LISTA DE PRODUCTOS
        List<Electronico> prductosElectronicos = new ArrayList<>();
        
        int opcion = 0;
        while(opcion != 5){
            
            System.out.println("MENU");
            System.out.println("[1] - Visualizar pedido");
            System.out.println("[2] - Agregar producto a pedido");
            System.out.println("[3] - Agregar Producto");
            System.out.println("[4] - Listar productos electronicos");
            System.out.println("[5] - Salir");
            
            opcion = entrada.nextInt();

            switch(opcion){
                
                case 1:
                    System.out.println("PEDIDO:");
                    for(Producto i : pedido1.getProductos()){
                        System.out.println("ID: " + i.getIdProducto()  + " - " + " NOMBRE: " + i.getNombre());
                    }
                    
                
                case 2:
                    pedido1.agregarProducto(electronico1);
                    System.out.println("Producto agregado a la lista del pedido.1");
                
                case 3:
                    
                    //Creamos el obj de tipo Electronico
                    Electronico productoElectronicoNuevo = new Electronico();
                    
                    
                    //Asignamos cada atributo, incluyendo los de la clase padre (Producto).
                    System.out.println("Ingrese la marca del producto:");
                    productoElectronicoNuevo.setMarca(entrada.next());
                    
                    System.out.println("Ingrese la garantia del producto: (cantidad meses).");
                    productoElectronicoNuevo.setGarantiaMeses(entrada.nextInt());
                    
                    System.out.println("Ingrese el id del producto:");
                    productoElectronicoNuevo.setIdProducto(entrada.next());
                    
                    System.out.println("Ingrese el nombre del producto:");
                    productoElectronicoNuevo.setNombre(entrada.next());
                    
                    System.out.println("Ingrese el precio del producto:");
                    productoElectronicoNuevo.setPrecio(entrada.nextDouble());
                    
                    
                    //Agregamos el nuevo producto a la lista
                    prductosElectronicos.add(productoElectronicoNuevo);
                    
                    System.out.println("Producto agregado correctamente.");
                    
                    
                case 4:
                    for(Producto i : prductosElectronicos){
                        System.out.println("ID: " + i.getIdProducto()+ " - " + "NOMBRE:  " + i.getNombre() + " - " + "PRECIO:  " + i.getPrecio());
                    }
            }
        
            
        }
        
        
    }
    
}
