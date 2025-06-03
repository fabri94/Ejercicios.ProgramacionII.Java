package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Fabri
 */
public class Gestor<T> implements ICRUD<T>{
    
    private ArrayList<T> elementos;

    public Gestor() {
        this.elementos = new ArrayList<>();
    }
    
    @Override
    public void agregar(T elemento) {
        if(elemento!=null){
            this.elementos.add(elemento);
        }
    }

    @Override
    public void actualizar(T elementoAnterior, T elementoModificado) {
        int index = elementos.indexOf(elementoAnterior);
        if(index >0){
            if(!elementoAnterior.equals(elementoModificado)){
                
                elementos.set(index, elementoModificado);
                System.out.println("reemplazado \n");
            }else{
                System.out.println("Se tratan del mismo elemento, no es posible actualizar\n");
            }
        }
        
    }

    @Override
    public void eliminar(T elemento) {
        int index = elementos.indexOf(elemento);
        if(index >0){            
            elementos.remove(index);
        }
    }

    @Override
    public ArrayList<T> obtenerTodos() {
        return this.elementos;
    }
    
}
