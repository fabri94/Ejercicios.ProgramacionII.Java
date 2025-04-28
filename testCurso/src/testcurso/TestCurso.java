/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testcurso;
import Entidades.Alumno;
import Entidades.Curso;
/**
 *
 * @author Fabri
 */
public class TestCurso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Curso cursoPepe = new Curso("Pepe",20,null);
        Alumno alumno1 = new Alumno("Fabrizio","Finelli",12);
        Alumno alumno2 = new Alumno("Señor","Bobi",18);
        cursoPepe.setAlumno(alumno1);
        System.out.println(cursoPepe.mostrarInfo());
        cursoPepe.setAlumno(alumno2);
        System.out.println(cursoPepe.mostrarInfo());
    }
    
}
