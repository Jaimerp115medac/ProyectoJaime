package t3practica1herencia;

public class Alumno extends Persona {

    private double notaAcceso;
    private String Estudios;

    public Alumno(String nombre, String direccion, String DNI, boolean sexo, double notaAcceso, String estudios) {
        super(nombre, direccion, DNI, sexo);

        switch (estudios) {
            case "FP Medio":
            case "Bachillerato":
            case "Otros":
                this.Estudios = estudios;
                break;
            default:
                this.notaAcceso = 5;
                this.Estudios = "Otros";
                break;

        }

        if (notaAcceso > 0 && notaAcceso < 10) {
            this.notaAcceso = notaAcceso;
        } else {
            this.notaAcceso = 5;
            this.Estudios = "Otros";
        }

    }

    @Override
    public String toString() {
        String res;
        res = super.getNombre() + " - " + super.getDNI();
        if (this.sexo) {
            res += "\nEs una chica";
        } else {
            res += "\nEs un chico";
        }
        res += "\n" + super.getDireccion();
        res += "\n Accede al instituto desde " + this.Estudios + " con una nota media de: " + this.notaAcceso;
        return res;
    }

}
