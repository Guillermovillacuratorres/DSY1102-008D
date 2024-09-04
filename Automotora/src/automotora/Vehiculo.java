/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automotora;

/**
 *
 * @author Cetecom
 */
public class Vehiculo {
    private int id_vehiculo,precio;
    private String patente, marca, modelo, color;
    private Categoria_vehiculo categoria;

    public Vehiculo() {
    }

    public Vehiculo(int id_vehiculo, int precio, String patente, String marca, String modelo, String color, Categoria_vehiculo categoria) {
        this.id_vehiculo = id_vehiculo;
        this.precio = precio;
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.categoria = categoria;
    }

    public int getId_vehiculo() {
        return id_vehiculo;
    }

    public void setId_vehiculo(int id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Categoria_vehiculo getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria_vehiculo categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Vehiculos{" + "id_vehiculo=" + id_vehiculo + ", precio=" + precio + ", patente=" + patente + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", categoria=" + categoria + '}';
    }



    public double CalcularPercioVehiculoConIva(){
        if(precio > 0){
            return  precio * 1.19;
        }else{
            return 0;
        }
    }
    
    //60% descuento
    public void calcularDescuento(){
        double descuento = 0;
        if(CalcularPercioVehiculoConIva() > 1500){
            descuento = CalcularPercioVehiculoConIva() * 0.4;
            System.out.println("EL precio final es de: " + descuento);
        }else{
            System.out.println("No hay descuento!!!!");
        }
        
    }
    
    
    
    public void mostrarInformacionObjeto(Persona persona
    ){
        System.out.println("Nombre" + persona.getNombre());
    }
    

    
    
}
