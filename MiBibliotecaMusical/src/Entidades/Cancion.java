package Entidades;

/**
 *
 * @author Fabri
 */
public class Cancion {
    private String nombre;
    private double duracion;
    private int anioLanzamiento;

    public Cancion(String nombre, double duracion, int anioLanzamiento) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.anioLanzamiento = anioLanzamiento;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("titulo - ").append(this.nombre).append("\n");
        sb.append("duracion - ").append(this.duracion).append("\n");
        sb.append("anio lanzamiento - ").append(this.anioLanzamiento).append("\n");
        return sb.toString();
    }

    public double getDuracion() {
        return duracion;
    }
    
    @Override
    public boolean equals(Object obj){
        boolean mismaCancion = false;
        if(obj == this){
            mismaCancion = true;
        }
        if(obj instanceof Cancion otra){
            if(otra.nombre.equals(this.nombre) 
                    && otra.duracion == this.duracion 
                    && otra.anioLanzamiento == this.anioLanzamiento){
                mismaCancion = true;
            }
        }
        
        return mismaCancion;
    }
    
    
    
    
}
