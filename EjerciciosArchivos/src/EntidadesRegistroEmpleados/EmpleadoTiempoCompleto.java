package EntidadesRegistroEmpleados;

/**
 *
 * @author Fabri
 */
public class EmpleadoTiempoCompleto extends Empleado{
    
    private double sueldoBase;
    private int horasExtra;
    
    public EmpleadoTiempoCompleto(String nombre, double salarioMensual, int horasExtra) {
        super(nombre,TipoEmpleado.TIEMPO_COMPLETO);
        this.sueldoBase = salarioMensual;
        this.horasExtra = horasExtra;
    }
    

    @Override
    public double calcularSalario() {
        double valorHoraExtra = 4000;
        return sueldoBase + (valorHoraExtra * horasExtra);
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("Sueldo: $").append(calcularSalario());
        sb.append("\n");
        return sb.toString();
    }
}
