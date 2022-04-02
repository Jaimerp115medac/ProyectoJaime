package t3practica1herencia;

public class Ciclo {

    private String codCiclo, nombre;
    private int numHoras, numAsignaturas;
    private boolean ciclo; //F=Medio T=Superior
    private Asignatura Asignaturas[];

    public Ciclo(String codCiclo, String nombre, boolean ciclo, int numAsignaturas) {
        this.codCiclo = codCiclo;
        this.nombre = nombre;
        this.ciclo = false;
        this.numHoras = 0;
        if ((numAsignaturas > 3) && (numAsignaturas < 10)) {
            this.Asignaturas = new Asignatura[numAsignaturas];
        } else {
            this.Asignaturas = new Asignatura[5];
        }
    }

    public String añadirAsignatura(Asignatura nueva) {
        for (int i = 0; i < Asignaturas.length; i++) {
            if (this.Asignaturas[i] == null) {
                this.Asignaturas[i] = nueva;
                return "Se ha añadido la asignatura con exito.";
            }
        }
        return "Error: no se ha podido añadir la asignatura.";
    }

    public boolean enCiclo(Asignatura asig) {
        for (int i = 0; i < Asignaturas.length; i++) {
            if (this.Asignaturas[i].getCodigoAsignatura().equalsIgnoreCase(asig.getCodigoAsignatura())) {
                return true;
            }
        }
        return false;
    }

    public String eliminarAsignatura(Asignatura borrar) {
        for (int i = 0; i < Asignaturas.length; i++) {
            if (this.Asignaturas[i].getCodigoAsignatura().equalsIgnoreCase(borrar.getCodigoAsignatura())) {
                this.Asignaturas[i] = null;
                return "Se ha eliminado la asignatura con exito.";
            }
        }
        return "Error: no se ha podido eliminar la asignatura.";
    }

    public boolean cicloCompleto() {
        for (int i = 0; i < Asignaturas.length; i++) {
            if (this.Asignaturas[i] == null) {
                return false;
            }
        }
        return true;
    }

}
