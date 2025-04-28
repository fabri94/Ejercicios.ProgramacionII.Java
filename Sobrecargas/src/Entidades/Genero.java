/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Entidades;

/**
 *
 * @author Fabri
 */
public enum Genero {
    FICCION("Ficcion"),
    NO_FICCION("No Ficcion"),
    POESIA("Poesia"),
    ENSAYO("Ensayo"),
    INFANTIL("Literatura Infantil");
    
    private final String descripcion;
    
    Genero(String descripcion)
    {
        this.descripcion = descripcion;
    }
    
    public String getDescripcion()
    {
        return this.descripcion;
    }
}
