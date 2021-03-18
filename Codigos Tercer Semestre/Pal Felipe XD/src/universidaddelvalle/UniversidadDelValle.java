
package universidaddelvalle;

import javax.swing.*;


public class UniversidadDelValle {

    public static void main(String[] args) {
      NuevoAlumno juan = new NuevoAlumno("juan",1,true,1000000);
       AntiguoAlumno pedro = new AntiguoAlumno("pedro",2,true,1500000);
        NuevoAlumno felipe = new NuevoAlumno("felipe",1,false,1200000);
         AntiguoAlumno ramon = new AntiguoAlumno("ramon",3,false,1000000);
         
        JOptionPane.showMessageDialog(null,juan.toString());
        JOptionPane.showMessageDialog(null,"el valor final de sumatricula es: "+juan.calcularDescuento(juan.isDescuento()));
        
        JOptionPane.showMessageDialog(null,pedro.toString());
        JOptionPane.showMessageDialog(null,"el valor final de sumatricula es: "+pedro.calcularDescuento(juan.isDescuento()));
        
        JOptionPane.showMessageDialog(null,felipe.toString());
        JOptionPane.showMessageDialog(null,"el valor final de sumatricula es: "+felipe.calcularDescuento(juan.isDescuento()));
        
        JOptionPane.showMessageDialog(null,ramon.toString());
        JOptionPane.showMessageDialog(null,"el valor final de sumatricula es: "+ramon.calcularDescuento(juan.isDescuento()));
       
        
    }
    
}
