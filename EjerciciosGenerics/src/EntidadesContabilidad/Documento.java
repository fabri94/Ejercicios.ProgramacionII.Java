/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesContabilidad;

/**
 *
 * @author Fabri
 */
public class Documento {
    private int numero;

    public Documento(int numero) {
        this.numero = numero;
    }

    protected int getNumero(){
        return this.numero;
    }
    
    @Override
    public boolean equals(Object obj){
        boolean esIgual = false;
        if(obj == this){
            esIgual = true;
        }
        if(obj != null && obj instanceof Documento){
            Documento otro = (Documento) obj;
            if(otro.getNumero()==this.getNumero())
            {
                esIgual = true;
            }
        }
        return esIgual;
    }
}
