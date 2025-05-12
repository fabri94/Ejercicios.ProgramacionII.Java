/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Fabri
 */
public class SmartTV extends Dispositivo implements Conectable{

    public SmartTV(String marca) {
        super(marca);
    }

    @Override
    public void encender() {
        this.setEncendido(true);
        System.out.println("TELE PRENDIDO");
    }

    @Override
    public void apagar() {
        this.setEncendido(false); 
        System.out.println("TELE APAGADO");
    }

    @Override
    public void conectarWifi(String red) {
        if(isEncendido())
        {
            System.out.println("Televisor conectado a la red "+red);
        }else
        {
            System.out.println("El televisor no se encuentra encendido");
        }
    }
    
    public void reproducirStreaming(String servicio)
    {
        if(this.isEncendido())
        {
            System.out.println("REPRODUCIENDO "+servicio);
        }else
        {
            System.out.println("TELEVISOR APAGADO Y/O DESCONECTADO DE RED");
        }
    }
    
}
