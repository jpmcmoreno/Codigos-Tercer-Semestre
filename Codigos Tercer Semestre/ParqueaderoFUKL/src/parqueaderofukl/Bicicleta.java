
package parqueaderofukl;

public class Bicicleta extends Parqueo{
    
    public Bicicleta(int dueño,String horaLlegada,String nSerie,String color) {
        this.dueño = dueño;
        this.horaLlegada = horaLlegada;
        this.nSerie = nSerie;
        this.color = color;
    }

    @Override
    String infoParqueo() {
       return "No TI del dueño: "+dueño+", hora de llegada: "+horaLlegada+", No de serie:"+nSerie+", color de la bicicleta: "+color;
    }
    
}
