package Entidades;

/**
 *
 * @author Fabri
 */
public class Artista {
    private String nombre;
    private EstiloMusical estilo;

    public Artista(String nombre, EstiloMusical estilo) {
        this.nombre = nombre;
        this.estilo = estilo;
    }

    @Override
    public String toString() {
        return "Artista: "+this.nombre+ "\nEstilo: "+this.estilo+"\n"; 
    }

    public String getNombre() {
        return nombre;
    }

    public EstiloMusical getEstilo() {
        return estilo;
    }
    
    
}
