/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesTorneo;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Fabri
 * @param <T>
 */
public class Torneo <T extends Equipo>{
    private ArrayList<T> equipos;
    private String nombre;

    public Torneo(String nombre) {
        this.nombre = nombre;
        this.equipos = new ArrayList<>();
    }

    @Override
    public boolean equals(Object obj){
        boolean estaInscripto = false;
        if(obj!= null && obj instanceof Equipo){
                Equipo otro = (Equipo)obj;
                for(T equipo : this.equipos){
            
                    if(obj.equals(equipo)){
                        estaInscripto = true;
                        break;
                    }
                }
            }
        
        return estaInscripto;
    }
    
    public void agregar(T equipo){
        if(this.equals(equipo)){
            System.out.println("El equipo "+equipo.getNombre()+ " ya esta inscrito al torneo "+this.nombre+"\n");
        }else{
            this.equipos.add(equipo);
            System.out.println("Se inscribio el equipo "+equipo.getNombre()+" al torneo "+this.nombre+"\n");
        }
    }
    
    private String mostrarEquipos(){
        StringBuilder sb = new StringBuilder();
        for(T equipo : this.equipos){
            sb.append(equipo.getFicha()).append("\n");
        }
        return sb.toString();
    }
    
    public String mostrar(){
        StringBuilder sb = new StringBuilder();
        sb.append("TORNEO ").append(this.nombre).append("\n===============================\n\n");
        sb.append("EQUIPOS DEL TORNEO\n").append("========================\n\n").append(mostrarEquipos());
        return sb.toString();
    }
    
    private String calcularPartido(T equipo1, T equipo2){
        String resultado = "";
        if(equipo1 instanceof EquipoFutbol && equipo2 instanceof EquipoFutbol){
            resultado = resultadoFutbol(equipo1, equipo2);
        }else if(equipo1 instanceof EquipoBasquet && equipo2 instanceof EquipoBasquet){
            resultado = resultadoBasquet(equipo1, equipo2);
        }
        return resultado;
    }
    
    private String resultadoFutbol(T equipoFut1, T equipoFut2){
        Random randomPepe = new Random();
        StringBuilder sb = new StringBuilder();
        int resultadoEquipo1 = randomPepe.nextInt(10);
        int resultadoEquipo2 = randomPepe.nextInt(10);
        
        sb.append(equipoFut1.getNombre()).append(" [").append(resultadoEquipo1).append("] - ");
        sb.append("[").append(resultadoEquipo2).append("] ").append(equipoFut2.getNombre()).append("\n");
        return sb.toString();
    }
    
    private String resultadoBasquet(T equipoBas1, T equipoBas2){
        Random randomPepe = new Random();
        StringBuilder sb = new StringBuilder();
        int resultadoEquipo1 = randomPepe.nextInt(130);
        int resultadoEquipo2 = randomPepe.nextInt(130);
        
        sb.append(equipoBas1.getNombre()).append(" [").append(resultadoEquipo1).append("] - ");
        sb.append("[").append(resultadoEquipo2).append("] ").append(equipoBas2.getNombre()).append("\n"); 
        return sb.toString();
    }
    
    public String jugarPartido(){
        String mensaje;
        if(equipos.size()>=2){
            Random randomPepe = new Random();
            T equipo1;
            T equipo2;
            
            do{
                equipo1 = equipos.get(randomPepe.nextInt(equipos.size()));
                equipo2 = equipos.get(randomPepe.nextInt(equipos.size()));
            }while(equipo1.equals(equipo2));
            
            mensaje = calcularPartido(equipo1,equipo2);
        }else{
            mensaje = "No hay suficientes equipos para jugar";
        }
        return mensaje;
    }
}
