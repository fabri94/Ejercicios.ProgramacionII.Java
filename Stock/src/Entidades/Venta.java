/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Fabri
 */
public class Venta {
    private Producto producto;
    private int cantidadVendida;
    
    public Venta(Producto producto, int cantidadVendida)
    {
        this.producto = producto;
        this.cantidadVendida = cantidadVendida;
    }
    
    public double getPrecioTotal()
    {
        return this.producto.getPrecio()*this.cantidadVendida;
    }
    
    public boolean realizarVenta()
    {
        boolean ventaRealizada = false;
        if(producto.getStock()>=this.cantidadVendida)
        {
            producto.reducirStock(cantidadVendida);
            ventaRealizada = true;
        }
        return ventaRealizada;
    }
    
    public String mostrarDetalle()
    {
        String mensaje;
                
        mensaje = "Producto: "+producto.getNombre()+ "\n"+
                "Cantidad vendida: "+this.cantidadVendida+"\n"+
                "Total a pagar: "+this.getPrecioTotal()+"\n";
        
        return mensaje;
    }
    
    
}
