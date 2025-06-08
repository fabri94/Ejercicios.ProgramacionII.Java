package ejerciciosarchivos;

import EntidadesRegistroEmpleados.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Fabri
 */
public class EjerciciosArchivos {

    public static void main(String[] args) {
        String archivoEntrada = "empleados.csv";
        String archivoSalida = "resumen_empleados.txt";
        IArchivoProcesable procesador = new ProcesadorArchivo();
        crearArchivoCSV(archivoEntrada);
        try {
            // Leer empleados desde archivo CSV
            List<Empleado> empleados = procesador.leer(archivoEntrada);
            // Mostrar en consola (opcional)
            for (Empleado e : empleados) {
                System.out.println(e);
            }
            // Escribir resultados en archivo (NO se appendea, se sobrescribe)
            procesador.escribir(archivoSalida, empleados, false);
            System.out.println("Archivo de salida generado exitosamente.");

        } catch (FilaInvalidaException e) {
            System.err.println("Error de formato: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error de archivo: " + e.getMessage());
        }
    }
    
    public static void crearArchivoCSV(String path){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.write("TIEMPO_COMPLETO,Juan Perez,150000,5");
            bw.newLine();
            bw.write("MEDIO_TIEMPO,Pepe Silvia,80000,true");
            bw.newLine();
            bw.write("TIEMPO_COMPLETO,Carlos Menem,140000,3");
            bw.newLine();
            bw.write("MEDIO_TIEMPO,Abdul Jabbar,90000,false");
            bw.newLine();
            System.out.println("Archivo CSV de prueba creado exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al crear el archivo de prueba: " + e.getMessage());
        }
    }
}
