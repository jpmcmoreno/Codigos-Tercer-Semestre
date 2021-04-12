package arreglos;

 

import java.util.Scanner;

 

public class Arreglos {

 

    public static void main(String[] args) {
     Scanner lectura = new Scanner (System.in);
        
        System.out.println("ingrese el numero de edades que quiera calcular");        
        int cantidadprom=lectura.nextInt();
        int [] edades = new int[cantidadprom];
        int total = 0 ;
        
        for(int i=0;i<edades.length; i++){
            System.out.println("Ingrese la edad");
        int dato= lectura.nextInt();
        
        edades[i] = dato;
       total = dato + total; 
       }
      int promedio = total / cantidadprom;
        System.out.println("el promedio de la edad es: "+ promedio);
    }
    }
 