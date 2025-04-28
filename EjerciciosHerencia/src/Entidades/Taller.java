package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Fabri
 */
public class Taller {
    private ArrayList<Herramienta> coleccionDeHerramientas;
    private int cantidadMaxima;

    public Taller(int cantidadMaxima) {
        this.coleccionDeHerramientas = new ArrayList<>();
        this.cantidadMaxima = cantidadMaxima;
    }
    
    public boolean agregarHerramienta(Herramienta herramienta)
    {
        boolean pudoAgregar = false;
        if(this.coleccionDeHerramientas.size()<cantidadMaxima)
        {
            coleccionDeHerramientas.add(herramienta);
            pudoAgregar = true;
        }
        return pudoAgregar;
    }
    
    public int getCantidadHerramientas()
    {
        return coleccionDeHerramientas.size();
    }
    
    public String mostrarHerramientas()
    {
        StringBuilder sb = new StringBuilder();
        
        for(Herramienta herramienta : coleccionDeHerramientas)
        {
            if(herramienta instanceof Taladro)
            {
                sb.append(((Taladro) herramienta).mostrarTaladro());
            }
            if(herramienta instanceof LlaveInglesa)
            {
                sb.append(((LlaveInglesa) herramienta).mostrarLlaveInglesa());
            }
        }
        
        return sb.toString();
    }
    
}
