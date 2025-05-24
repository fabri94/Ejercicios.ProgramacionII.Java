package EntidadesEvaluacionAcademica;

/**
 *
 * @author Fabri
 */
public class Examen extends Evaluacion implements Imprimible{
    
    private boolean sePresento;

    public Examen(Alumno alumno, boolean sePresento) {
        super(alumno);
        this.sePresento = sePresento;
    }
       
    @Override
    public void calificar(int nota) throws NotaInvalidaException{
        if(!sePresento){
            throw new NotaInvalidaException("El alumno no se presento al examen. No es posible calificar");
        }
        super.calificar(nota);
    }

    @Override
    public void imprimirResultado() {
        System.out.println(mostrarCalificacion());
    }
    
    private String mostrarCalificacion(){
        StringBuilder sb = new StringBuilder();
        sb.append("Parcial\n-------------------\n").append("Alumno: ").append(alumno.getNombreCompleto()).append("\nCalificacion: ").append(obtenerNota()).append("\n");
        return sb.toString();
    }
    
    
}
