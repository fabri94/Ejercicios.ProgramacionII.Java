package EntidadesEvaluacionAcademica;

/**
 *
 * @author Fabri
 */
public abstract class Evaluacion {
    private int nota;
    protected Alumno alumno;

    public Evaluacion(Alumno alumno) {
        this.alumno = alumno;
    }
        
    public int obtenerNota(){
        return this.nota;
    }
    
    public void calificar(int nota) throws NotaInvalidaException{
        if (nota < 0 || nota > 10) 
        {
            throw new NotaInvalidaException("La nota debe estar entre 0 y 10.");
        }
        this.nota = nota;
    }
}
