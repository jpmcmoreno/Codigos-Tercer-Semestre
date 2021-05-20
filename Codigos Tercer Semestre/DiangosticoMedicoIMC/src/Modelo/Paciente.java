
package Modelo;

public class Paciente extends Persona {
    private String EnfermedadPpal;

    public Paciente() {
    }

    public Paciente(String EnfermedadPpal, String nombre, long cc, int edad, int peso, float estatura) {
        super(nombre, peso, estatura, cc, edad);
        this.EnfermedadPpal = EnfermedadPpal;
    }

    public String getEnfermedadPpal() {
        return EnfermedadPpal;
    }

    public void setEnfermedadPpal(String EnfermedadPpal) {
        this.EnfermedadPpal = EnfermedadPpal;
    }

    @Override
    public String toString() {
        return "Paciente{" + "EnfermedadPpal=" + EnfermedadPpal + '}';
    }

   
}
