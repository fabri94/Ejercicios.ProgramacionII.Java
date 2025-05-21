package ejerciciosexcepciones;

import EntidadesGestionInventario.PrecioInvalidoException;
import EntidadesGestionInventario.ProductoNoPerecedero;
import EntidadesGestionInventario.ProductoPerecedero;
import EntidadesGestionInventario.StockInsuficienteException;

/**
 *
 * @author Fabri
 */
public class EjerciciosExcepciones {
    
    public static void main(String[] args) {
      
       ejercicioUno();
    }
    
    public static void ejercicioUno(){
        try {
            
            ProductoPerecedero leche = new ProductoPerecedero("Leche", 150.0, 10);
            ProductoNoPerecedero arroz = new ProductoNoPerecedero("Arroz", 100.0, 5);
            

            System.out.println("Stock inicial:");
            System.out.println("Leche: " + leche.getStock());
            System.out.println("Arroz: " + arroz.getStock());

            
            System.out.println("\nVendiendo 3 unidades de leche...");
            leche.vender(3);

            
            System.out.println("\nVendiendo 10 unidades de arroz...");
            arroz.vender(10);

        } catch (StockInsuficienteException e) {
            System.out.println("⚠️ Error de stock: " + e.getMessage());
        } catch (PrecioInvalidoException e) {
            System.out.println("⚠️ Error de precio: " + e.getMessage());
        } finally {
            System.out.println("\nFinalizando operación (bloque finally ejecutado siempre).");
        }
    }
}
