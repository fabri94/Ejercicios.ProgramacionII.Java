/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Fabri
 */
public class Pedido {
    private String cliente;
    private Bebida bebidaElegida;

    public Pedido(String cliente, Bebida bebidaElegida) {
        this.cliente = cliente;
        this.bebidaElegida = bebidaElegida;
    }
    
    public boolean esBebidaFria()
    {
        boolean esFria = false;
        if(this.bebidaElegida.getTipo().equalsIgnoreCase("fria"))
        {
            esFria = true;
        }
        
        return esFria;
    }

    public String getCliente() {
        return cliente;
    }

    public Bebida getBebidaElegida() {
        return bebidaElegida;
    }
    
    
}
