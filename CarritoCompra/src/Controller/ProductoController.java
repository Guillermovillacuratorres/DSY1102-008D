/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Models.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class ProductoController {
    private static List<Producto> productos = new ArrayList<>();
    private static int idProducto = 1;
    HelperController helper = new HelperController();
    
    
    public void agregarProducto(String parNombre, double parPrecio, int parCantidad){
        Producto productoNuevo = new Producto(idProducto++, parNombre, parPrecio, parCantidad);
        productos.add(productoNuevo);
        helper.showInformation("Producto agregado!");
    }
    
    
    public void editarProducto(int parId, String parNombre, double parPrecio, int parCantidad){
        Producto productoEncontrado = buscarProducto(parId);
        if(productoEncontrado != null){
            productoEncontrado.setNombre(parNombre);
            productoEncontrado.setPrecio(parPrecio);
            productoEncontrado.setCantidad(parCantidad);
            helper.showInformation("Producto actualizado correctamente.");
        }else{
            helper.showError("Producto no encontrado.");
        }
    }
    
    
    
    
    
    
    public void eliminarProducto(int parId){
        Producto productoEncontrado = buscarProducto(parId);
        if(productoEncontrado != null){
            productos.remove(productoEncontrado);
            helper.showInformation("Producto eliminado.");
        }else{
            helper.showError("Producto no encontrado.");
        }
    }
    
    
    
    
    public Producto buscarProducto(int parIdProducto){
        for(Producto p : productos){
            if(p.getIdProducto() == parIdProducto){
                return p;
            }
        }
        return null;
    }
    
    
    
    
    public List<Producto> obtenerProductos(){
        return productos;
    }
    
    
}
