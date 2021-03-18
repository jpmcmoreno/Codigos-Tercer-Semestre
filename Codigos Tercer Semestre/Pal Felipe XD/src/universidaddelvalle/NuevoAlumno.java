
package universidaddelvalle;


public class NuevoAlumno extends Alumno{
    
    public NuevoAlumno(String nombre, int semestre, boolean descuento, double valorMatricula) {
        this.nombre = nombre;
        this.semestre = semestre;
        this.descuento = descuento ;
        this.valorMatricula = valorMatricula;
    }
    
    

    @Override
    public String toString() {
        return "NuevoAlumno: nombre: "+nombre+", semestre: "+semestre+", valormatricula: "+valorMatricula;
    }
    
    
}
