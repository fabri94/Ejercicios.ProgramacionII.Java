/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package EntidadesInventarioProductos;

import java.util.List;

/**
 *
 * @author Fabri
 */
public interface ISistemaInventario {
    void cargarProductosDesdeArchivo(String path);
    List<Producto> buscarPorCategoria(Categoria categoria);
    void guardarResultados(List<Producto> productos, String archivoSalida);
}
