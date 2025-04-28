package ejerciciosherencia;

import Entidades.Consola;
import Entidades.Juego;
import Entidades.JuegoAccion;
import Entidades.JuegoDeportes;
import Entidades.LlaveInglesa;
import Entidades.Taladro;
import Entidades.Taller;
import Entidades.TipoConsola;
import Entidades.TipoMaterial;

/**
 *
 * @author Fabri
 */
public class EjerciciosHerencia {

    
    public static void main(String[] args) {
        
        
        //EJERCICIO 1
        //------------------------------------------------
        /*
        Taller tallerPepe = new Taller(5);
        
        Taladro taladroPepe = new Taladro("Pepe Silvia",6000,7500,false);
        Taladro taladroPepe2 = new Taladro("Turboneitor",650,70,true);
        LlaveInglesa llavePepe = new LlaveInglesa("Pepe Silvia",1000,TipoMaterial.TITANIO,true);
        LlaveInglesa llavePepe2 = new LlaveInglesa("Motoneitor",4000,TipoMaterial.CROMO_VANADIO,false);
        LlaveInglesa llavePepe3 = new LlaveInglesa("Lavandeira",750,TipoMaterial.ALUMINIO,true);
        LlaveInglesa llavePepe4 = new LlaveInglesa("Peponeitor",75440,TipoMaterial.TITANIO,false);
        LlaveInglesa llavePepe5 = new LlaveInglesa("Peponeitor 3000",750,TipoMaterial.CROMO_VANADIO,true);
        LlaveInglesa llavePepe6 = new LlaveInglesa("El pepo",10,TipoMaterial.ALUMINIO,false);
        
        tallerPepe.agregarHerramienta(taladroPepe);
        tallerPepe.agregarHerramienta(taladroPepe2);
        tallerPepe.agregarHerramienta(llavePepe);
        tallerPepe.agregarHerramienta(llavePepe2);
        tallerPepe.agregarHerramienta(llavePepe3);
        tallerPepe.agregarHerramienta(llavePepe4);
        tallerPepe.agregarHerramienta(llavePepe5);
        tallerPepe.agregarHerramienta(llavePepe6);
        
        System.out.println("HERRAMIENTAS DEL TALLER ");
        System.out.println("------------------------");
        System.out.println();
        System.out.println(tallerPepe.mostrarHerramientas());
        System.out.println("Cantidad de herramientas en el taller: "+tallerPepe.getCantidadHerramientas());
        */
        
        //EJERCICIO 2
        //------------------------------------------------
        
        Consola play5 = new Consola("Playstation 5",TipoConsola.PLAYSTATION,6000);
        Consola xbox1 = new Consola("Xbox One",TipoConsola.XBOX,2000);
        Consola rogStrix = new Consola("PC ROG STRIX",TipoConsola.PC,12000);
        
        Juego pepeSilvia = new JuegoAccion("Las cronicas de Pepe Silvia",4000);
        Juego fifaStreet = new JuegoDeportes("Fifa Street",2000);
        
        play5.agregarJuego(fifaStreet);
        play5.agregarJuego(pepeSilvia);
        
        xbox1.agregarJuego(pepeSilvia);
        xbox1.agregarJuego(fifaStreet);
        
        rogStrix.agregarJuego(pepeSilvia);
        rogStrix.agregarJuego(fifaStreet);
        
        System.out.println(play5.mostrarJuegos());
        System.out.println(xbox1.mostrarJuegos());
        System.out.println(rogStrix.mostrarJuegos());
    }
    
}
