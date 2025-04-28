/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Fabri
 */
public class Herramienta {
    protected String marca;
    protected int peso;

    public Herramienta(String marca, int peso) {
        this.marca = marca;
        this.peso = peso;
    }
    
    protected String mostrarHerramienta()
    {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Marca: ").append(this.marca);
        sb.append(System.lineSeparator());
        sb.append("Peso: ").append(this.peso);
        sb.append(System.lineSeparator());
        
        
        return sb.toString();
    }
}
