package EntidadesInventarioProductos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fabri
 */
public class Inventario {
    private String nombre;
    private List<Producto> productos;

    public Inventario(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }
    
    public void mostrarProductos(){
        for(Producto p : productos){
            System.out.println(p.toString());
        }
    }
    
    public void agregarProducto(Producto p){
        if(!this.productos.contains(p)){
            productos.add(p);
        }else{
            System.out.println("El producto ya existe en la lista");
        }
    }
    
    public List<Producto> buscarPorCategoria(Categoria c){
        List<Producto> productosBuscados = new ArrayList<>();
        for(Producto p : this.productos){
            if(p.getCategoria()== c){
                productosBuscados.add(p);
            }
        }
        return productosBuscados;
    }
    
}
