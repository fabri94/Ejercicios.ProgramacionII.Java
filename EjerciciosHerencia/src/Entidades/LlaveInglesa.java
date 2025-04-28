/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Fabri
 */
public class LlaveInglesa extends Herramienta{
    
    private TipoMaterial material;
    private boolean regulable;

    public LlaveInglesa(String marca, int peso, TipoMaterial material, boolean regulable) {
        super(marca, peso);
        this.material = material;
        this.regulable = regulable;
    }
    
    public String mostrarLlaveInglesa()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("LLAVE");
        sb.append(System.lineSeparator());
        sb.append("--------------------");
        sb.append(System.lineSeparator());
        sb.append(super.mostrarHerramienta());
        sb.append("MATERIAL: ").append(this.material);
        sb.append(System.lineSeparator());
        sb.append("REGULABLE: ").append(this.regulable);
        sb.append(System.lineSeparator());
        sb.append(System.lineSeparator());
        
        return sb.toString();
    }
    
    
}
