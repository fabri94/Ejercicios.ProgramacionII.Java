/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciointerface;

import Entidades.Conectable;
import Entidades.Dispositivo;
import Entidades.HeladeraInteligente;
import Entidades.LamparaInteligente;
import Entidades.SmartTV;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fabri
 */
public class EjercicioInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Conectable> dispositivos = new ArrayList<>();
        String wifi = "Pepe Silvia Wifi";
        
        HeladeraInteligente heladeraPepe = new HeladeraInteligente("Whirlpool");
        SmartTV smartPepe = new SmartTV("LG");
        LamparaInteligente lamparaPepe = new LamparaInteligente("Electrolux");
        
        dispositivos.add(heladeraPepe);
        dispositivos.add(smartPepe);
        dispositivos.add(lamparaPepe);
        
        encenderYConectarDispositivos(dispositivos, wifi);
        apagarDispositivos(dispositivos);
        
        encenderYConectarDispositivos(dispositivos, wifi);
        realizarAccionEspecificaDispositivo(dispositivos);
        
        
    }
    
    public static void encenderYConectarDispositivos(List<Conectable> aparatos, String red)
    {
        if(aparatos != null && !aparatos.isEmpty())
        {
            for (Conectable c : aparatos) 
            {
                c.encender();
                c.conectarWifi(red);
            }
        }
    }
    
    public static void apagarDispositivos(List<Conectable> aparatos)
    {
        if(aparatos!=null && !aparatos.isEmpty())
        {
            for (Conectable c : aparatos) 
            {
                c.apagar();
            }
        }
    }
    public static void realizarAccionEspecificaDispositivo(List<Conectable> aparatos)
    {
        if(aparatos!=null && !aparatos.isEmpty())
        {
            for (Conectable c : aparatos) {
            if(c instanceof HeladeraInteligente)
            {
                ((HeladeraInteligente) c).verTemperatura();
            }else if(c instanceof SmartTV)
            {
                ((SmartTV) c).reproducirStreaming("Its always Sunny");
            }else if(c instanceof LamparaInteligente)
            {
                ((LamparaInteligente) c).cambiarColor("Rosa");
            }
        }
        }
    }
    
}
