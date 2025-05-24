package EntidadesEvaluacionAcademica;

/**
 *
 * @author Fabri
 */
public class TrabajoPractico extends Evaluacion implements Imprimible{

    private boolean seEntrego;

    public TrabajoPractico(Alumno alumno, boolean seEntrego){
        super(alumno);
        this.seEntrego = seEntrego;
    }
    
    @Override
    public void calificar(int nota) throws NotaInvalidaException{
        if(!this.seEntrego)
        {
            throw new NotaInvalidaException("Trabajo practico no entregado. No hay material que calificar\n");
        }
        super.calificar(nota);
    }
    
    @Override
    public void imprimirResultado() {
        System.out.println(mostrarCalificacion());
    }
    
    private String mostrarCalificacion(){
        StringBuilder sb = new StringBuilder();
        sb.append("TRABAJO PRACTICO\n----------------------------\n").append("Alumno: ").append(alumno.getNombreCompleto()).append("\nCalificacion: ").append(obtenerNota()).append("\n");
        return sb.toString();
    }
    
    
}
