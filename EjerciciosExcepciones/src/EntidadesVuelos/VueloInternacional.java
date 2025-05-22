package EntidadesVuelos;

import java.time.LocalDateTime;

/**
 *
 * @author Fabri
 */
public class VueloInternacional extends Vuelo implements Reservable{
    private String paisDestino;
    private boolean requierePasaporte;
    private double tasaInternacional;

    public VueloInternacional(String codigoVuelo, String origen, String destino, int asientosReservados, int asientosTotales, LocalDateTime fechaSalida, String paisDestino, boolean requierePasaporte, double tasaInternacional) {
        super(codigoVuelo, origen, destino, asientosReservados, asientosTotales, fechaSalida);
        this.paisDestino = paisDestino;
        this.requierePasaporte = requierePasaporte;
        this.tasaInternacional = tasaInternacional;
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
        sb.append("\nPAIS DESTINO: ").append(this.paisDestino).append("\n");
        sb.append("TASA INTERNACIONAL: ").append(this.tasaInternacional).append("\n");
        sb.append("REQUIERE PASAPORTE: ").append(this.requierePasaporte ? "SI" : "NO").append("\n");
        return sb.toString();
    }
        
}
