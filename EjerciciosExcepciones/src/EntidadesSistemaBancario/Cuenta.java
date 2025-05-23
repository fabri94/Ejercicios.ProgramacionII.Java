package EntidadesSistemaBancario;

/**
 *
 * @author Fabri
 */
public abstract class Cuenta {
    private String titular;
    private double saldo;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    
    protected double getSaldo(){
        return this.saldo;
    }
    
    protected void gestionarSaldo(double monto){
        this.saldo = this.saldo - monto;
    }
    
    public void depositar(double monto){
        if(monto<=0){
            throw new TransaccionInvalidaException("ERROR, el monto a depositar debe ser mayor a 0\n");
        }
    }
    
    
    public abstract void retirar(double monto);
    
}
