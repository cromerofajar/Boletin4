
package boletin4;

public class Coche {
    private int velocidade ;
//4.1
    public Coche(){
    velocidade =0 ;
    }
    public void acelerar (int valor){
    velocidade= velocidade+valor;    
    }
    public void frenar (int menos){
    velocidade= velocidade-menos;    
    }
    public int getVelocidade(){
    return velocidade;
    }
}

