/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesContabilidad;

/**
 *
 * @author Fabri
 */
public class Factura extends Documento{

    public Factura(int numero) {
        super(numero);
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Factura numero: ").append(super.getNumero());
        return sb.toString();
    }
        
}
