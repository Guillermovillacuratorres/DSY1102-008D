/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreria;

import Bd.Conexion;
import Controller.LibroController;
import Views.ListarLibros;
import Views.Menu;

/**
 *
 * @author Cetecom
 */
public class Libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion cx = new Conexion();
        cx.conectar();
        
        
        LibroController lc = new LibroController();
        System.out.println(lc.obtenerLibros());
        
        
        Menu m = new Menu();
        m.setVisible(true);
    }
    
}
