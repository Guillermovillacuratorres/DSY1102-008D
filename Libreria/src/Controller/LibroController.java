/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Bd.Conexion;
import Models.Libro;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

/**
 *
 * @author Cetecom
 */
public class LibroController {

    HelperController helper = new HelperController();
    Conexion cx;
    
    public LibroController() {
        cx = new Conexion();
        cx.conectar();
    }
    
    
    
    public List<Libro> obtenerLibros(){
        List<Libro> libros = new ArrayList<>();
        try {
            ResultSet rs = cx.EjecutarQuery("select * from libro;");
            while(rs.next()){
                libros.add(new Libro(
                        rs.getInt("id"),
                        rs.getString("titulo")
                ));
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return libros;
    }
    
    
    
    
    
    public void agregarLibro(String parNombre){
        String sql = "INSERT INTO `libro` (titulo) VALUES (?)";
        try {
            PreparedStatement st = cx.getConnection().prepareStatement(sql);
            st.setString(1, parNombre);
            st.executeUpdate();
            helper.showInformation("Libro agregado.");
        } catch (Exception e) {
            helper.showError(e.getMessage());
        }
    }
    
    
    
    
    
    
    
}
