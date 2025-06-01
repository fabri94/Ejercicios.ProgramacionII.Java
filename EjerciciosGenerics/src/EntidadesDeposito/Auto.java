/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesDeposito;

/**
 *
 * @author Fabri
 */
public class Auto {
    private String color;
    private String marca;

    public Auto(String color, String marca) {
        this.color = color;
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }
    
    @Override
    public boolean equals(Object obj){
        boolean mismoAuto = false;
        if(this == obj){
            mismoAuto = true;
        }
        if(obj!=null && obj instanceof Auto){
            Auto otro = (Auto) obj;
            if(otro.color.equals(this.color) && otro.marca.equals(this.marca)){
                mismoAuto = true;
            }
        }
        return mismoAuto;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("Auto\n").append("Marca - ").append(this.marca);
        sb.append("\nColor - ").append(this.color).append("\n");
        
        return sb.toString();
    }
}
