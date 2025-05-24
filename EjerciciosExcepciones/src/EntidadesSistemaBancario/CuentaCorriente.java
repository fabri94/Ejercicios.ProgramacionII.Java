package EntidadesSistemaBancario;
/**
 *
 * @author Fabri
 */
public class CuentaCorriente extends Cuenta{

    private double limiteExtraccionDolares;
    
    public CuentaCorriente(Cliente cliente, double saldo, double limiteExtraccionDolares) {
        super(cliente, saldo);
        this.limiteExtraccionDolares = limiteExtraccionDolares;
    }

    @Override
    public void retirar(double monto) {
        super.procesarRetiro(monto);
    }

    @Override
    protected boolean validarRetiro(double monto) {
        return monto <= this.limiteExtraccionDolares;
    }
}
