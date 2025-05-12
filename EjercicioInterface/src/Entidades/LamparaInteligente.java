/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Fabri
 */
public class LamparaInteligente extends Dispositivo implements Conectable{

    public LamparaInteligente(String marca) {
        super(marca);
    }
    
    @Override
    public void encender() {
        this.setEncendido(true);
        System.out.println("LAMPARA PRENDIDA");
    }

    @Override
    public void apagar() {
        this.setEncendido(false); 
        System.out.println("LAMPARA APAGADA");
    }

    @Override
    public void conectarWifi(String red) {
        if(this.isEncendido())
        {
            System.out.println("Lampara conectada a la red: "+red);
        }else
        {
            System.out.println("La lampara no se encuentra encendida");
        }
    }
    
    public void cambiarColor(String color)
    {
        if(this.isEncendido())
        {
            System.out.println("COLOR DE LAMPARA: "+color);
        }else
        {
            System.out.println("LAMPARA APAGADA Y/O DESCONECTADA DE RED");
        }
    }
}
