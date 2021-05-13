package Modelo;

public class Persona {

    protected String nombre;
    protected long cc;
    protected int edad;
    protected int peso;
    protected int altura;

    public Persona() {
    }

    public Persona(String nombre, long cc, int edad) {
        this.nombre = nombre;
        this.cc = cc;
        this.edad = edad;
    }

    
    public String verificarTipoPersonaEdad() {
        if (edad <= 2) {
            return "bebe";
        } else if (edad <= 12) {
            return "niño (a)";
        } else if (edad <= 21) {
            return "adolecente";
        } else if (edad <= 59) {
            return "adulto";
        } else {
            return "Adulto Mayor";
        }
    }
    
    public String verificarEstadoPaciente (float imc){
        if (18.5 >imc) return "peso bajo";
        if (18.5 <= imc && imc <= 24.9) return "normal";
        if (25.0 <= imc && imc <= 29.9) return "normal";
        return "sobrepeso";
    }
    
    public float calularIMC(){
    return (float) (this.peso/Math.pow(this.altura,2));
    
}

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", cc=" + cc + ", edad=" + edad + ", peso=" + peso + ", altura=" + altura +'}';
    }
    
}
