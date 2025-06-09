package EntidadesInventarioProductos;

import java.util.Objects;

/**
 *
 * @author Fabri
 */
public class Producto {
    private int codigo;
    private String nombre;
    private double precio;
    private Categoria categoria;
    private int cantidadStock;

    public Producto(int codigo, String nombre, double precio, Categoria categoria, int cantidadStock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.cantidadStock = cantidadStock;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Producto - ").append(this.nombre).append("\n");
        sb.append("Categoria - ").append(this.categoria).append("\n");
        sb.append("Precio - ").append(this.getPrecio()).append("\n");
        return sb.toString();
    }
    
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        Producto otro = (Producto)obj;
        return this.codigo == otro.codigo && 
               Objects.equals(this.nombre, otro.nombre) 
               && this.categoria == otro.categoria;
    }
}
