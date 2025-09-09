/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria;

/**
 *
 * @author Guillermo Villacura
 */
public class Producto {
 
    private String codigoProducto,tipoProducto,nombre;
    private int precioProducto;

    public Producto() {
    }

    public Producto(String codigoProducto, String tipoProducto, String nombre, int precioProducto) {
        this.codigoProducto = codigoProducto;
        this.tipoProducto = tipoProducto;
        this.nombre = nombre;
        this.precioProducto = precioProducto;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigoProducto=" + codigoProducto + ", tipoProducto=" + tipoProducto + ", nombre=" + nombre + ", precioProducto=" + precioProducto + '}';
    }


    
    
}
