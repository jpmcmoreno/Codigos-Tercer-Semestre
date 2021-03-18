
package universidaddelvalle;


public class AntiguoAlumno extends Alumno{
    public AntiguoAlumno(String nombre, int semestre, boolean descuento, double valorMatricula) {
        this.nombre = nombre;
        this.semestre = semestre;
        this.descuento = descuento;
        this.valorMatricula = valorMatricula;
    }

    @Override
    public String toString() {
         return "AntiguoAlumno: nombre: "+nombre+", semestre: "+semestre+", valormatricula: "+valorMatricula;
    }
    
   
}
