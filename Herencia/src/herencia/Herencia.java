/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

import Entidades.Vehiculo;
import Entidades.Moto;
import Entidades.Auto;
import java.util.ArrayList;

/**
 *
 * @author Fabri
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Vehiculo> tallerPepe = new ArrayList();
        
        Auto autoPepe1 = new Auto("Toyota","Corolla",1994,4);
        Auto autoPepe2 = new Auto("Ford","Focus",2019,4);
        
        Moto motoPepe1 = new Moto("BMW","M3",2024,600);
        Moto motoPepe2 = new Moto("Ducati","Silvia",2015,400);
        
        tallerPepe.add(autoPepe1);
        tallerPepe.add(autoPepe2);
        tallerPepe.add(motoPepe1);
        tallerPepe.add(motoPepe2);
        
        System.out.println("Vehiculos en el taller: ");
        System.out.println("-----------------------\n");
        for(Vehiculo vehiculo : tallerPepe)
        {
            if(vehiculo instanceof Auto auto)
            {
                System.out.println(auto.mostrarAuto());
            }else if(vehiculo instanceof Moto moto){
                System.out.println(moto.mostrarMoto());
            }
                
        }
        
    }
    
}
