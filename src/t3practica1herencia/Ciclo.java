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

    public String añadirAsignatura(Asignatura nueva) {               //Añadimos una asignatura en el primer hueco libre que encontramos en el array
        for (int i = 0; i < Asignaturas.length; i++) {
            if (this.Asignaturas[i] == null) {
                this.Asignaturas[i] = nueva;
                this.numHoras += nueva.getHoras();                  //Añadimos las horas de la asignatura al ciclo
                return "Se ha añadido la asignatura con exito.";
            }
        }
        return "Error: no se ha podido añadir la asignatura.";
    }

    public boolean enCiclo(Asignatura asig) {
        for (int i = 0; i < Asignaturas.length; i++) {
            if (this.Asignaturas[i].getCodigo().equalsIgnoreCase(asig.getCodigo())) {
                return true;
            }
        }
        return false;
    }

    public String eliminarAsignatura(Asignatura borrar) {
        for (int i = 0; i < Asignaturas.length; i++) {
            if (this.Asignaturas[i].getCodigo().equalsIgnoreCase(borrar.getCodigo())) {
                this.Asignaturas[i] = null;
                this.numHoras -= borrar.getHoras();
                for (int x = 0; x < this.Asignaturas.length; x++) {            //Este for esta hecho para que ordene el array y mueva los huecos vacios al final.
                    if (!(x == this.Asignaturas.length - 1)) {                 //Comprobamos si no es la ultima posicion del array
                        if (this.Asignaturas[x] == null) {                     //Comprobamos si el hueco esta vacio, si es asi intercambia la posicion con el hueco siguiente.
                            this.Asignaturas[x] = this.Asignaturas[x + 1];
                            this.Asignaturas[x + 1] = null;
                        }
                    }

                }
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
