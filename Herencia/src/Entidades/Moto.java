/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Fabri
 */
public class Moto extends Vehiculo{
    private int cilindrada;

    public Moto(String marca, String modelo, int anio, int cilindrada) {
        super(marca, modelo, anio);
        this.cilindrada = cilindrada;
    }
    
    public String mostrarMoto(){
        StringBuilder sb = new StringBuilder();
        
        sb.append(super.mostrar());
        sb.append("Cilindrada de la moto: ").append(cilindrada);
        sb.append(System.lineSeparator());
        
        return sb.toString();
        
    }
            
    
    
    
    
    
}
