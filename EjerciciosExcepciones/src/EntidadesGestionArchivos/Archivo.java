package EntidadesGestionArchivos;
/**
 *
 * @author Fabri
 */
public abstract class Archivo {
    
    private String nombre;
    private boolean existe;
    private boolean tienePermiso;

    public Archivo(String nombre, boolean existe, boolean tienePermiso) {
        this.nombre = nombre;
        this.existe = existe;
        this.tienePermiso = tienePermiso;
    }
    
    protected String getNombre(){
        return this.nombre;
    }
    
    protected boolean getExistencia(){
        return this.existe;
    }
    
    //metodo adicional a la consigna:
    //encapsulo logica de existe y tienePermiso en clase padre para no andar repitiendo codigo en clases hijas (DRY)
    protected void validarAcceso() throws ArchivoNoEncontradoException, PermisoDenegadoException {
        if(!this.existe){
            throw new ArchivoNoEncontradoException("ERROR, el archivo NO EXISTE");
        }
        if(!this.tienePermiso){
            throw new PermisoDenegadoException("ERROR, no cuenta con los permisos necesarios");
        }
    }
    
    public abstract void leer() throws ArchivoNoEncontradoException, PermisoDenegadoException;
    public abstract void escribir(String texto) throws ArchivoNoEncontradoException, PermisoDenegadoException;
    
}
