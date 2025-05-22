package EntidadesVuelos;

import java.time.LocalDateTime;

/**
 *
 * @author Fabri
 */
public abstract class Vuelo implements Reservable{
    private String codigoVuelo;
    private String origen;
    private String destino;
    private int asientosReservados;
    private final int asientosTotales;
    private LocalDateTime fechaSalida;

    public Vuelo(String codigoVuelo, String origen, String destino, int asientosReservados,int asientosTotales, LocalDateTime fechaSalida) {
        this.codigoVuelo = codigoVuelo;
        this.origen = origen;
        this.destino = destino;
        this.asientosReservados = asientosReservados;
        this.asientosTotales = asientosTotales;
        this.fechaSalida = fechaSalida;
    }
    
    protected void aumentarReserva(){
        this.asientosReservados++;
    }
    
    protected void reducirReserva(){
        if(this.asientosReservados > 0){
            this.asientosReservados--;
        }
    }
    
    protected int getAsientosDisponibles(){
        return this.asientosTotales - this.asientosReservados;
    }
    
    public int getAsientosReservados(){
        return this.asientosReservados;
    }
    
    public abstract void reservarAsiento();
    public abstract void cancelarReserva();
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("CODIGO VUELO: ").append(this.codigoVuelo).append("\n");
        sb.append("ORIGEN: ").append(this.origen).append("\n");
        sb.append("DESTINO: ").append(this.destino).append("\n");
        sb.append("FECHA SALIDA: ").append(this.fechaSalida).append("\n");
        return sb.toString();
    }
}
