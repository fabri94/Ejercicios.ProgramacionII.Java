/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Fabri
 */
public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int anio;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;       
    }

    public Vehiculo(String marca, String modelo, int anio) {
        this(marca,modelo);
        this.anio = anio;
    }
    
    
    protected String mostrar()
    {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Marca: ").append(this.marca);
        sb.append(System.lineSeparator());
        sb.append("Modelo: ").append(this.modelo);
        sb.append(System.lineSeparator());
        sb.append("Año: ").append(this.anio);
        sb.append(System.lineSeparator());
        
        return sb.toString();
    }
    
    
}
