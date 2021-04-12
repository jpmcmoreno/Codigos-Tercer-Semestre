package taller1juanpablomorenocadena;

import java.util.Scanner;

public class Taller1JuanPabloMorenoCadena {

    //Atributos de la clase
    private Scanner sc;
    public int opcion;
    
    //Constructor de la clase
    public Taller1JuanPabloMorenoCadena () {
        sc = new Scanner(System.in);
    }//Cierra constructor

    
    public static void main(String[] args) {
        Taller1JuanPabloMorenoCadena menu = new Taller1JuanPabloMorenoCadena (); //objeto para acceder a los métodos de esta misma clase
        menu.menu();
        
    }//cierra main

    public void menu() {
        
        System.out.print("menu de usuario\n");
        mostrarOpciones();
        System.out.println("seleccione una opcion: ");opcion = Integer.parseInt(sc.nextLine());
       ejecutarOpcion();
    }
private void mostrarOpciones() {
        System.out.println(
        "1. Clasificar según IMC.\n" +
        "2. Número menor.\n" +
        "3. Tipo de triangulo.\n"+ 
        "4. Salir.");
}        
private void ejecutarOpcion() {
        switch (opcion) {
            case 1:
                
                System.out.println("1. Clasificar según IMC.\n");
                System.out.println("Peso y altura: ");
                System.out.println("ingrese peso");
                double peso= Double.parseDouble(sc.nextLine());
                System.out.println("ingrese altura");
                double altura= Double.parseDouble(sc.nextLine());
                double imc = (peso/(altura*altura));
                if(imc<18.5){
                System.out.println("su imc es: "+imc+" bajo peso");    
                }
                if(18.5<imc && imc> 24.9){
                System.out.println("su imc es: "+imc+" normal");    
                }
                if(25>imc && imc<29.9){
                System.out.println("su imc es: "+imc+" sobrepeso" );
            }
                
                if(imc>30){
                System.out.println("su imc es: "+imc+" obesisdad");
                        }            
                break;
                
                
                
            case 2:
                 System.out.println("2. Número menor.\n");
                 System.out.println("ingrese 3 numeros:");
                int numero1 =Integer.parseInt(sc.nextLine());
                int numero2 =Integer.parseInt(sc.nextLine());
                int numero3 =Integer.parseInt(sc.nextLine());
                if(numero1 > numero2){
                
                    System.out.println("el mayor es "+numero1+" y el menor es "+ numero2);}
                
                if(numero1 > numero2){
              
                    System.out.println("el mayor es "+numero1+" y el menor es "+ numero3);}
                if(numero2 > numero1){
              
                    System.out.println("el mayor es "+numero2+" y el menor es "+ numero1);}
                if(numero2 > numero3){
              
                    System.out.println("el mayor es "+numero2+" y el menor es "+ numero3);}
                 if(numero3 > numero1){
              
                    System.out.println("el mayor es "+numero3+" y el menor es "+ numero1);}
                if(numero3 > numero2){
              
                    System.out.println("el mayor es "+numero3+" y el menor es "+ numero2);}
            
                
                    
                break;
            case 3:
                System.out.println("3. Tipo de triangulo.\n");
                break;
                
            case 4:
                System.exit(0);
                break;
                
                
            default:
                System.out.println("Gracias por utilizar el Sistema.");

        }
    }
        

        
    }




