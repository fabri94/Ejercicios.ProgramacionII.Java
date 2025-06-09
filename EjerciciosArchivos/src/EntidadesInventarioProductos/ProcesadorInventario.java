package EntidadesInventarioProductos;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fabri
 */
public class ProcesadorInventario {
    public List<Producto> leer(String path) throws IOException {        
        List<Producto> productosInventario = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(path))) 
        {
            String linea;
            while ((linea = br.readLine()) != null) 
            {
                String[] columnas = linea.split(",");
                validarColumnas(columnas);
                
                productosInventario.add(parsearProducto(columnas));
            }
        }
        return productosInventario;
    }
    
    private boolean validarColumnas(String[] columnas){
        boolean esValido = false;
        if(columnas.length == 5){
            esValido = true;
        }
        return esValido;
    }
    
    private Producto parsearProducto(String[] columnas){
        Producto p = null;
        Categoria categoria=null;
        int codigo=0;
        double precio=0;
        int cantidadStock=0;
        
        try{
            codigo = Integer.parseInt(columnas[0]);
        }catch(NumberFormatException e){
            System.out.println("Codigo producto erroneo");
        }
        
        String nombre = columnas[1];
        
        try{
            precio = Double.parseDouble(columnas[2]);
        }catch(NumberFormatException e){
            System.out.println("Precio producto erroneo");
        }
        
        try{
            categoria = Categoria.valueOf(columnas[3]);
        }catch(IllegalArgumentException e){
            System.out.println("Categoria de producto erronea");
        }
        
        try{
            cantidadStock = Integer.parseInt(columnas[4]);
        }catch(NumberFormatException e){
            System.out.println("Cantidad stock erronea");
        }
        
        if(validarCampos(codigo,precio,categoria,cantidadStock)){
            
            p = new Producto(codigo,nombre,precio,categoria,cantidadStock);
        }
        
        return p;
    }
    
    private boolean validarCampos(int codigo, double precio, Categoria categoria, int cantidadStock){
        return codigo!=0 && precio!=0 && categoria!=null && cantidadStock!=0;
    }
}
