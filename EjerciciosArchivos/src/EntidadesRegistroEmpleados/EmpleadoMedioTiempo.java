package EntidadesRegistroEmpleados;

/**
 *
 * @author Fabri
 */
public class EmpleadoMedioTiempo extends Empleado{
    private double sueldoBase;
    private boolean cumplioPresentismo;

    public EmpleadoMedioTiempo(String nombre, double salarioMensual, boolean cumplioPresentismo) {
        super(nombre,TipoEmpleado.MEDIO_TIEMPO);
        this.sueldoBase = salarioMensual;
        this.cumplioPresentismo = cumplioPresentismo;
    }

    @Override
    public double calcularSalario() {
        return cumplioPresentismo? sueldoBase * 1.15 : sueldoBase;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("Sueldo: $").append(calcularSalario());
        sb.append("\n");
        return sb.toString();
    }
    
}
