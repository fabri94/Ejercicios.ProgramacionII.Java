/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Fabri
 */
public interface ICRUD <T>{
    void agregar(T elemento);
    void actualizar(T elementoAnterior, T elementoModificado);
    void eliminar(T elemento);
    ArrayList<T> obtenerTodos();
}
