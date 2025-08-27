/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misegundaapp;

/**
 *
 * @author Cetecom
 */
public class Vehiculo {
    private String marca;
    private int anio, velocidad,km;
    private boolean automatico; // true = automatico - false mecanico
    private float bencina;
    

    public Vehiculo() {
    }

    public Vehiculo(String marca, int anio, int velocidad, int km, boolean automatico, float bencina) {
        this.marca = marca;
        this.anio = anio;
        this.velocidad = velocidad;
        this.km = km;
        this.automatico = automatico;
        this.bencina = bencina;
    }



    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public boolean isAutomatico() {
        return automatico;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public float getBencina() {
        return bencina;
    }

    public void setBencina(float bencina) {
        this.bencina = bencina;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", anio=" + anio + ", velocidad=" + velocidad + ", km=" + km + ", automatico=" + automatico + ", bencina=" + bencina + '}';
    }

 
    
    public void acelerar(){
        if(this.velocidad >= 50){
            System.out.println("Llegó a la velocidad maxima!!!");
        }else{
            this.velocidad += 5;
        }
        
    }


     public void frenar(){
         if(this.velocidad <= 0){
             System.out.println("Vehiculo frenado!!!");
             this.velocidad = 0;
         }else{
             this.velocidad -= 5;
         }
         
     }
    
    
    
}
