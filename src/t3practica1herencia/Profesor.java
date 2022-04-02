package t3practica1herencia;

public class Profesor extends Persona {

    private double sueldo;
    private String estudios;
    private int horas;
    private boolean ocupado; //F= no ocupado T=ocupados

    public Profesor(String nombre, String direccion, String DNI, boolean sexo, double sueldo, String estudios) {
        super(nombre, direccion, DNI, sexo);
        this.horas = 0;
        this.ocupado = false;
        if (sueldo > 350) {
            this.sueldo = sueldo;
        } else {
            this.sueldo = 350;
        }

        switch (estudios) {
            case "Doctorado":
            case "Postgrado":
            case "Universitario":
            case "FP Superior":
            case "Bachillerato":
                this.estudios = estudios;
                break;
            default:
                this.estudios = "FP Medio";
                break;
        }
    }

    public String enClase() {
        if (super.sexo) {
            if (this.ocupado) {
                return "La profesora " + super.getNombre() + " está dando clase.";
            } else {
                return "La profesora " + super.getNombre() + " no está dando clase.";
            }
        } else {
            if (this.ocupado) {
                return "La profesor " + super.getNombre() + " está dando clase.";
            } else {
                return "La profesor " + super.getNombre() + " no está dando clase.";
            }
        }

    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String toString() {
        String res = "";
        res = super.getNombre() + " - " + super.getDNI();
        if (super.sexo) {
            res += "\nEs una chica";
        } else {
            res += "\nEs un chico";
        }
        res += "\n" + super.getDireccion();
        res += "\nSu nivel de estudios es: " + this.estudios;
        res += "\nTrabaja como ";
        if (super.sexo) {
            res += "Profesora";
        } else {
            res += "Profesor";
        }
        res += " durante " + this.horas + " horas y cobra " + this.sueldo + "€";
        if (this.ocupado) {
            res += "\nAhora mismo está dando clase";
        } else {
            res += "\nAhora mismo no está dando clase";
        }
        return res;
    }

}
