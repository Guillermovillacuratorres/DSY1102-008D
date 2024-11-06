/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.controllers;

import cl.duoc.models.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;



/**
 *
 * @author Cetecom
 */
public class ProductoController {
    private static List<Producto> productos = new ArrayList<>();
    private static int idProducto = 1;
    
    
    public void agregarProducto(String nombre, double precio, int cantidad){
        Producto nuevoProducto = new Producto(idProducto++,cantidad,nombre,precio);
        productos.add(nuevoProducto);
        JOptionPane.showMessageDialog(null, "Producto agregado correctamente!", "Exito", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    public void actualizarProducto(int idProducto, String nombre, double precio, int cantidad){
            if(buscarProductoPorId(idProducto) != null){
                buscarProductoPorId(idProducto).setNombre(nombre);
                buscarProductoPorId(idProducto).setCantidad(cantidad);
                buscarProductoPorId(idProducto).setPrecio(precio);
                JOptionPane.showMessageDialog(null, "Producto actualizado correctamente!", "Exito", JOptionPane.INFORMATION_MESSAGE);
                return;
            }else{
                JOptionPane.showMessageDialog(null, "Producto no encontrado!", "Error", JOptionPane.ERROR_MESSAGE);
            }
    }
    

    
    public void eliminar(int idProducto){
        if(buscarProductoPorId(idProducto) != null){
            productos.remove(buscarProductoPorId(idProducto));
            showInfo("Producto eliminado!");
        }else{
            showError("Producto no encontrado!");
        }
    }
    
    public List<Producto> obtenerProductos(){
        return new ArrayList<>(productos);
    }
    
    
    public Producto buscarProductoPorId(int idProducto){
        for(Producto i : productos){
            if(i.getIdProducto() == idProducto){
                return i;
            }
        }
        return null;
    }
    
    
    public void showError(String msg){
        JOptionPane.showMessageDialog(null, msg, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public void showInfo(String msg){
        JOptionPane.showMessageDialog(null, msg, "Información", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void showWarning(String msg){
        JOptionPane.showMessageDialog(null, msg, "Advertencia", JOptionPane.WARNING_MESSAGE);
    }
    
}
