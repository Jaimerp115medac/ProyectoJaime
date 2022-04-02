package t3practica1herencia;

public class Asignatura {

    private String codigo, nombre;
    private int horas;
    private boolean troncal;
    private Profesor profesor;
    private Alumno listaAlumno[];

    public Asignatura(String nombre, String codigo, int horas, Profesor profe, int numMax) {
        if (numMax < 0) {       //Si el numero de Alumnos es menor que 0 se establece en 10 por defecto
            numMax = 10;
        }
        if (horas < 0) {        //Si el numero de horas es menor que 0 se establece en 100 por defecto
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
            if (listaAlumno[i] == null) {                                   //Comprueba si hay un hueco libre en el array de alumnos, si encuentra uno lo sustituye por un alumno y devuelve una cadena
                listaAlumno[i] = nuevo;
                return "El alumno se ha añadido con exito.";
            }
        }
        return "Error: El alumno no se ha podido añadir.";
    }

    public boolean estaMatriculado(Alumno alu) {
        for (int i = 0; i < listaAlumno.length; i++) {
            if (listaAlumno[i].getDNI().equalsIgnoreCase(alu.getDNI())) {   //Compara el DNI de la posicion que recorre y la compara con el DNI del alumno que entra para comprobar si esta matriculado
                return true;
            }
        }
        return false;
    }

    public String borrarAlumno(Alumno borrar) {
        for (int i = 0; i < listaAlumno.length; i++) {
            if (this.listaAlumno[i].getDNI().equalsIgnoreCase(borrar.getDNI())) { //Compara el DNI de la posicion que recorre y la compara con el DNI del alumno que entra para comprobar si existe en el array y lo sustituye por null
                this.listaAlumno[i] = null;
                for (int x = 0; x < listaAlumno.length; x++) {      //Este for esta hecho para que ordene el array y mueva los huecos vacios al final.
                    if (!(x == this.listaAlumno.length - 1)) {      //Comprobamos si no es la ultima posicion del array
                        if (listaAlumno[x] == null) {               //Comprobamos si el hueco esta vacio, si es asi intercambia la posicion con el hueco siguiente.
                            listaAlumno[x] = listaAlumno[x + 1];
                            listaAlumno[x + 1] = null;
                        }
                    }

                }
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
        this.profesor.setHoras(this.profesor.getHoras() - this.horas);           //Borra las horas de la asignatura al profesor actual
        this.profesor = nuevo;                                                   //Sustituye el profesor por uno nuevo
        this.profesor.setHoras(nuevo.getHoras() + this.horas);                   //Añade las horas de la asignatura al profesor nuevo
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
        for (int i = 0; i < this.listaAlumno.length; i++) {                      // Usamos este for para recorrer la lista de alumnos
            if (this.listaAlumno[i] != null) {                                   // En caso de que haya un alumno, llama al metodo toString del alumno y lo separa del siguiente con una linea.
                if ((i == this.listaAlumno.length - 1) || (this.listaAlumno[i + 1] == null)) {  //Si el for esta en el ultimo hueco o no hay ningun alumno en la siguiente posicion, muestra el alumno con una linea de separacion
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
