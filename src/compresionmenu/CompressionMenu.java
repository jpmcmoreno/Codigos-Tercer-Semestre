package compresionmenu;

import java.util.Scanner;

public class CompressionMenu {
    
    CompressionAlgorithm algorithm;
    
    private void menu(Scanner sc) {
        System.out.println("seleccione una opcion"
                + "\n1) para comprimir el archivo en zip "
                + "\n2) para comprimir el archivo en rar "
                + "\n3) para comprimir el archivo en 7z ");
        
        int opc = Integer.parseInt(sc.nextLine());
        
        System.out.println("Digite el nombre del archivo");
        String filename = sc.nextLine();
        switch (opc) {
            case 1:
                algorithm = new Zip();
                break;
            case 2:
                algorithm = new Rar();
                break;
            case 3:
                algorithm = new _7Z();
                break;
        }
        algorithm.compress(filename);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CompressionMenu cm = new CompressionMenu();
        cm.menu(sc);
    }
    
}
