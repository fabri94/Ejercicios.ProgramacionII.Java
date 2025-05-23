package EntidadesSistemaBancario;
/**
 *
 * @author Fabri
 */
public class CuentaCorriente extends Cuenta{

    private double limiteExtraccionDolares;
    
    public CuentaCorriente(String titular, double saldo, double limiteExtraccionDolares) {
        super(titular, saldo);
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
