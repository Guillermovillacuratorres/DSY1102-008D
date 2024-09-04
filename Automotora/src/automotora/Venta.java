/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automotora;

import java.time.LocalDate;

/**
 *
 * @author Cetecom
 */
public class Venta {
    private int id_venta ;
    private Vehiculo vehiculo;
    private Vendedor vendedor;
    private Cliente cliente;
    private LocalDate fecha_compra;

    public Venta() {
    }

    public Venta(int id_venta, Vehiculo vehiculo, Vendedor venddor, Cliente cliente, LocalDate fecha_compra) {
        this.id_venta = id_venta;
        this.vehiculo = vehiculo;
        this.vendedor = venddor;
        this.cliente = cliente;
        this.fecha_compra = fecha_compra;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Vendedor getVenddor() {
        return vendedor;
    }

    public void setVenddor(Vendedor venddor) {
        this.vendedor = venddor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(LocalDate fecha_compra) {
        this.fecha_compra = fecha_compra;
    }
    
    
    @Override
    public String toString(){
        return "Nombre cliente" + cliente.getPersona().getNombre() + 
                " Nombre vendedor " + vendedor.getPersona().getNombre() +
                " Auto comprado: " + vehiculo.getMarca();
    }
    
}
