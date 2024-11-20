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
import java.sql.Statement;

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
    
    
    
    public List<Libro> obtenerLibros(int id){
        List<Libro> libros = new ArrayList<>();
        try {
            ResultSet rs = cx.EjecutarQuery("select * from libro WHERE idcategoria =  " + id + ";");
            
            while(rs.next()){
                libros.add(new Libro(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getInt("idCategoria")
                ));
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return libros;
    }
    
    
    
    
    
    public void agregarLibro(String parNombre, int idCategoria){
        String sql = "INSERT INTO `libro` (nombre,idCategoria) VALUES (?,?)";
        try {
            PreparedStatement st = cx.getConnection().prepareStatement(sql);
            st.setString(1, parNombre);
            st.setInt(2, idCategoria);
            st.executeUpdate();
            helper.showInformation("Libro agregado.");
        } catch (Exception e) {
            helper.showError(e.getMessage());
        }
    }
    
    
    
    public Libro buscarLibropoId(int id){
        Libro libroEncontrado = null;
        String query = "SELECT * FROM libro WHERE id = " + id + ";";
        try {
            ResultSet rs = cx.EjecutarQuery(query);
            if(rs.next()){
                libroEncontrado = new Libro();
                libroEncontrado.setId(rs.getInt("id"));
                libroEncontrado.setNombre(rs.getString("nombre"));
                libroEncontrado.setIdcategoria(rs.getInt("idCategoria"));
            }
        } catch (Exception e) {
            helper.showError(e.getMessage());
        }
        return libroEncontrado;
    }
    
    
    public boolean editarLibro(int idLibro, String nombre, int categoriaId){
        String query = "UPDATE libro SET nombre = '" + nombre +
                        "', idCategoria = " + categoriaId + 
                        " WHERE id = " + idLibro + ";";
        
        System.out.println(query);
        
        try {
            Libro libroEncontrado = buscarLibropoId(idLibro);
            if(libroEncontrado != null){
                Statement st = cx.getConnection().createStatement();
                int filasAfectadas = st.executeUpdate(query);
                helper.showInformation("Libro actualizado.");
                return filasAfectadas > 0;
            }else{
                helper.showError("Libro no encontrado");
                return false;
            }
        } catch (Exception e) {
            helper.showError(e.getMessage());
        }
        return false;
        
    }
    
    
    public boolean eliminarLibro(int id){
        String query = "DELETE FROM libro WHERE id = " + id + ";";
        try {
            Libro libroEncontrado = buscarLibropoId(id);
            if(libroEncontrado != null){
                Statement st = cx.getConnection().createStatement();
                int filasAfectadas = st.executeUpdate(query);
                helper.showInformation("Libro eliminado");
                return filasAfectadas > 0;
            }else{
                helper.showError("Libro no eliminado.");
                return false;
            }
        } catch (Exception e) {
            helper.showError(e.getMessage());
        }
        return false;
    }
    
    
    
}
