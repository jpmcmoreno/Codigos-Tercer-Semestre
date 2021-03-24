
package parqueaderofukl;

abstract class Parqueo{
    
protected int dueño;

protected String horaLlegada;

protected String placa;

protected String nSerie;

protected String modelo;

protected String color;

    public int getDueño() {
        return dueño;
    }


abstract String infoParqueo();

}
