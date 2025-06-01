/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesContabilidad;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fabri
 * @param <T>
 * @param <U>
 */
public class Contabilidad <T extends Documento, U extends Documento>{
    private List<T> egresos;
    private List<U> ingresos;

    public Contabilidad() {
        this.egresos = new ArrayList<>();
        this.ingresos = new ArrayList<>();
    }
    
    //Java a diferencia de C# no permite sobrecarga con genericos (runtime generics) en metodos estaticos por type erasure
    //me veo forzado a cambiar el nombre de los metodos a pesar de que no cumpla con la consigna
    public static <T extends Documento> void agregarEgreso(Contabilidad<T,?> c, T egreso){
        if(c.egresos.contains(egreso)){
            System.out.println("La factura ya se encuentra agregada");
        }else{
            c.egresos.add(egreso);
        }
    }
    
    public static <U extends Documento> void agregarIngreso(Contabilidad<?,U> c, U ingreso){
        if(c.ingresos.contains(ingreso)){
            System.out.println("El recibo ya se encuentra agregado");
        }else{
            c.ingresos.add(ingreso);
        }
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("Egresos\n");
        for(T egreso : this.egresos){
            sb.append("  - ").append(egreso.toString());
            sb.append("\n");
        }
        
        sb.append("\nIngresos\n");
        for(U ingreso : this.ingresos){
            sb.append("  - ").append(ingreso.toString());
            sb.append("\n");
        }
        
        return sb.toString();
    }
}
