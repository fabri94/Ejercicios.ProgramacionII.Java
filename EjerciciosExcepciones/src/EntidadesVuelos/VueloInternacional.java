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
public class VueloInternacional extends Vuelo{
    private String paisDestino;
    private boolean requierePasaporte;
    private double tasaInternacional;

    public VueloInternacional(String paisDestino, boolean requierePasaporte, double tasaInternacional, String codigoVuelo, String origen, String destino, int cantidadAsientos, int asientosReservados, LocalDateTime fechaSalida) {
        super(codigoVuelo, origen, destino, cantidadAsientos, asientosReservados, fechaSalida);
        this.paisDestino = paisDestino;
        this.requierePasaporte = requierePasaporte;
        this.tasaInternacional = tasaInternacional;
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
