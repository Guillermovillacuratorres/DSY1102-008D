/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cl.duoc.reservahotel;

import cl.duoc.models.Cliente;
import cl.duoc.models.Habitacion;
import cl.duoc.models.Hotel;
import cl.duoc.models.Reserva;

/**
 *
 * @author Cetecom
 */
public class ReservaHotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Hotel hotelUno = new Hotel("0001", "Cinco estrellas");
        Hotel hotelDos = new Hotel("0002","Cuatro estrellas");
        
        
        
        hotelUno.agregarHabitaciones(new Habitacion("H0001", 500));
        hotelUno.agregarHabitaciones(new Habitacion("H0002",1000));
        
        
        hotelDos.agregarHabitaciones(new Habitacion("J0001",5000));
        
        
        Cliente clienteUno = new Cliente("cl001","Pedro Fernandez");
        Cliente clienteDos = new Cliente("cl002","Vicente Malo");
        
        
        hotelDos.reservarHabitacion(clienteUno);
        hotelUno.reservarHabitacion(clienteDos);
        
        
        System.out.println("Reservas del cliente " + clienteUno.getNombreCliente() + " : ");
        for(Reserva iteradorReserva : clienteUno.getReservasRealizadas()){
            System.out.println("Hotel: " + iteradorReserva.getHotel().getNombreHotel() +
                                " Habitacion: " + iteradorReserva.getHabitacion().getNumeroHabitacion());
        }
        
        
        System.out.println("-----------");
        
        
        System.out.println("Reservas del cliente " + clienteDos.getNombreCliente() + " : ");
        for(Reserva iteradorReserva : clienteDos.getReservasRealizadas()){
            System.out.println("Hotel: " + iteradorReserva.getHotel().getNombreHotel() +
                                " Habitacion: " + iteradorReserva.getHabitacion().getNumeroHabitacion());
        }
        
    }
    
    
}
