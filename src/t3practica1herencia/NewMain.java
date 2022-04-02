/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3practica1herencia;

/**
 *
 * @author Jaime
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Profesor Jaime = new Profesor("Jaime", "Malaga", "34124d", true, 5.4, "FP");
        Alumno Joaquin = new Alumno("Alberto", "Huelin", "31823921d", false, 7, "Otros");
        Alumno celia = new Alumno("Maria", "El palo", "3181i3421d", true, 7, "Otros");
        Alumno Maria = new Alumno("Celia", "Huelva", "3182wf3", true, 7, "Otros");
        Asignatura Sistemas = new Asignatura("Sistemas informaticos", "1A'", 19, Jaime, 4);
        Ciclo Programacion = new Ciclo("A1", "DAM", true, 2);
        
        Sistemas.matricularAlumno(Joaquin);
                Sistemas.matricularAlumno(Maria);
                        Sistemas.matricularAlumno(celia);
                        Sistemas.borrarAlumno(Maria);
        System.out.println(Programacion);
        System.out.println("***********************************************************");
        System.out.println(Jaime);
        System.out.println("***********************************************************");

        System.out.println(Sistemas);
        System.out.println("***********************************************************");
    }

}
