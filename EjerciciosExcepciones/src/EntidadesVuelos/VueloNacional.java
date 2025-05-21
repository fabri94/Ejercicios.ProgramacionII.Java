/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesVuelos;

import java.time.LocalDateTime;

/**
 *
 * @author Fabri
 */
public class VueloNacional extends Vuelo{

    private String provinciaDestino;
    private boolean requiereDni;

    public VueloNacional(String codigoVuelo, String origen, String destino, int cantidadAsientos, int asientosReservados, LocalDateTime fechaSalida, String provinciaDestino, boolean requiereDni) {
        super(codigoVuelo, origen, destino, cantidadAsientos, asientosReservados, fechaSalida);
        this.provinciaDestino = destino;
        this.requiereDni = requiereDni;
    }

    @Override
    public void reservarAsiento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void cancelarReserva() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
