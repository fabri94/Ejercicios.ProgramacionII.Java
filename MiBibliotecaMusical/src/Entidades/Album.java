package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Fabri
 */
public class Album {
    private String titulo;
    private int anioLanzamiento;
    private Artista artista;
    private ArrayList<Cancion> canciones;

    public Album(String titulo, int anioLanzamiento, Artista artista, ArrayList<Cancion> canciones) {
        this.titulo = titulo;
        this.anioLanzamiento = anioLanzamiento;
        this.artista = artista;
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Titulo: ").append(this.titulo).append("\n");
        sb.append("Artista: ").append(this.artista.toString()).append("\n");
        sb.append("Anio lanzamiento: ").append(this.anioLanzamiento).append("\n");
        for (Cancion cancion : canciones) {
            sb.append(cancion.toString());
            sb.append("\n");
        }
        
        return sb.toString();
    }
        
}
