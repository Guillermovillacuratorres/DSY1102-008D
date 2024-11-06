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
public class Proyecto {
    private int idProyecto;
    private String nombreProyecto;
    private List<Task> tareas = new ArrayList<>();

    public Proyecto() {
    }

    public Proyecto(int idProyecto, String nombreProyecto) {
        this.idProyecto = idProyecto;
        this.nombreProyecto = nombreProyecto;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public List<Task> getTareas() {
        return tareas;
    }

    public void setTareas(List<Task> tareas) {
        this.tareas = tareas;
    }
    
    public void agregarTarea(Task parTarea){
        tareas.add(parTarea);
    }
    
    public void listarTareas(){
        for(Task i : tareas){
            System.out.println("ID: " + i.getIdTask() + 
                    " NOMBRE: " + i.getNombre() + 
                    " PRIORIDAD: " + i.getPrioridad() +
                    " FECHA LIMITE: " + i.getFechaLimite() +
                    " ESTADO TAREA: " + i.isCompletado()
                    );
        }
    }
    
    public List<Task> obtenerListadoTareas(){
        return new ArrayList<>(tareas);
    }
    
    
}
