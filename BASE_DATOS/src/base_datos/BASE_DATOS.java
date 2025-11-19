/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package base_datos;

import Bd.Conexion;
import controller.VehiculoController;

/**
 *
 * @author Cetecom
 */
public class BASE_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Conexion cx =  new Conexion();
//        cx.conectar();

        VehiculoController vc = new VehiculoController();
        System.out.println(vc.listarVehiculos());

    }
    
}
