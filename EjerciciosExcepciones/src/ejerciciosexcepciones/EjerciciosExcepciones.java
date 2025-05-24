package ejerciciosexcepciones;

import EntidadesGestionArchivos.*;
import EntidadesGestionInventario.*;
import EntidadesSistemaBancario.*;
import EntidadesVuelos.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fabri
 */
public class EjerciciosExcepciones {
    
    public static void main(String[] args) {
      
       //gestionDeInventario();
       //reservasDeVuelos();
       //gestorArchivos();
       sistemaBancario();
    }
    
    public static void gestionDeInventario(){
        try {
            
            ProductoPerecedero leche = new ProductoPerecedero("Leche", 150.0, 10);
            ProductoNoPerecedero arroz = new ProductoNoPerecedero("Arroz", 100.0, 5);
            

            System.out.println("Stock inicial:");
            System.out.println("Leche: " + leche.getStock());
            System.out.println("Arroz: " + arroz.getStock());

            
            System.out.println("\nVendiendo 3 unidades de leche...");
            leche.vender(3);

            
            System.out.println("\nVendiendo 10 unidades de arroz...");
            arroz.vender(10);

        } catch (StockInsuficienteException e) {
            System.out.println("⚠️ Error de stock: " + e.getMessage());
        } catch (PrecioInvalidoException e) {
            System.out.println("⚠️ Error de precio: " + e.getMessage());
        } finally {
            System.out.println("\nFinalizando operación (bloque finally ejecutado siempre).");
        }
    }
    
    
    public static void reservasDeVuelos()
    {
        Vuelo vueloPepe1 = new VueloNacional("C103","Pepelandia","Rosario",0,2,LocalDateTime.of(2025, 5, 20, 14, 30),"Chubut",true);
        Vuelo vueloPepe2 = new VueloInternacional("A400","Pepelandia","Paris",0,1,LocalDateTime.of(2025, 5, 20, 14, 30),"Francia",false,4000.0);
        
        List<Reservable> reservasAvion = new ArrayList<>();
        reservasAvion.add(vueloPepe1);
        reservasAvion.add(vueloPepe2);
        vueloPepe1.reservarAsiento();
        vueloPepe1.reservarAsiento();
        vueloPepe2.reservarAsiento();
        try{
            vueloPepe2.reservarAsiento();
        }catch(AsientoNoDisponibleException e){
            System.out.println("Error de reserva: "+e.getMessage());
        }
        
        for(Reservable r : reservasAvion){
            r.confirmarReserva();
        }
        
        System.out.println("Reservas vueloPepe1: "+vueloPepe1.getAsientosReservados());
        System.out.println("Reservas vueloPepe2: "+vueloPepe2.getAsientosReservados());
    }
    
    public static void gestorArchivos(){
        Archivo pepe1 = new ArchivoTexto("pepe.txt",true,true);
        Archivo pepeInexistente = new ArchivoTexto("pepe2.txt",false,false);
        Archivo imagenPepe = new ArchivoImagen("imagenpepe.jpg",true,true);
        Archivo imagenPepeSinPermisos = new ArchivoImagen("pepiando.jpg",true,false);
        
        realizarAccionArchivo(pepe1,"el pepe rey se convierte en dios");
        realizarAccionArchivo(pepeInexistente,"pepe no existe en este entorno");
        realizarAccionArchivo(imagenPepe,"ROJO");
        realizarAccionArchivo(imagenPepeSinPermisos,"VERDE");
        
    }
    
    public static void realizarAccionArchivo(Archivo archivo, String contenido){
        try{
            archivo.leer();
            archivo.escribir(contenido);
            if(archivo instanceof Compresible){
                ((Compresible) archivo).comprimir();
            }
        }catch(PermisoDenegadoException | ArchivoNoEncontradoException e){
            System.out.println("ERROR: \n"+e.getMessage());
        }
    }

    public static void sistemaBancario() {
        Cliente juan = new Cliente("Juan", "Pérez", 12345678, "juan.perez@email.com");
        Cliente maria = new Cliente("María", "Gómez", 87654321, "maria.gomez@email.com");
        Cliente pepe = new Cliente("Pepe", "Rufoso", 19161845, "pepito.rufoso@email.com");
        
        Cuenta cuentaAhorroJuan = new CuentaAhorro(juan, 5000.0, true);
        Cuenta cuentaAhorroPepe = new CuentaAhorro(pepe, 120000.0, false);
        Cuenta cuentaCorrienteMaria = new CuentaCorriente(maria, 10000.0, 3000.0);

        System.out.println("---- Operaciones de Juan ----");
        cuentaAhorroJuan.depositar(2000);
        
        try{
            cuentaAhorroJuan.depositar(0);
        }catch(TransaccionInvalidaException e){
            System.out.println("Excepcion: "+e.getMessage());
        }
        
        try{
            cuentaAhorroJuan.retirar(10000);
        }catch(FondosInsuficientesException e)
        {
            System.out.println("Excepcion: "+e.getMessage());
        }
        cuentaAhorroJuan.retirar(3000); 
        
        System.out.println("\n---- Operaciones de Pepe ----");
        cuentaAhorroPepe.depositar(2000);
        try{
            cuentaAhorroPepe.retirar(40000);
        }catch(TransaccionInvalidaException e){
            System.out.println("Excepcion: "+e.getMessage());
        }

        System.out.println("\n---- Operaciones de María ----");
        cuentaCorrienteMaria.depositar(1500);
        
        try {
            cuentaCorrienteMaria.retirar(4000); 
        } catch (TransaccionInvalidaException e) {
            System.out.println("Excepción: " + e.getMessage());
        }

        cuentaCorrienteMaria.retirar(2500); 
    }
}
