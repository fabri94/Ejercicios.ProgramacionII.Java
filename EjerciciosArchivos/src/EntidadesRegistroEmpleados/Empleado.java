package EntidadesRegistroEmpleados;

/**
 *
 * @author Fabri
 */
public abstract class Empleado {
    protected String nombre;
    

    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract double calcularSalario();

    @Override
    public String toString() {
        return "Nombre: "+ nombre;
    }
    
    
}
