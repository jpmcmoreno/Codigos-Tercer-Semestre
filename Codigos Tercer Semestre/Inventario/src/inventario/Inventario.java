
package inventario;

import java.util.ArrayList;


public class Inventario {

    private ArrayList<Avion> aviones = new ArrayList<Avion> ();

    public ArrayList<Avion> getAviones() {
        return aviones;
    }
    
    public void addAvion(Avion avion){
       aviones.add(avion);
    }
    
    public void listarAviones(){
        for (Avion i : aviones){   
        i.visualizar();
        }
        
    }
    
    public static void main(String[] args) {
     Inventario in  = new Inventario();
     
     Pasajero av1 = new Pasajero();
     av1.setMatricula("HK345");
     av1.setVelocidad(300);
     av1.setNumPasajeros(299);
     
     Pasajero av2 = new Pasajero();
     av2.setMatricula("HK346");
     av2.setVelocidad(300);
     av2.setNumPasajeros(150);
     
     Carga c1 = new Carga();
     c1.setMatricula("God2412");
     c1.setVelocidad(1000);
     
     Paquete p = new Paquete();
     p.setNombre("Cartas al niño Dios");
     p.setPeso(255000.0);
     c1.addPaquete(p);
     
     Paquete p2 = new Paquete();
     p2.setNombre("regalos");
     p2.setPeso(255000.2);
     c1.addPaquete(p2);
     
     Paquete p3 = new Paquete();
     p3.setNombre("mirra");
     p3.setPeso(12000);
     c1.addPaquete(p3);
     
     in.addAvion(av1);
     in.addAvion(av2);
     in.addAvion(c1);
     in.listarAviones();
     
     
    }
    
}
