/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Fabri
 */
public abstract class Dispositivo {
    protected String marca;
    protected boolean encendido;

    public Dispositivo(String marca) {
        this.marca = marca;
        this.encendido = false;
    }

    public String getMarca() {
        return marca;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
    
    public void mostrarEstado()
    {
        if(isEncendido())
        {
            System.out.println("El dispositivo esta encendido");
        }else
        {
            System.out.println("El dispositivo esta apagado");
        }
    }
    
}
