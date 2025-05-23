package EntidadesSistemaBancario;

/**
 *
 * @author Fabri
 */
public class CuentaAhorro extends Cuenta{

    private boolean estaBonificada;
    
    public CuentaAhorro(String titular, double saldo, boolean estaBonificada) {
        super(titular, saldo);
        this.estaBonificada = estaBonificada;
    }

    @Override
    public void retirar(double monto) {
        if(getSaldo()<monto){
            throw new FondosInsuficientesException("ERROR, fondos insuficientes");
        }
        if((!validarRetiro(monto)) || monto<0){
            throw new TransaccionInvalidaException("ERROR, no es posible avanzar con la transaccion solicitada");
        }
        super.gestionarSaldo(monto);
        System.out.println("Se extrajo "+monto+" de la cuenta");
        
    }
    
    private boolean validarRetiro(double monto){
        boolean esValido = false;
        
        if(this.estaBonificada || (!this.estaBonificada && monto<2000)){
            esValido = true;
        }
        return esValido;
    }
    
}
