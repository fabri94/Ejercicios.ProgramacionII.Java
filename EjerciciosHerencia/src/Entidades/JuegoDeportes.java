/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Fabri
 */
public class JuegoDeportes extends Juego{

    public JuegoDeportes(String titulo, double pesoGB) {
        super(titulo, pesoGB);
        super.consolasCompatibles.add(TipoConsola.XBOX);
        super.consolasCompatibles.add(TipoConsola.PLAYSTATION);
    }
    
}
