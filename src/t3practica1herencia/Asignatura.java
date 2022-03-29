package t3practica1herencia;

public class Asignatura {

    private String codigoAsignatura;
    private String nombreAsignatura;
    private int horasAsignatura;
    private boolean troncalAsignatura;
    private Profesor profesorAsignatura;
    private Alumno listaAlumno[];

    public Asignatura(String nombre, String codigo, int horas, Profesor profe, int numMax) {
        if (numMax < 0) {
            numMax = 10;
        }
        if (horas < 0) {
            horas = 100;
        }
        listaAlumno = new Alumno[numMax]; //numMax siendo el numero maximo de alumnos que podemos meter en el array
        this.codigoAsignatura = codigo;
        this.nombreAsignatura = nombre;
        this.horasAsignatura = horas;
        this.profesorAsignatura = profe;
        this.troncalAsignatura = true;
    }
   
}
