/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Bd.Conexion;
import Models.Categoria;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class CategoriaController {

    Conexion cx;
    HelperController helper = new HelperController();
    public CategoriaController() {
        cx = new Conexion();
        cx.conectar();
    }
    
        
    public List<Categoria> obtenerCategoria(){
        List<Categoria> categorias = new ArrayList<>();
        try {
            ResultSet rs = cx.EjecutarQuery("select * from categoria;");
            while(rs.next()){
                categorias.add(new Categoria(
                        rs.getInt("id"),
                        rs.getString("nombre")
                ));
            }
        } catch (Exception e) {
            helper.showError(e.getMessage());
        }
        return categorias;
    }
    
    
    
    
    
}
