/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciointegrador;

import Entidades.Clinica;
import Entidades.EntradaHistorial;
import Entidades.Especialidad;
import Entidades.HistoriaClinica;
import Entidades.Medico;
import Entidades.Paciente;
import Entidades.Tratamiento;
import Entidades.Turno;
import java.time.LocalDate;

/**
 *
 * @author Fabri
 */
public class EjercicioIntegrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear instancias de Medico
        Medico medico1 = new Medico("Juan", "Perez", 45, "12345678", Especialidad.CARDIOLOGIA);
        Medico medico2 = new Medico("Ana", "Lopez", 38, "87654321", Especialidad.PEDIATRIA);
        
        // Crear instancias de Paciente
        Paciente paciente1 = new Paciente("Carlos", "Gomez", 30, "11223344");
        Paciente paciente2 = new Paciente("Maria", "Rodriguez", 25, "44332211");
        
        // Crear tratamientos y asignar valores usando setters
        Tratamiento tratamiento1 = new Tratamiento();
        tratamiento1.setDescripcion("Tratamiento para el corazón");
        tratamiento1.setDuracionDias(15);

        Tratamiento tratamiento2 = new Tratamiento();
        tratamiento2.setDescripcion("Tratamiento para la piel");
        tratamiento2.setDuracionDias(10);
        // Asignar tratamientos a pacientes
        paciente1.agregarTratamiento(tratamiento1);
        paciente2.agregarTratamiento(tratamiento2);
        
        // Crear un turno
        Turno turno1 = new Turno(paciente1, medico1, LocalDate.now());
        Turno turno2 = new Turno(paciente2, medico2, LocalDate.now().plusDays(1));
        
        // Crear entradas en el historial clínico
        EntradaHistorial entrada1 = new EntradaHistorial("Consulta para tratamiento de corazón", turno1);
        EntradaHistorial entrada2 = new EntradaHistorial("Consulta para tratamiento dermatológico", turno2);
        
        // Crear historias clínicas
        HistoriaClinica historiaClinica1 = new HistoriaClinica(paciente1);
        HistoriaClinica historiaClinica2 = new HistoriaClinica(paciente2);
        
        // Agregar entradas a las historias clínicas
        historiaClinica1.agregarEntrada(entrada1);
        historiaClinica2.agregarEntrada(entrada2);
        
        // Crear la clínica
        Clinica clinica = Clinica.getInstancia();
        clinica.setNombre("Pepe Silvia");
        
        // Agregar personas a la clínica (medicos y pacientes)
        clinica.agregarPersona(medico1);
        clinica.agregarPersona(medico2);
        clinica.agregarPersona(paciente1);
        clinica.agregarPersona(paciente2);
        
        // Agregar historias clínicas a la clínica
        clinica.agregarHistoriaClinica(historiaClinica1);
        clinica.agregarHistoriaClinica(historiaClinica2);
        
        // Mostrar información de la clínica
        System.out.println(clinica);
    }
    
}
