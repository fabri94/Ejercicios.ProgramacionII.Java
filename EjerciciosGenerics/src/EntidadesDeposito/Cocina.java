/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesDeposito;

/**
 *
 * @author Fabri
 */
public class Cocina {
    private int codigo;
    private float precio;
    private boolean esIndustrial;

    public Cocina(int codigo, float precio, boolean esIndustrial) {
        this.codigo = codigo;
        this.precio = precio;
        this.esIndustrial = esIndustrial;
    }

    public int getCodigo() {
        return codigo;
    }

    public boolean esIndustrial() {
        return esIndustrial;
    }

    public float getPrecio() {
        return precio;
    }
    
    @Override
    public boolean equals(Object obj){
        boolean mismaCocina = false;
        if(this == obj){
            mismaCocina = true;
        }
        if(obj!=null && obj instanceof Cocina){
            Cocina otra = (Cocina) obj;
            if(otra.codigo == this.codigo){
                mismaCocina = true;
            }
        }
        return mismaCocina;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("Cocina\n").append("Codigo - ").append(this.codigo);
        sb.append("\nEs industrial? - ").append(esIndustrial? "Si" : "No");
        sb.append("\nPrecio - ").append(this.precio).append("\n");
        
        return sb.toString();
    }
    
}
