package EntidadesVuelos;

import java.time.LocalDateTime;

/**
 *
 * @author Fabri
 */
public class VueloNacional extends Vuelo implements Reservable{

    private String provinciaDestino;
    private boolean requiereDni;

    public VueloNacional(String codigoVuelo, String origen, String destino, int asientosReservados, int asientosTotales, LocalDateTime fechaSalida, String provinciaDestino, boolean requiereDni) {
        super(codigoVuelo, origen, destino, asientosReservados, asientosTotales, fechaSalida);
        this.provinciaDestino = provinciaDestino;
        this.requiereDni = requiereDni;
    }

    @Override
    public void reservarAsiento() {
        if(super.getAsientosDisponibles()>0){
            super.aumentarReserva();
        }else{
            throw new AsientoNoDisponibleException("No hay asientos disponibles para el vuelo elegido");
        }
    }

    @Override
    public void cancelarReserva() {
        super.reducirReserva();
    }

    @Override
    public void confirmarReserva() {
        System.out.println("La reserva para su vuelo ha sido confirmada\n");
        System.out.println("Detalles de su reserva: \n\n"+this);
    }
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nPROVINCIA DESTINO: ").append(this.provinciaDestino).append("\n");
        sb.append("REQUIERE DNI: ").append(this.requiereDni ? "SI" : "NO").append("\n");
        return sb.toString();
    }    
      
}
