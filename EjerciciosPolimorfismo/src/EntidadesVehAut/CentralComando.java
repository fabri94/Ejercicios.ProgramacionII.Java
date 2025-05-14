/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesVehAut;

import java.util.List;

/**
 *
 * @author Fabri
 */
public class CentralComando {
    private List<VehiculoAutonomo> vehiculos;

    public CentralComando(List<VehiculoAutonomo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    
    public void realizarAccionEspecifica()
    {
        for (VehiculoAutonomo v : vehiculos) {
            v.moverse();
            v.detenerse();
            v.reportarEstado();
        }
    }
}
