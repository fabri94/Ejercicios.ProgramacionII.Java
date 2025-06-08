package EntidadesRegistroEmpleados;

/**
 *
 * @author Fabri
 */
public enum TipoEmpleado {
    TIEMPO_COMPLETO("Tiempo Completo"),
    MEDIO_TIEMPO("Medio tiempo");
    
    private String descripcion;
    
    TipoEmpleado(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
}
