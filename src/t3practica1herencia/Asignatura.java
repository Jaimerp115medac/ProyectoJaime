package t3practica1herencia;

public class Asignatura {

    private String codigo, nombre;
    private int horas;
    private boolean troncal;
    private Profesor profesor;
    private Alumno listaAlumno[];

    public Asignatura(String nombre, String codigo, int horas, Profesor profe, int numMax) {
        if (numMax < 0) {
            numMax = 10;
        }
        if (horas < 0) {
            horas = 100;
        }
        listaAlumno = new Alumno[numMax]; //numMax siendo el numero maximo de alumnos que podemos meter en el array
        this.codigo = codigo;
        this.nombre = nombre;
        this.horas = horas;
        this.profesor = profe;
        this.troncal = true;
        this.profesor.setHoras(profe.getHoras() + this.horas);

    }

    public String matricularAlumno(Alumno nuevo) {
        for (int i = 0; i < listaAlumno.length; i++) {
            if (listaAlumno[i] == null) {
                listaAlumno[i] = nuevo;
                return "El alumno se ha añadido con exito.";
            }
        }
        return "Error: El alumno no se ha podido añadir.";
    }

    public boolean estaMatriculado(Alumno alu) {
        for (int i = 0; i < listaAlumno.length; i++) {
            if (listaAlumno[i].getDNI().equalsIgnoreCase(alu.getDNI())) {
                return true;
            }
        }
        return false;
    }

    public String borrarAlumno(Alumno borrar) {
        for (int i = 0; i < listaAlumno.length; i++) {
            if (this.listaAlumno[i].getDNI().equalsIgnoreCase(borrar.getDNI())) {
                this.listaAlumno[i] = null;
                return "Se ha eliminado el alumno con exito.";
            }
        }
        return "Error: no se ha podido eliminar el alumno.";
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
        this.profesor.setHoras(this.profesor.getHoras() - this.horas);
        this.profesor = nuevo;
        this.profesor.setHoras(nuevo.getHoras() + this.horas);
    }

    public String getCodigo() {
        return codigo;
    }

    public int getHoras() {
        return horas;
    }

    public String toString() {
        String res = "";
        res = this.codigo + ": " + this.nombre + " - " + this.horas + " horas.\n";
        if (this.troncal) {
            res += "Es troncal.\n";
        } else {
            res += "No es troncal.\n";
        }
        res += "Profesor de la asignatura:\n";
        res += "==========================\n";
        res += this.profesor.toString() + "\n";
        res += "Lista de alumnos matriculados:\n";
        res += "==========================\n";
        for (int i = 0; i < this.listaAlumno.length; i++) {
            if (this.listaAlumno[i] != null) {
                if ((i == this.listaAlumno.length - 1) || (this.listaAlumno[i + 1] == null)) {
                    res += this.listaAlumno[i].toString() + "\n";
                } else {
                    res += this.listaAlumno[i].toString() + "\n";
                    res += "-------------------------------------\n";
                }
            }
        }
        return res;
    }
}
