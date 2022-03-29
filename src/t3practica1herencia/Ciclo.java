package t3practica1herencia;

public class Ciclo {

    private String codCiclo;
    private String nombre;
    private boolean ciclo; //F=Medio T=Superior
    private Asignatura Asignaturas[];
    private int numAsignaturas;

    public Ciclo(String codCiclo, String nombre, boolean ciclo, int numAsignaturas) {
        this.codCiclo = codCiclo;
        this.nombre = nombre;
        this.ciclo = false;
        if ((numAsignaturas > 3) && (numAsignaturas < 10)) {
            this.Asignaturas = new Asignatura[numAsignaturas];
        } else {
            this.Asignaturas = new Asignatura[5];
        }
    }

    public void añadirAsignatura(Asignatura nueva) {
        for (int i = 0; i < Asignaturas.length; i++) {
            if (this.Asignaturas[i] == null) {
                this.Asignaturas[i] = nueva;
                System.out.println("Se ha añadido la asignatura.");
                i = this.numAsignaturas;
            }
        }
    }

    public boolean enCiclo(Asignatura asig) {
        for (int i = 0; i < Asignaturas.length; i++) {
            if (this.Asignaturas[i] == asig) {
                return true;
            }
        }
        return false;
    }

    public void eliminarAsignatura(Asignatura borrar) {
        for (int i = 0; i < Asignaturas.length; i++) {
            if (this.Asignaturas[i] == borrar) {
                this.Asignaturas[i] = null;
                System.out.println("Se ha eliminado la asignatura con exito.");
            }
        }
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
