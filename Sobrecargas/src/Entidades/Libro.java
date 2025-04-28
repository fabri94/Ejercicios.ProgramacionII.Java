/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Fabri
 */
public class Libro {
    private String titulo;
    private String autor;
    private Genero genero;

    public Libro(String titulo, String autor, Genero genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }
    
    public boolean esGenero(String generoRecibido)
    {
        boolean esGeneroRecibido = false;
        if(genero != null)
        {
            if(this.genero.getDescripcion().equalsIgnoreCase(generoRecibido)
                    ||this.genero.name().equalsIgnoreCase(generoRecibido))
            {
                esGeneroRecibido = true;
            }
        }
        return esGeneroRecibido;
    }
}
