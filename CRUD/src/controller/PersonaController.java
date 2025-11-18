/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import helper.Helper;
import java.util.ArrayList;
import models.Persona;

/**
 *
 * @author Cetecom
 */
public class PersonaController {
    private static ArrayList<Persona> personas = new ArrayList();
    
    Helper h = new Helper();
            
    
    public void agregarPersona(Persona p){
        personas.add(p);
        System.out.println("Persona agregada!!!!");
    }
    
    public void agregarPersona(String rut,String nombre, int edad){
        Persona p = new Persona();
        p.setRut(rut);
        p.setNombre(nombre);
        p.setEdad(edad);
        
        personas.add(p);
        System.out.println("Persona agregada!!!!");
    }
    
    public ArrayList<Persona> listarPersonas(){
        return personas;
    } 
    
    public Persona buscarPersona(String rut){
        for(Persona p : personas){
            if(p.getRut().equals(rut)){
                return p;
            }
        }
        return null;
    }
    
    public void editarPersona(Persona p){
        Persona personaEncontrada = buscarPersona(p.getRut());
        
        if(personaEncontrada != null){
            personaEncontrada.setNombre(p.getNombre());
            personaEncontrada.setEdad(p.getEdad());
            System.out.println("Persona actualizada!");
        }else{
            System.out.println("Persona no encontrada!");
        }
    }
    
    public void eliminarPersona(String rut){
        Persona personaEncontrada = buscarPersona(rut);
        
        if(personaEncontrada != null){
            personas.remove(personaEncontrada);
        }else{
            //System.out.println("Persona no encontrada!");
            h.showError("Persona no encontrada");
        }
    }
    
}
