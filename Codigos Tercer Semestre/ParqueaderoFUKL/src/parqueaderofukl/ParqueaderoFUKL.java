
package parqueaderofukl;

import java.util.ArrayList;
import java.util.Scanner;


public class ParqueaderoFUKL {

static ArrayList<Parqueo> listaVehiculos = new ArrayList<Parqueo>();
static Scanner sc = new Scanner(System.in);

static void agregarVehiculo(Parqueo e){
    listaVehiculos.add(e);
}

static int consultarVehiculos(){
     System.out.println("\n"+"consultar por identificación del propietario"+"\n"+"Selleccione numero de propietario");
    for(Parqueo i:listaVehiculos){
        System.out.println(listaVehiculos.indexOf(i)+1+". "+""+i.getDueño());
    }
    int n = Integer.parseInt(sc.nextLine());
    return n;
}
static void imprimirConsultaVehiculos(int n){
     System.out.println("la informacion del vehiculo");
    for(Parqueo i:listaVehiculos){
        if (listaVehiculos.indexOf(i)+1 == n){
            System.out.println(i.infoParqueo());
        }
    }
}


static void visualizarVehiculos(){
   
    for(Parqueo i:listaVehiculos){
        System.out.println(i.infoParqueo());
    }
}
  public static void main(String[] args) {
      
   Carro carro1 = new Carro(614201013,"10:30 am","AAA000","Toyota");
   Moto moto1 = new Moto(614201014,"9:30 am","ABC123","Suzuki");
   Bicicleta bicicleta1 = new Bicicleta(614201015,"11:00 am","12345","Rojo");
   Bicicleta bicicleta2 = new Bicicleta(614201016,"2:00 pm","67891","Verde");
   
   agregarVehiculo(carro1);
   agregarVehiculo(moto1);
   agregarVehiculo(bicicleta1);
   agregarVehiculo(bicicleta2);
   
   visualizarVehiculos();
   
   
   imprimirConsultaVehiculos(consultarVehiculos());
  }
}
