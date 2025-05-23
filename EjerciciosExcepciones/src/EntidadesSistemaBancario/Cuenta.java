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
    
    protected void gestionarSaldo(double monto){
        this.saldo = this.saldo - monto;
    }
    
    public void depositar(double monto){
        if(monto<=0){
            throw new TransaccionInvalidaException("ERROR, el monto a depositar debe ser mayor a 0\n");
        }
        this.saldo += monto;
    }
    
    //codigo repetido que hace exactamente lo mismo en las clases hijas
    //se implementa este metodo final (hijas no sobreescriban el metodo) en donde se procesa el retiro
    //y se lanzan las excepciones correspondientes que son repetitivas y variaran unicamente por limite de extraccion o si la cuenta esta bonificada
    protected final void procesarRetiro(double monto){
        if(monto<0){
            throw new TransaccionInvalidaException("ERROR, el monto a retirar no puede ser menor a 0");
        }
        if(this.saldo<monto){
            throw new FondosInsuficientesException("ERROR, no posee fondos suficientes para realizar esta extraccion");
        }
        if(!validarRetiro(monto)){
            throw new TransaccionInvalidaException("ERROR, la cantidad a extraer es mayor al limite permitido");
        }
        this.gestionarSaldo(monto);
        System.out.println("Se extrajo "+monto+" de la cuenta de "+this.titular);
    }
    
    public abstract void retirar(double monto);
    protected abstract boolean validarRetiro(double monto);
}
