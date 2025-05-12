/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesSistAc;

/**
 *
 * @author Fabri
 */
public class Final extends Evaluacion{

    

    public Final(String nombre, String fecha, double notaObtenida) {
        super(nombre, fecha, notaObtenida);
    }

    @Override
    public double calcularNotaFinal() {
        return this.notaObtenida * 1.45;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println(nombre+"\n Fecha: "+fecha+"\n Nota obtenida: "+notaObtenida);
    }
    
}
