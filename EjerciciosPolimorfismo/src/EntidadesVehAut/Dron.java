/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesVehAut;

/**
 *
 * @author Fabri
 */
public class Dron extends VehiculoAutonomo{

    public Dron(int id, String marca, String modelo) {
        super(id, marca, modelo);
    }

    @Override
    public void moverse() {
        volar();
    }

    @Override
    public void detenerse() {
        System.out.println("El boludito del dron, torpe con los controles, detiene el equipo a menos 2 metros del camion a punto de explotar");
    }

    @Override
    public void reportarEstado() {
        System.out.println("El dron volo en mil pedazdos producto de la explosion del camion");
        System.out.println("");
    }

    private void volar() {
        System.out.println("El dron de un boludito se encuentra sobrevolando la zona y registra el momento justo de la colision");
    }
    
}
