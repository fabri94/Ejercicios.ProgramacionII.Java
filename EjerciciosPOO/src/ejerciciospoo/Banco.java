/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospoo;

/**
 *
 * @author Fabri
 */
public class Banco {
    
    private static int saldoTotal;
    
    public static void depositar(int monto)
    {
        if(monto>0)
        {
            saldoTotal = saldoTotal + monto;
            System.out.println("Se deposito: "+monto+" en la cuenta bancaria");
        }else
        {
            System.out.println("El monto a depositar no puede ser negativo!");
        }
    }
    
    public static void extraer(int monto)
    {
        if(monto>0)
        {
            if(monto<=saldoTotal)
            {
                saldoTotal = saldoTotal - monto;
                System.out.println("Se extrajo: "+monto+" de la cuenta bancaria");
            }else
            {
                System.out.println("No hay suficiente dinero en cuenta para realizar la extraccion!");
            }
        }else
        {
            System.out.println("El monto a extraer no puede ser negativo! ");
        }
    }
    
    public static void mostrarSaldoCuenta()
    {
        System.out.println("El saldo de la cuenta es: "+saldoTotal);
    }
}
