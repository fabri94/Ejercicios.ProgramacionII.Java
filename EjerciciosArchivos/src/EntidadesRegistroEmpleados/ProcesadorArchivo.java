package EntidadesRegistroEmpleados;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fabri
 */
public class ProcesadorArchivo implements IArchivoProcesable{
 
    public List<Empleado> leer(String path) throws FilaInvalidaException, IOException {        
        List<Empleado> empleadosLeidos = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(path))) 
        {
            String linea;
            while ((linea = br.readLine()) != null) 
            {
                String[] columnas = linea.split(",");
                validarColumnas(columnas);
                empleadosLeidos.add(parsearEmpleado(columnas));
            }
        }
        return empleadosLeidos;
    }
    
    @Override
    public void escribir(String path, List<Empleado> empleados, boolean seAppendea) throws IOException {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, seAppendea))) 
        {
            // Escribo encabezado
            if(!seAppendea){
                bw.write(String.format("%-15s %-15s %-15s","Nombre","Tipo","Sueldo Final"));
                bw.newLine();
                bw.write("-------------------------------------------");
                bw.newLine();
            }
            // Escribo cada empleado con su tipo y salario calculado
            for (Empleado e : empleados) 
            {
                bw.write(formatearEmpleado(e));
                bw.newLine();
            }
        }   
    }
    
    private String formatearEmpleado(Empleado emp){
        String tipo = "Desconocido";
        String infoEmpleado;
        
        if(emp.getTipo().getDescripcion()!=null){
            tipo = emp.getTipo().getDescripcion();
        }
        
        infoEmpleado = String.format("%-15s %-15s $%.2f", emp.getNombre(), tipo, emp.calcularSalario());
        return infoEmpleado;
    }
    
    private void validarColumnas(String[] columnas)throws FilaInvalidaException{
        if(columnas.length!=4){
            throw new FilaInvalidaException("Cantidad de columnas invalidas. Se esperaban 4 pero son: "+columnas.length);
        }
    }
    
    private Empleado parsearEmpleado(String[] columnas)throws FilaInvalidaException{
        Empleado emp = null;
        TipoEmpleado tipo;
        
        try{
            tipo = TipoEmpleado.valueOf(columnas[0]);
        }catch(IllegalArgumentException e){
            throw new FilaInvalidaException("Tipo de empleado no reconocido: " + columnas[0]);
        }
        
        String nombreEmpleado = columnas[1];
        double sueldoBase = Double.parseDouble(columnas[2]);
        
        if(tipo == TipoEmpleado.MEDIO_TIEMPO){
            boolean presentismo = Boolean.parseBoolean(columnas[3]);
            emp = new EmpleadoMedioTiempo(nombreEmpleado, sueldoBase, presentismo);
        }else if(tipo == TipoEmpleado.TIEMPO_COMPLETO){
            int horasExtra = Integer.parseInt(columnas[3]);
            emp = new EmpleadoTiempoCompleto(nombreEmpleado, sueldoBase, horasExtra);
        }
       
        return emp;
    }
    
    //METODOS MAL PROGRAMADOS O MUY POCO ATOMICOS
    
    /*@Override
    public List<Empleado> leer(String path) throws FilaInvalidaException, IOException {        
        List<Empleado> empleadosLeidos = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) 
        {
            String linea;
            while ((linea = br.readLine()) != null) 
            {
                String[] columnas = linea.split(",");
                validarColumnas(columnas);
                String tipo = columnas[0];
                String nombre = columnas[1];
                double sueldoBase;
                try 
                {
                    sueldoBase = Double.parseDouble(columnas[2]);
                }catch(NumberFormatException e) 
                {
                    throw new FilaInvalidaException("Sueldo base inválido en la línea: " + linea);
                }

                switch (tipo) 
                {
                    case "TIEMPO_COMPLETO":
                        int horasExtra;
                        try {
                            horasExtra = Integer.parseInt(columnas[3]);
                        } catch (NumberFormatException e) {
                            throw new FilaInvalidaException("Horas extra inválidas en la línea: " + linea);
                        }
                        empleadosLeidos.add(new EmpleadoTiempoCompleto(nombre, sueldoBase, horasExtra));
                        break;
                    case "MEDIO_TIEMPO":
                        boolean cumplioPresentismo = Boolean.parseBoolean(columnas[3]);
                        empleadosLeidos.add(new EmpleadoMedioTiempo(nombre, sueldoBase, cumplioPresentismo));
                        break;
                    default:
                        throw new FilaInvalidaException("Tipo de empleado desconocido en la línea: " + linea);
                }
            }
        }
        
        
    return empleadosLeidos;
    }
    
    */  
    
    /*@Override
    public void escribir(String path, List<Empleado> empleados) throws IOException {
        
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true)))
        {
            bw.write("Nombre,Edad,Email");
            bw.newLine();
        }catch (IOException e) 
        {
            System.err.println("Error al escribir el CSV: " + e.getMessage());
        }    
    }*/
}
