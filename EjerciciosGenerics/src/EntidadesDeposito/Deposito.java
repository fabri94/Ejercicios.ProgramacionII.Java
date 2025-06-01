/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesDeposito;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fabri
 */
public class Deposito<T>{
    private int capacidadMaxima;
    private List<T> objetos;

    public Deposito(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.objetos = new ArrayList<>();
    }
    
    private int getIndice(T objeto){
        int indice = -1;
        if(objetos.contains(objeto)){
            indice = objetos.indexOf(objeto);
        }
        return indice;
    }
    
    public boolean agregar(T objeto){
        boolean pudoAgregar = false;
        if(this.objetos.size()<capacidadMaxima && !this.objetos.contains(objeto)){
           this.objetos.add(objeto);
           pudoAgregar = true;
        }
        
        return pudoAgregar;
    }
    
    public boolean remover(T objeto){
        boolean seElimino = false;
        int index = this.getIndice(objeto);
        if(index!= -1){
            objetos.remove(index);
            seElimino = true;
        }
        return seElimino;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Deposito de ").append(objetos.get(0).getClass().getSimpleName()).append("\n=====================\n");
        sb.append("Capacidad maxima: ").append(capacidadMaxima).append("\n\n");
        for(T elemento : this.objetos){
            sb.append(elemento.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
    
}
