/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Fabri
 */
public class JuegoAccion extends Juego{

    public JuegoAccion(String titulo, double pesoGB) {
        super(titulo, pesoGB);
        super.consolasCompatibles.add(TipoConsola.PLAYSTATION);
        super.consolasCompatibles.add(TipoConsola.PC);
    }
    
    
}
