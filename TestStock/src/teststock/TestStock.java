/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teststock;

import Entidades.Producto;
import Entidades.Venta;

/**
 *
 * @author Fabri
 */
public class TestStock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Producto productoPepe1 = new Producto("Galletitas",1300,200);
       Producto productoPepe2 = new Producto("Gaseosa",3000,10);
       Producto productoPepe3 = new Producto("Harina",800,5);
        
        System.out.println(productoPepe1.mostrar());
        System.out.println(productoPepe2.mostrar());
        System.out.println(productoPepe3.mostrar());
       
       Venta venta1 = new Venta(productoPepe1, 204);
       Venta venta2 = new Venta(productoPepe2, 3);
       Venta venta3 = new Venta(productoPepe3, 4);
       
       if(venta1.realizarVenta())
       {
           System.out.println(venta1.mostrarDetalle());
       }else
       {
           System.out.println("Hubo un error con la venta\n");
       }
       if(venta2.realizarVenta())
       {
           System.out.println(venta2.mostrarDetalle());
       }else
       {
           System.out.println("Hubo un error con la venta\n");
       }
       if(venta3.realizarVenta())
       {
           System.out.println(venta3.mostrarDetalle());
       }else
       {
           System.out.println("Hubo un error con la venta\n");
       }
        
       
       
       
        
    }
    
}
