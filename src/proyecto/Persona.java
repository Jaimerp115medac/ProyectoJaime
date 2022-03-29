/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author Jaime
 */
public class Persona {

    private String nombre;
    private String direccion;
    private String DNI;
    protected boolean sexo;//T femenino-F masculino

    //Metodo constructor
    public Persona(String nombre, String direccion, String DNI, boolean sexo) {
        this.DNI = DNI;
        this.sexo = sexo;
        this.direccion = direccion;
        this.nombre = nombre;
    }

    // Constructor copia
    public Persona(Persona objPersona) {
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        String res;
        res = this.nombre + " - " + this.DNI;
        res += "\n";
        if (sexo) {
            res += "Es una chica";
        } else {
            res += "Es un chico";
        }
        res += "\n";
        res += this.direccion;
        return res;
    }

}
