package Modelo;

public class Persona {

    private String nombre;
    private int peso;
    private float estatura;
    private long cc;
    private int edad;

    /*protected int peso;
    protected int altura;*/

    public Persona() {
    }

    public Persona(String nombre, int peso, float estatura, long cc, int edad) {
        this.nombre = nombre;
        this.peso = peso;
        this.estatura = estatura;
        this.cc = cc;
        this.edad = edad;
    }

    

    public String verificarTipoPersonaEdad() {
        if (edad <= 12) {
            return "bebe";
        } else if (edad <= 12) {
            return "niño(a)";
        } else if (edad <= 21) {
            return "adolescente";
        } else if (edad <= 59) {
            return "adulto";
        } else {
            return "adulto mayor";
        }
    }

    public String verificarEstadoPaciente() {
        float imc = (float) (this.peso/Math.pow(this.estatura,2)); 
        
        if (18.5 > imc) {
            return "peso bajo";
        }
        if (18.5 <= imc && imc <= 24.9) {
            return "normal";
        }
        if (25.0 <= imc && imc <= 29.9) {
            return "peso superior al normal";
        }
        return "sobrepeso";
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
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

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", cc=" + cc + ", edad=" + edad + '}';
    }

}
