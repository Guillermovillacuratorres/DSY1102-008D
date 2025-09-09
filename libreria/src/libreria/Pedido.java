/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria;

import java.time.LocalDate;

/**
 *
 * @author Guillermo Villacura
 */
public class Pedido {
    private Estudiante estudiante;
    private Producto producto;
    private Proveedor proveedor;
    private int cantidadSolicitada;
    private LocalDate fechaPedido;

    public Pedido() {
    }

    public Pedido(Estudiante estudiante, Producto producto, Proveedor proveedor, int cantidadSolicitada, LocalDate fechaPedido) {
        this.estudiante = estudiante;
        this.producto = producto;
        this.proveedor = proveedor;
        this.cantidadSolicitada = cantidadSolicitada;
        this.fechaPedido = fechaPedido;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public int getCantidadSolicitada() {
        return cantidadSolicitada;
    }

    public void setCantidadSolicitada(int cantidadSolicitada) {
        this.cantidadSolicitada = cantidadSolicitada;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    @Override
    public String toString() {
        return "Pedido{" + "estudiante=" + estudiante + ", producto=" + producto + ", proveedor=" + proveedor + ", cantidadSolicitada=" + cantidadSolicitada + ", fechaPedido=" + fechaPedido + '}';
    }
    
    
    
    
    public int calcularTotalBruto(){
        return cantidadSolicitada * this.producto.getPrecioProducto();
    }
    
    
    public double calcularDescuento(){
        if(calcularTotalBruto() > 30000 && calcularTotalBruto() < 59999){
            return calcularTotalBruto() - (calcularTotalBruto() * 0.15);
        }else if(calcularTotalBruto() >= 60000){
            return calcularTotalBruto() - (calcularTotalBruto() * 0.25);
        }else{
            return calcularTotalBruto();
        }
    }
    
    // && ---> AND
    // || ---> OR
    
    
    public String validarEnvio(){
        if(estudiante.getEdad() >= 18 && calcularDescuento() > 40000){
            return "Tienes envio gratis";
        }else{
            return "No tienes envio gratis.";
        }
    }


}
