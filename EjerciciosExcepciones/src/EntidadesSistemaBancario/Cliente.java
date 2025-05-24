/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesSistemaBancario;

/**
 *
 * @author Fabri
 */
public class Cliente implements Notificable{

    private String nombre;
    private String apellido;
    private int dni;
    private String email;

    public Cliente(String nombre, String apellido, int dni, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
    }
        
    
    public String getNombreYApellido(){
        return this.nombre + " " + this.apellido;
    }
    
    @Override
    public void notificar(String mensaje) {
        System.out.println("Notificacion para "+this.getNombreYApellido()+" enviada a "+this.email+"\nMensaje: \n"+mensaje+"\n");
    }
    
}
