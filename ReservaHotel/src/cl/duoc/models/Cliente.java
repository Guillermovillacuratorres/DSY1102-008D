/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

import java.util.ArrayList;

/**
 *
 * @author Cetecom
 */
public class Cliente {
    private String idCliente, nombreCliente;
    private ArrayList<Reserva> reservasRealizadas;

    public Cliente() {
        reservasRealizadas = new ArrayList<Reserva>();
    }

    public Cliente(String idCliente, String nombreCliente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.reservasRealizadas = new ArrayList<>();
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public ArrayList<Reserva> getReservasRealizadas() {
        return reservasRealizadas;
    }

    public void setReservasRealizadas(ArrayList<Reserva> ReservasRealizadas) {
        this.reservasRealizadas = ReservasRealizadas;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombreCliente=" + nombreCliente + ", ReservasRealizadas=" + reservasRealizadas + '}';
    }
    
    
    
    public void realizarReserva(Reserva parReserva){
        reservasRealizadas.add(parReserva);
    }
    
    
}
