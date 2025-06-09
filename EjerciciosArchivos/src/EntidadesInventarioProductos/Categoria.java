package EntidadesInventarioProductos;

/**
 *
 * @author Fabri
 */
public enum Categoria {
    BEBIDA("Bebida"),
    LIMPIEZA("Limpieza"),
    ALMACEN("Almacen"),
    HIGIENE("Higiene");
    private String descripcion;
    
    Categoria(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
