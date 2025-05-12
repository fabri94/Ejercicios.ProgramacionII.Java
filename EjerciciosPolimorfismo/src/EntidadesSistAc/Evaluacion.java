/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesSistAc;

/**
 *
 * @author Fabri
 */
public abstract class Evaluacion {
    protected String nombre;
    protected String fecha;
    protected double notaObtenida;

    public Evaluacion(String nombre, String fecha, double notaObtenida) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.notaObtenida = notaObtenida;
    }
    
    public abstract double calcularNotaFinal();
    public abstract void mostrarDetalle();
}
