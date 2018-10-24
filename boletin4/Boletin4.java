package boletin4;

import java.util.Scanner;

public class Boletin4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
//4.1
        Coche Obx1 = new Coche();
        int acelero = ler.nextInt();
        int freno = ler.nextInt();
        int velocidade = Obx1.getVelocidade();
        System.out.println("Velocidade= " + velocidade);
        Obx1.acelerar(acelero);
        int velocidade1 = Obx1.getVelocidade();
        System.out.println("Velocidade= " + velocidade1);
        Obx1.frenar(freno);
        int velocidade2 = Obx1.getVelocidade();
        System.out.println("Velocidade= " + velocidade2);
//4.2
        Satelite Obx2 = new Satelite(24, 35, 34);
        Obx2.verPosicion();
//4.3
        Circulo Obx3 =new Circulo (10);
        double area= Obx3.calcularArea();
        double longitud= Obx3.calcularLongitud();
        
        System.out.println("El circulo tiene un area de "+ area + " y una longitud de "+ longitud);
//4.4
        Almacen Obx4=new Almacen (48,59);
        System.out.println("Introzuca patatas a añadir al almace.");
        Obx4.engadirPatacas(ler.nextInt());
        System.out.println("Introzuca polbo a añadir al almace.");
        Obx4.engadirPolbo (ler.nextInt());
        int clientes=Obx4.podeAtender();
        System.out.println("Patacas="+ Obx4.amosarPatacas()+ "Polbo="+ Obx4.amosarPolbo());
        System.out.println("En total pode atender a: "+clientes+" clientes");
    }

}

