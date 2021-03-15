
package inventario;


public class Pasajero extends Avion{
    
    private int numPasajeros;

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    @Override
    public void visualizar() {
        System.out.println("Avion de pasajeros Matricula:"+getMatricula()+" Capacidad: "+getNumPasajeros()+" Velocidad: "+getVelocidad());
    }
    
}
