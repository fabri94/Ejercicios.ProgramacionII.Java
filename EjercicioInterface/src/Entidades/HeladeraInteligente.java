/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Fabri
 */
public class HeladeraInteligente extends Dispositivo implements Conectable{

    public HeladeraInteligente(String marca) {
        super(marca);
    }
    @Override
    public void encender() {
        this.setEncendido(true);
        System.out.println("HELADERA PRENDIDA");
    }

    @Override
    public void apagar() {
        this.setEncendido(false); 
        System.out.println("HELADERA APAGADA");
    }

    @Override
    public void conectarWifi(String red) {
        if(this.isEncendido())
        {
            System.out.println("Heladera conectada a la red: "+red);
        }else
        {
            System.out.println("La heladera no se encuentra encendida");
        }
    }
    
    public void verTemperatura()
    {
        if(this.isEncendido())
        {
            System.out.println("TEMPERATURA DE LA HELADERA: 9ºC ");
        }else
        {
            System.out.println("HELADERA APAGADA Y/O DESCONECTADA DE RED");
        }
    }
    
    
}
