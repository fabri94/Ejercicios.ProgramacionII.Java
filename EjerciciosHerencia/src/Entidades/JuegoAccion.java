/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Fabri
 */
public class JuegoAccion extends Juego{

    public JuegoAccion(String titulo, double pesoGB, ArrayList<TipoConsola> consolasCompatibles) {
        super(titulo, pesoGB);
        super.consolasCompatibles = consolasCompatibles;
    }
    
    
}
