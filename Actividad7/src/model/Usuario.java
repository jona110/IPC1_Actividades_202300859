
package model;

public class Usuario {
    
    private String cui;
    private String nombre;
    private String apellido;
    private int edad;

    public Usuario(String cui, String nombre, String apellido, int edad) {
        this.cui = cui;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getCui() {
        return cui;
    }

    public void setCui(String cui) {
        this.cui = cui;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
