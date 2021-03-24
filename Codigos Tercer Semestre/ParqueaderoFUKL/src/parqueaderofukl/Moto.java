
package parqueaderofukl;


public class Moto extends Parqueo{
    
    
    
    public Moto(int dueño,String horaLlegada,String placa,String modelo) {
        this.dueño = dueño;
        this.horaLlegada = horaLlegada;
        this.placa = placa;
        this.modelo = modelo;
    }

    @Override
    String infoParqueo() {
       return "No TI del dueño: "+dueño+", hora de llegada: "+horaLlegada+", placa: "+placa+", modelo: "+modelo;
    }
    
}
