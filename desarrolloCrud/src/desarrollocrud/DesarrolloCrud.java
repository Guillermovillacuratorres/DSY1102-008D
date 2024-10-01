/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desarrollocrud;

import cl.duoc.models.PersonaCrud;

/**
 *
 * @author Cetecom
 */
public class DesarrolloCrud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PersonaCrud crud = new PersonaCrud();
        
        crud.crearPersona("Pedro");
        crud.crearPersona("Patricio");
        crud.crearPersona("Juan");
        crud.crearPersona("Luis");
        
        
        crud.actualizarPersona(1, "Mario");
        crud.eliminarPersona(4);
        
        
        crud.listarPersonas();
        
        
        
    }
    
}
