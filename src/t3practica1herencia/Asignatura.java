
package t3practica1herencia;

import java.util.ArrayList;

public class Asignatura {

String codigoAsignatura;
String nombreAsignatura;
int horasAsignatura;
boolean troncalAsignatura;
Profesor profesorAsignatura;
ArrayList<Alumno> listaAlumno;
public Asignatura(){
    this.listaAlumno = new ArrayList<Alumno>();
}

}
