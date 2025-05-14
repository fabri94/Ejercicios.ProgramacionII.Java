/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesVehAut;

/**
 *
 * @author Fabri
 */
public class Auto extends VehiculoAutonomo{

    public Auto(int id, String marca, String modelo) {
        super(id, marca, modelo);
    }

    @Override
    public void moverse() {
        System.out.println("El auto esta yendo a una velocidad de 300 km/h");
    }

    @Override
    public void detenerse() {
        System.out.println("El auto frena intempestuosamente producto de una colision contra un camion, saliendo el conductor eyectado por el parabrisas");
    }

    @Override
    public void reportarEstado() {
        System.out.println("El auto esta completamente destruido, y el conductor esta agonizando de muerte");
        System.out.println("");
    }
    
}
