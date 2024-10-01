/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class PersonaCrud {
    private List<Persona> personas = new ArrayList<>();
    private int id = 1;
    
    
    //Create 
    public void crearPersona(String parNombre){
        Persona nuevaPersona = new Persona(id++, parNombre);
        personas.add(nuevaPersona);
        System.out.println("Persona agregada!  - " + nuevaPersona.getNombre());
    }
    
    //Read
    public void listarPersonas(){
        int contador = 0;
        System.out.println("Listado de personas:");
        for(Persona i : personas){
            contador++;
            System.out.println("["+ contador +"]" +i.getNombre());
        }
    } 
    
    //Update
    public void actualizarPersona(int id, String nombreNuevo){
        for(Persona i : personas){
            if(i.getIdPersona() == id){
                i.setNombre(nombreNuevo);
                System.out.println("Persona actualizada!");
                return;
            }
        }
        System.out.println("Persona NO encontrada!!!!!!");
    }

    
    //Delete
    public void eliminarPersona(int id){
        for(Persona i : personas){
            if(i.getIdPersona() == id){
                personas.remove(i);
                return;
            }
        }
        System.out.println("El id es incorrecto!!!!");
    }
    
}
