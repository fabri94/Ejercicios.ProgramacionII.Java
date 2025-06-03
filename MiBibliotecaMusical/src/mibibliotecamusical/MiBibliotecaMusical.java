package mibibliotecamusical;

import Entidades.*;
import java.util.ArrayList;

/**
 *
 * @author Fabri
 */
public class MiBibliotecaMusical {

    public static void main(String[] args) {
        String biblioteca = "biblioteca.json";
        String favoritos = "favoritos.json";
        String albumes = "albumes.json";
        
        Gestor<Cancion> gC = new Gestor();
        ArrayList<Cancion> canciones = new ArrayList<>();
        ArrayList<Cancion> can2 = new ArrayList<>();
        
        Cancion c1 = new Cancion("Billie Jean",4.30,1981);
        Cancion c2 = new Cancion("Thriller",5.20,1980);
        Cancion c3 = new Cancion("La vida es bella",4.20,1980);
        Cancion c4 = new Cancion("Thriller",5.20,1980);
        
        Artista a1 = new Artista("MJ",EstiloMusical.POP);
        Album alb1 = new Album("Thriller",1982,a1,canciones);
        
        canciones.add(c1);
        canciones.add(c2);       
        
        //SerializadoraJSON.guardar(canciones, favoritos);
        
        can2 = SerializadoraJSON.leer(favoritos, Cancion.class);
        for (Cancion cancion : can2) {
            System.out.println(cancion.toString());
        }
        
        gC.agregar(c1);
        gC.agregar(c2);
        for (Cancion cancion : gC.obtenerTodos()) {
            System.out.println(cancion.toString());
        }
        
        gC.actualizar(c2, c4);
        for (Cancion cancion : gC.obtenerTodos()) {
            System.out.println(cancion.toString());
        }
    }
    
}
