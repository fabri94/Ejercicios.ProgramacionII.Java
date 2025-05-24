package EntidadesSistemaBancario;
/**
 *
 * @author Fabri
 */
public class CuentaAhorro extends Cuenta{
    private boolean estaBonificada;
    
    public CuentaAhorro(Cliente cliente, double saldo, boolean estaBonificada) {
        super(cliente, saldo);
        this.estaBonificada = estaBonificada;
    }

    @Override
    public void retirar(double monto) {
        super.procesarRetiro(monto);
    }
    
    @Override
    protected boolean validarRetiro(double monto){
        return estaBonificada || monto<2000;
    }    
}
