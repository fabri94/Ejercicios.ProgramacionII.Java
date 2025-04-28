/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospoo;

/**
 *
 * @author Fabri
 */
public class Sesion {
    
    private static String usuarioLogueado;
    
    public static void login(String usuario)
    {
        if(usuario!=null) //chequea que el string recibido por parametro no sea null
        {
            Sesion.usuarioLogueado = usuario;
            System.out.println("El usuario "+usuarioLogueado+" inicio sesion con exito!");
        }else
        {
            System.out.println("Usuario invalido");
        }
    }
    
    public static void logout()
    {
        Sesion.usuarioLogueado = null;
    }
    
    public static void mostrarEstado()
    {
        if(Sesion.usuarioLogueado!=null)
        {
            System.out.println(usuarioLogueado+" se encuentra logueado actualmente");
        }else
        {
            System.out.println("No hay ningun usuario logueado actualmente");
        }
    }
    
}
