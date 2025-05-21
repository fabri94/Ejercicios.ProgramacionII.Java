/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Fabri
 */
public class ProductoNoPerecedero extends Producto implements IVendible{
    
    public ProductoNoPerecedero(String nombre, double precio, int stock) throws StockInsuficienteException, PrecioInvalidoException {
        super(nombre, precio, stock);
    }

    @Override
    public void vender(int cantidad) throws StockInsuficienteException {
        if(cantidad > super.getStock()){
            throw new StockInsuficienteException("No hay stock suficiente para vender la cantidad requerida");
        }
        reducirStock(cantidad);
            
    }
    
}
