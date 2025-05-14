/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesVehAut;

/**
 *
 * @author Fabri
 */
public class Camion extends VehiculoAutonomo {

    public Camion(int id, String marca, String modelo) {
        super(id, marca, modelo);
    }
    @Override
    public void moverse() {
        System.out.println("El mionk va a una velocidad tranca palanca");
    }

    @Override
    public void detenerse() {
        System.out.println("El mionk se lleva puesto a un auto que venia a maxima velocidad");
    }

    @Override
    public void reportarEstado() {
        System.out.println("El chofer del mionk que sigue al volante, esta completamente desmayado, con el motor del vehiculo envuelto completamente en llamas");
        System.out.println("");
    }
}
