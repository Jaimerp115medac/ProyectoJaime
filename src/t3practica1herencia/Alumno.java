/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t3practica1herencia;

/**
 *
 * @author Jaime
 */
public class Alumno extends Persona {

    private double notaAcceso;
    private String tituloAcceso;

    public Alumno(String nombre, String direccion, String DNI, boolean sexo, double notaAcceso, String estudios) {
        super(nombre, direccion, DNI, sexo);

        switch (tituloAcceso) {
            case "FP Medio":
            case "Bachillerato":
            case "Otros":
                this.tituloAcceso = tituloAcceso;
                break;
            default:
                this.notaAcceso = 5;
                this.tituloAcceso = "Otros";
                break;

        }

        if (notaAcceso > 0 && notaAcceso < 10) {
            this.notaAcceso = notaAcceso;
        } else {
            this.notaAcceso = 5;
            this.tituloAcceso = "Otros";   //Preguntar a jaime mañana
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
        res+="\n"+super.getDireccion();
        res+="\n Accede al instituto desde "+this.tituloAcceso+" con una nota media de: "+ this.notaAcceso;
        return res;
    }

}
