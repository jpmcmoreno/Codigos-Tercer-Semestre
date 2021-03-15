
package inventario;

import java.util.ArrayList;


public class Carga extends Avion{

    private ArrayList<Paquete> paquetes = new ArrayList <Paquete> ();
    private double pesoMaximo = 447700.0;
    private double pesoActual = 0.0;

    public ArrayList<Paquete> getPaquetes() {
        return paquetes;
    }

    public void addPaquete(Paquete paquete){
        if (pesoActual + paquete.getPeso()< pesoMaximo) {
            paquetes.add(paquete);
            pesoActual = pesoActual + paquete.getPeso();
        }else{
            System.out.println("El paquete no puede ser agregdo. Carga máxima superada");
        }
    }    
    
    @Override
    public void visualizar() {
        System.out.println("Avion de carga matricula: " + getMatricula() + " Capacidad: " + getVelocidad() + " Contiene: ");
        for (Paquete paquete : paquetes) {
            System.out.println("Nombre: " + paquete.getNombre() + ", peso: " + paquete.getPeso());
        }
    }
    
}