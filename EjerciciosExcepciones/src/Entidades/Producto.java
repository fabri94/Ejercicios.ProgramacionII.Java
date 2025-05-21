/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Fabri
 */
public abstract class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) throws StockInsuficienteException, PrecioInvalidoException {
        this.nombre = nombre;
        setPrecio(precio);
        setStock(stock);
    }

    private void setStock(int stock) throws StockInsuficienteException {
        if(stock <=0)
        {
            throw new StockInsuficienteException("El stock a asignar no puede ser menor o igual a 0");
        }
        this.stock = stock;
    }

    private void setPrecio(double precio) throws PrecioInvalidoException {
        if(precio <=0)
        {
            throw new PrecioInvalidoException("El precio a asignar no puede ser menor o igual a 0");
        }
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }
    
    protected void reducirStock(int cantidad)
    {
        this.stock = stock - cantidad;
    }
    
    
}
