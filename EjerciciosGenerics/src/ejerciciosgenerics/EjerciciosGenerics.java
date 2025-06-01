package ejerciciosgenerics;

import EntidadesContabilidad.*;
import EntidadesTorneo.*;
import java.time.LocalDateTime;

/**
 *
 * @author Fabri
 */
public class EjerciciosGenerics {

    public static void main(String[] args) {
        //ejercicioTorneo();
        ejercicioContabilidad();
    }
    
    public static void ejercicioTorneo(){

        EquipoFutbol river = new EquipoFutbol("River Plate", LocalDateTime.of(1901, 5, 25, 0, 0));
        EquipoFutbol boca = new EquipoFutbol("Boca Juniors", LocalDateTime.of(1905, 4, 3, 0, 0));
        EquipoFutbol racing = new EquipoFutbol("Racing Club", LocalDateTime.of(1903, 3, 25, 0, 0));

        EquipoBasquet bulls = new EquipoBasquet("Chicago Bulls", LocalDateTime.of(1966, 1, 16, 0, 0));
        EquipoBasquet lakers = new EquipoBasquet("LA Lakers", LocalDateTime.of(1947, 11, 1, 0, 0));
        EquipoBasquet celtics = new EquipoBasquet("Boston Celtics", LocalDateTime.of(1946, 6, 6, 0, 0));

        Torneo<EquipoFutbol> torneoFutbol = new Torneo<>("Liga Profesional de Futbol");
        torneoFutbol.agregar(river);
        torneoFutbol.agregar(boca);
        torneoFutbol.agregar(racing);

        Torneo<EquipoBasquet> torneoBasquet = new Torneo<>("NBA");
        torneoBasquet.agregar(bulls);
        torneoBasquet.agregar(lakers);
        torneoBasquet.agregar(celtics);

        System.out.println(torneoFutbol.mostrar());
        System.out.println(torneoBasquet.mostrar());

        System.out.println("Simulando partidos...");
        System.out.println(torneoFutbol.jugarPartido());
        System.out.println(torneoBasquet.jugarPartido());
        System.out.println(torneoFutbol.jugarPartido());
        System.out.println(torneoBasquet.jugarPartido());
    }
    
    public static void ejercicioContabilidad(){
        Contabilidad c = new Contabilidad();
        Documento facturaPepe = new Factura(1);
        Documento facturaPepe2 = new Factura(1);
        Documento reciboPepe = new Recibo(1);
        Documento reciboPepe2 = new Recibo(1);
        
        Contabilidad.agregarEgreso(c, facturaPepe);
        Contabilidad.agregarEgreso(c, facturaPepe2);
        Contabilidad.agregarIngreso(c, reciboPepe);
        Contabilidad.agregarIngreso(c, reciboPepe2);

        
        System.out.println(c.toString());
    }
}
