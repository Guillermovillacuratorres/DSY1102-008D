/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.mdoels;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class CarritoCompra {
    private List<Producto> carrito = new ArrayList<>();

    public CarritoCompra() {
    }

    public List<Producto> getCarrito() {
        return carrito;
    }

    public void setCarrito(List<Producto> carrito) {
        this.carrito = carrito;
    }

    
    public void agregarProducto(Producto parProducto){
        carrito.add(parProducto);
        System.out.println("Producto agregado.");
    }
    
    public void verCarrito(){
        for(Producto i : carrito){
            System.out.println("ID: " + i.getIdProducto() + " NOMBRE:" + i.getNombre());
        }
    }
    
}
