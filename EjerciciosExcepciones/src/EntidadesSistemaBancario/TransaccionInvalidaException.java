package EntidadesSistemaBancario;
/**
 *
 * @author Fabri
 */
public class TransaccionInvalidaException extends RuntimeException{

    public TransaccionInvalidaException(String mensaje) {
        super(mensaje);
    } 
}
