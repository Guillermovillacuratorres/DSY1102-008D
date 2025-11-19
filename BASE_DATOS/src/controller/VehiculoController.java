/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Bd.Conexion;
import java.util.ArrayList;
import java.util.List;
import models.Vehiculo;

import java.sql.ResultSet;

/**
 *
 * @author Cetecom
 */
public class VehiculoController {
    Conexion cx;

    public VehiculoController() {
        cx = new Conexion();
        cx.conectar();
    }
    
    public List<Vehiculo> listarVehiculos(){
        List<Vehiculo> autos = new ArrayList();
        String query = "SELECT * FROM vehiculo;";
        try {
            ResultSet rs = cx.EjecutarQuery(query);
            while(rs.next()){
                autos.add(new Vehiculo(
                    rs.getString("patente"),
                        rs.getString("marca"),
                        rs.getString("modelo"),
                        rs.getDate("fecha"),
                        rs.getInt("anio")
                ));
            }
            cx.desconectar();
        } catch (Exception e) {
            System.out.println("Error al obtener vehiculos: " + e.getMessage());
        }
        return autos;
    }
    
    
}
