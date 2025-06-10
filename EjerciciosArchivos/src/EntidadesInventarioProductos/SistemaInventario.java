package EntidadesInventarioProductos;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Fabri
 */
public class SistemaInventario implements ISistemaInventario{

    private Inventario inventario;
    private String nombre;

    public SistemaInventario(String nombre) {
        this.inventario = new Inventario(nombre);
    }

    @Override
    public void cargarProductosDesdeArchivo(String path) {
        ProcesadorInventario proce = new ProcesadorInventario();
        try{
            List<Producto> productos = proce.leer(path);
            for (Producto p : productos) {
                this.inventario.agregarProducto(p);
            }
        }catch(IOException e){
            System.out.println("No es posible leer archivo "+e.getMessage());
        }
    }

    @Override
    public List<Producto> buscarPorCategoria(Categoria categoria) {
        return inventario.buscarPorCategoria(categoria);
    }

    @Override
    public void guardarResultados(List<Producto> productos, String archivoSalida) {
        ProcesadorInventario proce = new ProcesadorInventario();
        
        try{
            File archivo = new File(archivoSalida);
            boolean seAppendea = archivo.exists();
            proce.escribir(productos, archivoSalida, seAppendea);
            System.out.println("Resultados guardados en "+archivoSalida);
        }catch(IOException e){
            System.out.println("Error al guardar los resultados: "+e.getMessage());
        }
    }
    
}
