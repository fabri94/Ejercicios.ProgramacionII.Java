package EntidadesSistemaBancario;
/**
 *
 * @author Fabri
 */
public abstract class Cuenta {
    private Cliente cliente;
    private double saldo;

    public Cuenta(Cliente cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }
    
    protected void gestionarSaldo(double monto){
        this.saldo = this.saldo - monto;
    }
    
    public void depositar(double monto){
        if(monto<=0){
            throw new TransaccionInvalidaException("ERROR, el monto a depositar debe ser mayor a 0\n");
        }
        this.cliente.notificar("Se depositaron: $"+monto+" en la cuenta");
        this.saldo += monto;
    }
    
    protected void notificarCliente(String notificacion){
        this.cliente.notificar(notificacion);
    }
    
    //codigo repetido que hace exactamente lo mismo en las clases hijas
    //se implementa este metodo final (hijas no sobreescriban el metodo) en donde se procesa el retiro
    //y se lanzan las excepciones correspondientes que son repetitivas y variaran unicamente por limiteExtraccionDolares (c corriente) o si la cuenta esta bonificada (c ahorro)
    protected final void procesarRetiro(double monto){
        if(monto<0){
            throw new TransaccionInvalidaException("ERROR, el monto a retirar no puede ser menor a 0\n");
        }
        if(this.saldo<monto){
            throw new FondosInsuficientesException("ERROR, no posee fondos suficientes para realizar esta extraccion\n");
        }
        if(!validarRetiro(monto)){
            throw new TransaccionInvalidaException("ERROR, la cantidad a extraer es mayor al limite permitido\n");
        }
        this.gestionarSaldo(monto);
        this.cliente.notificar("Se extrajo: $"+monto+" de la cuenta");
    }
    
    public abstract void retirar(double monto);
    protected abstract boolean validarRetiro(double monto);
}
