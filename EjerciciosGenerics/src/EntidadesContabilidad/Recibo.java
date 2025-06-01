/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesContabilidad;

/**
 *
 * @author Fabri
 */
public class Recibo extends Documento{
    
   public Recibo(){
       super(0);
   }
    
    public Recibo(int numero) {
        super(numero);
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Recibo numero: ").append(super.getNumero());
        return sb.toString();
    }    
}
