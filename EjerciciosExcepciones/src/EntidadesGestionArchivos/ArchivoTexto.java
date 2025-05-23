package EntidadesGestionArchivos;

/**
 *
 * @author Fabri
 */
public class ArchivoTexto extends Archivo implements Compresible{

    public ArchivoTexto(String nombre, boolean existe, boolean tienePermiso) {
        super(nombre, existe, tienePermiso);
    }
    @Override
    public void leer() throws ArchivoNoEncontradoException, PermisoDenegadoException{
        validarAcceso();
        System.out.println("Leyendo archivo de texto: "+this.getNombre()+"\n");
    }

    @Override
    public void escribir(String contenido) throws ArchivoNoEncontradoException, PermisoDenegadoException{
        validarAcceso();
        System.out.println("Se modifico el archivo de texto "+this.getNombre()+" y se agrego lo siguiente: \n"+contenido);
    }

    @Override
    public void comprimir() throws ArchivoNoEncontradoException{
        if(!this.getExistencia()){
            throw new ArchivoNoEncontradoException("ERROR, el archivo de texto "+this.getNombre()+" a comprimir NO EXISTE\n");
        }
        System.out.println("Archivo de texto "+this.getNombre()+" comprimido exitosamente\n");
    }
    
}
