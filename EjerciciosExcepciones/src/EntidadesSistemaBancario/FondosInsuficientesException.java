package EntidadesSistemaBancario;
/**
 *
 * @author Fabri
 */
public class FondosInsuficientesException extends RuntimeException{

    public FondosInsuficientesException(String mensaje) {
        super(mensaje);
    }  
}
