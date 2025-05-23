package ejerciciosexcepciones;

import EntidadesGestionInventario.PrecioInvalidoException;
import EntidadesGestionInventario.ProductoNoPerecedero;
import EntidadesGestionInventario.ProductoPerecedero;
import EntidadesGestionInventario.StockInsuficienteException;
import EntidadesVuelos.AsientoNoDisponibleException;
import EntidadesVuelos.Reservable;
import EntidadesVuelos.Vuelo;
import EntidadesVuelos.VueloInternacional;
import EntidadesVuelos.VueloNacional;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fabri
 */
public class EjerciciosExcepciones {
    
    public static void main(String[] args) {
      
       gestionDeInventario();
       reservasDeVuelos();
    }
    
    public static void gestionDeInventario(){
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
    
    
    public static void reservasDeVuelos()
    {
        Vuelo vueloPepe1 = new VueloNacional("C103","Pepelandia","Rosario",0,2,LocalDateTime.of(2025, 5, 20, 14, 30),"Chubut",true);
        Vuelo vueloPepe2 = new VueloInternacional("A400","Pepelandia","Paris",0,1,LocalDateTime.of(2025, 5, 20, 14, 30),"Francia",false,4000.0);
        
        List<Reservable> reservasAvion = new ArrayList<>();
        reservasAvion.add(vueloPepe1);
        reservasAvion.add(vueloPepe2);
        vueloPepe1.reservarAsiento();
        vueloPepe1.reservarAsiento();
        vueloPepe2.reservarAsiento();
        try{
            vueloPepe2.reservarAsiento();
        }catch(AsientoNoDisponibleException e){
            System.out.println("Error de reserva: "+e.getMessage());
        }
        
        for(Reservable r : reservasAvion){
            r.confirmarReserva();
        }
        
        System.out.println("Reservas vueloPepe1: "+vueloPepe1.getAsientosReservados());
        System.out.println("Reservas vueloPepe2: "+vueloPepe2.getAsientosReservados());
    }
}
