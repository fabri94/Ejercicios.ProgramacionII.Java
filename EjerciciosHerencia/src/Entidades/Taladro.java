/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Fabri
 */
public class Taladro extends Herramienta{
    
    private int rpm;
    private boolean inalambrico;
    
    
    public Taladro(String marca, int peso, int rpm, boolean inalambrico) {
        super(marca, peso);
        this.rpm = rpm;
        this.inalambrico = inalambrico;
    }
    
    public String mostrarTaladro()
    {
        StringBuilder sb = new StringBuilder();
        
        sb.append("TALADRO");
        sb.append(System.lineSeparator());
        sb.append("--------------------");
        sb.append(System.lineSeparator());
        sb.append(super.mostrarHerramienta());
        sb.append("RPM: ").append(this.rpm);
        sb.append(System.lineSeparator());
        sb.append("INALAMBRICO: ").append(this.inalambrico);
        sb.append(System.lineSeparator());
        sb.append(System.lineSeparator());
        
        return sb.toString();
    }
    
}
