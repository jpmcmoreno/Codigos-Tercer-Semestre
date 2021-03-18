
package universidaddelvalle;


public class Alumno {
    
    protected String nombre;
    protected int semestre;
    protected boolean descuento ;
    protected double valorMatricula ;

    public Alumno() {
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }
    
    public double calcularDescuento(boolean descuento){
        if (descuento) {
            return ((this.valorMatricula*10)/100);
        }
      return this.valorMatricula;      
        
    }
  
    
    
    
    
}
