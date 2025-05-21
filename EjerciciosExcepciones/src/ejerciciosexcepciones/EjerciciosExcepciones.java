
package ejerciciosexcepciones;

import Entidades.PrecioInvalidoException;
import Entidades.ProductoNoPerecedero;
import Entidades.ProductoPerecedero;
import Entidades.StockInsuficienteException;

/**
 *
 * @author Fabri
 */
public class EjerciciosExcepciones {

    
    public static void main(String[] args) {
      
       try {
            // Crear productos (estos constructores pueden lanzar excepciones)
            ProductoPerecedero leche = new ProductoPerecedero("Leche", 150.0, 10);
            ProductoNoPerecedero arroz = new ProductoNoPerecedero("Arroz", 100.0, 5);
            ProductoPerecedero leche2 = new ProductoPerecedero("Leche", 150.0, 0);
            ProductoNoPerecedero arroz2 = new ProductoNoPerecedero("Arroz", -20.0, 5);

            // Mostrar stock inicial
            System.out.println("Stock inicial:");
            System.out.println("Leche: " + leche.getStock());
            System.out.println("Arroz: " + arroz.getStock());

            // Simular venta válida
            System.out.println("\nVendiendo 3 unidades de leche...");
            leche.vender(3);

            // Simular venta con error de stock
            System.out.println("\nVendiendo 10 unidades de arroz...");
            arroz.vender(10);  // Esto debería lanzar StockInsuficienteException

        } catch (StockInsuficienteException e) {
            System.out.println("⚠️ Error de stock: " + e.getMessage());
        } catch (PrecioInvalidoException e) {
            System.out.println("⚠️ Error de precio: " + e.getMessage());
        } finally {
            System.out.println("\nFinalizando operación (bloque finally ejecutado siempre).");
        }
    }
}
