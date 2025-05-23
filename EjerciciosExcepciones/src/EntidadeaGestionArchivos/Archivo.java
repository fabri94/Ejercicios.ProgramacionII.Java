/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadeaGestionArchivos;

/**
 *
 * @author Fabri
 */
public abstract class Archivo {
    private String nombre;
    private boolean permisoLectura;
    private boolean permisoEscritura;

    public Archivo(String nombre, boolean permisoLectura, boolean permisoEscritura) {
        this.nombre = nombre;
        this.permisoLectura = permisoLectura;
        this.permisoEscritura = permisoEscritura;
    }
    
    
}
