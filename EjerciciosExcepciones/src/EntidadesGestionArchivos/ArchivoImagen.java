package EntidadesGestionArchivos;
/**
 *
 * @author Fabri
 */
public class ArchivoImagen extends Archivo implements Compresible{

    public ArchivoImagen(String nombre, boolean existe, boolean tienePermiso) {
        super(nombre, existe, tienePermiso);
    }

    @Override
    public void leer() throws ArchivoNoEncontradoException, PermisoDenegadoException{
        validarAcceso();
        System.out.println("Abriendo imagen: "+this.getNombre());
    }

    @Override
    public void escribir(String texto) throws ArchivoNoEncontradoException, PermisoDenegadoException{
        validarAcceso();
        System.out.println("Se cambio de color la imagen: "+this.getNombre()+" por el color: \n"+texto);
    }

    @Override
    public void comprimir() throws ArchivoNoEncontradoException{
        if(!this.getExistencia()){
            throw new ArchivoNoEncontradoException("ERROR, la imagen "+this.getNombre()+" a comprimir NO EXISTE");
        }
        System.out.println("Imagen: "+this.getNombre()+" comprimido exitosamente");
    }
    
}
