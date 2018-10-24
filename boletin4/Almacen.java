
package boletin4;


public class Almacen {
    private int patacas;
    private int polbo;
    private int clientes;
    
    public Almacen (){}
    public Almacen (int polbo, int patacas){
        this.polbo=polbo;
        this.patacas=patacas;
    }
    
    public int podeAtender (){
        int usarPolbo;
        usarPolbo=polbo/2;
        clientes= Math.min(usarPolbo,patacas)*3;
        return clientes;
    }
    public void engadirPolbo(int polbo){
     this.polbo=polbo+this.polbo;
    }
    public void engadirPatacas (int patacas){
     this.patacas=patacas+this.patacas;
    }
    public int amosarPolbo (){
     return polbo;
    }
    public int amosarPatacas (){
     return patacas;
    }
}
