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
public abstract class Vuelo {
    private String codigoVuelo;
    private String origen;
    private String destino;
    private int cantidadAsientos;
    private int asientosReservados;
    private LocalDateTime fechaSalida;

    public Vuelo(String codigoVuelo, String origen, String destino, int cantidadAsientos, int asientosReservados, LocalDateTime fechaSalida) {
        this.codigoVuelo = codigoVuelo;
        this.origen = origen;
        this.destino = destino;
        this.cantidadAsientos = cantidadAsientos;
        this.asientosReservados = asientosReservados;
        this.fechaSalida = fechaSalida;
    }
    
    
    
    public abstract void reservarAsiento();
    public abstract void cancelarReserva();
}
