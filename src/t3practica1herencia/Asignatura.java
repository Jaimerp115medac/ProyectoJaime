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
        this.profesorAsignatura.setHoras(profe.getHoras() + this.horasAsignatura);

    }

    public String matricularAlumno(Alumno nuevo) {
        for (int i = 0; i < listaAlumno.length; i++) {
            if (listaAlumno[i] == null) {
                listaAlumno[i] = nuevo;
                return "El alumno se ha añadido.";
            }                                       // Preguntar mañana a jaime sobre si sale por pantalla y le vale asi
        }
        return "Error: El alumno no se ha podido añadir.";
    }

    public boolean estaMatriculado(Alumno alu) {
        for (int i = 0; i < listaAlumno.length; i++) {
            if (listaAlumno[i] == alu) {
                return true;
            }
        }
        return false;
    }

    public void borrarAlumno(Alumno borrar) {   //Si hacer asi o devolviendo cadena
         for (int i = 0; i < listaAlumno.length; i++) {
            if (this.listaAlumno[i] == borrar) { //Quizas esto esta mal
                this.listaAlumno[i] = null;
                System.out.println("Se ha eliminado el alumno con exito.");
            }
        }
    }

    public boolean asignaturaCompleta() {
         for (int i = 0; i < listaAlumno.length; i++) {
            if (this.listaAlumno[i] == null) {
                return false;
            }
        }
        return true;
    }
    

    public void cambiarProfesor(Profesor nuevo) {
        this.profesorAsignatura.setHoras(nuevo.getHoras() + this.horasAsignatura);
        this.profesorAsignatura=nuevo;
      

//Preguntar mañana sobre el constructor copia en este metodo
        
        
    }

    public String getCodigoAsignatura() {
        return codigoAsignatura;
    }

    public void setCodigoAsignatura(String codigoAsignatura) {
        this.codigoAsignatura = codigoAsignatura;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public int getHorasAsignatura() {
        return horasAsignatura;
    }

    public void setHorasAsignatura(int horasAsignatura) {
        this.horasAsignatura = horasAsignatura;
    }

    public boolean isTroncalAsignatura() {
        return troncalAsignatura;
    }

    public void setTroncalAsignatura(boolean troncalAsignatura) {
        this.troncalAsignatura = troncalAsignatura;
    }

    public Profesor getProfesorAsignatura() {
        return profesorAsignatura;
    }

    public void setProfesorAsignatura(Profesor profesorAsignatura) {
        this.profesorAsignatura = profesorAsignatura;
    }

    public Alumno[] getListaAlumno() {
        return listaAlumno;
    }

    public void setListaAlumno(Alumno[] listaAlumno) {
        this.listaAlumno = listaAlumno;
    }

}
