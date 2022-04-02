package t3practica1herencia;

public class Persona {

    private String nombre;
    private String direccion;
    private String DNI;
    protected boolean sexo;//T=femenino F=masculino

    //Metodo constructor
    public Persona(String nombre, String direccion, String DNI, boolean sexo) {
        this.DNI = DNI;
        this.sexo = sexo;
        this.direccion = direccion;
        this.nombre = nombre;
    }

    // Constructor copia
    public Persona(Persona cPersona) {
        this.DNI = cPersona.DNI;
        this.sexo = cPersona.sexo;
        this.direccion = cPersona.direccion;
        this.nombre = cPersona.nombre;
    }

    // Getter y Setter Direccion
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //Getter y Setter DNI
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    //Getter y Setter nombre
    public String getNombre() {
        return nombre;
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
