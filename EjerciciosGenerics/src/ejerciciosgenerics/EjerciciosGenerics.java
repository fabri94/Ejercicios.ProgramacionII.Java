package ejerciciosgenerics;

import EntidadesContabilidad.*;
import EntidadesDeposito.*;
import EntidadesTorneo.*;
import java.time.LocalDateTime;

/**
 *
 * @author Fabri
 */
public class EjerciciosGenerics {

    public static void main(String[] args) {
        ejercicioTorneo();
        //ejercicioContabilidad();
        //ejercicioDeposito();
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

    public static void ejercicioDeposito() {
        
        Cocina c1 = new Cocina(111, 12300, false);
        Cocina c2 = new Cocina(112, 15000, true);
        Cocina c3 = new Cocina(113, 5600, false);
        Auto a1 = new Auto("Rojo", "Ferrar");
        Auto a2 = new Auto("Amarillo" ,"Porche");
        Auto a3 = new Auto("Negro", "BMW");
        Auto a4 = new Auto("Verde", "Ford");
        Deposito<Cocina> dc = new Deposito<Cocina>(2);
        Deposito<Auto> da = new Deposito<Auto>(3);
        dc.agregar(c1);
        dc.agregar(c2);
        
        if(!(dc.agregar(c3)))
        {
            System.out.println("No se pudo agregar el item!!!");
        }

        if ((da.agregar(a1)))
        {
            System.out.println("Se ha agregado el item!!!");
        }
        
        da.agregar(a2);
        da.agregar(a3);
        
        if (!da.agregar(a4))
        {
            System.out.println("No se pudo agregar el item!!!");
        }
        
        System.out.println(dc);
        System.out.println(da);
        dc.remover(c2);
        
        if (!(dc.remover(c2)))
        {
            System.out.println("No se pudo remover el item!!!");
        }
        
        da.remover(a2);
        if (!(da.remover(a4)))
        {
            System.out.println("No se pudo remover el item!!!");
        }
        System.out.println(dc);
        System.out.println(da);
        
        }
}
