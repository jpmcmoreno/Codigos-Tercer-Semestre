
package Modelo;

public class Paciente extends Persona {
    private String EnfermedadPpal;

    public Paciente() {
    }

    public Paciente(String EnfermedadPpal, String nombre, long cc, int edad) {
        super(nombre, cc, edad);
        this.EnfermedadPpal = EnfermedadPpal;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
  
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCc() {
        return cc;
    }

    public void setCc(long cc) {
        this.cc = cc;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    public String getEnfermedadPpal() {
        return EnfermedadPpal;
    }

    public void setEnfermedadPpal(String EnfermedadPpal) {
        this.EnfermedadPpal = EnfermedadPpal;
    }

    
}
