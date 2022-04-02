package t3practica1herencia;

public class Persona {

    private String nombre, direccion, DNI;
    protected boolean sexo;//T=femenino F=masculino

    //Metodo constructor
    public Persona(String nombre, String direccion, String DNI, boolean sexo) {
        this.DNI = DNI;
        this.sexo = sexo;
        this.direccion = direccion;
        this.nombre = nombre;
    }

    // Constructor copia
    public Persona(Persona oPersona) {
        this.DNI = oPersona.DNI;
        this.sexo = oPersona.sexo;
        this.direccion = oPersona.direccion;
        this.nombre = oPersona.nombre;
    }

    // Getter y Setter Direccion
    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //Getter y Setter DNI
    public String getDNI() {
        return this.DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    //Getter y Setter nombre
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        String res = "";
        res = this.nombre + " - " + this.DNI;
        if (this.sexo) {
            res += "\n Es una chica";
        } else {
            res += "\n Es un chico";
        }
        res += "\n" + this.direccion;
        return res;
    }

}
