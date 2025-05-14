/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospolimorfismo;

import EntidadesVehAut.Auto;
import EntidadesVehAut.Camion;
import EntidadesVehAut.CentralComando;
import EntidadesVehAut.Dron;
import EntidadesVehAut.VehiculoAutonomo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fabri
 */
public class EjVehiculosAutonomos {
    public static void main(String[] args) {
        List<VehiculoAutonomo> vehiculos = new ArrayList<>();
        
        Auto autoPepe = new Auto(1,"Pepe","Silvia");
        Dron dronPepe = new Dron(2,"Boludito","2000");
        Camion camionPepe = new Camion(3,"Mercedes","Mionka");
        
        vehiculos.add(autoPepe);
        vehiculos.add(dronPepe);
        vehiculos.add(camionPepe);
        
        CentralComando centralPepe = new CentralComando(vehiculos);
        centralPepe.realizarAccionEspecifica();
        
    }
}
