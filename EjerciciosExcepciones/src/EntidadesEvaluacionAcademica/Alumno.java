package EntidadesEvaluacionAcademica;

import java.util.ArrayList;

/**
 *
 * @author Fabri
 */
public class Alumno {
    private String nombre;
    private String apellido;
    private ArrayList<Evaluacion> evaluaciones;

    public Alumno(String nombre, String apellido, ArrayList<Evaluacion> evaluaciones) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.evaluaciones = evaluaciones;
    }
    
    public String getNombreCompleto(){
        return this.nombre + " " + this.apellido;
    }
    
}
