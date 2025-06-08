package EntidadesRegistroEmpleados;

/**
 *
 * @author Fabri
 */
public abstract class Empleado {
    private String nombre;
    private TipoEmpleado tipo;

    public Empleado(String nombre, TipoEmpleado tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public TipoEmpleado getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    public abstract double calcularSalario();

    @Override
    public String toString() {
        return "Nombre: "+this.nombre+"\nTipo: "+this.tipo+"\n";
    }
    
    
}
