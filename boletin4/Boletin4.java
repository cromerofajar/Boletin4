package boletin4;

import java.util.Scanner;

public class Boletin4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
//4.1
        Coche obx1 = new Coche();
        int acelero = ler.nextInt();
        int freno = ler.nextInt();
        int velocidade = obx1.getVelocidade();
        System.out.println("Velocidade= " + velocidade);
        obx1.acelerar(acelero);
        int velocidade1 = obx1.getVelocidade();
        System.out.println("Velocidade= " + velocidade1);
        obx1.frenar(freno);
        int velocidade2 = obx1.getVelocidade();
        System.out.println("Velocidade= " + velocidade2);
//4.2
        Satelite obx2 = new Satelite(24, 35, 34);
        obx2.verPosicion();
//4.3
        Circulo obx3 = new Circulo(10);
        double area = obx3.calcularArea();
        double longitud = obx3.calcularLongitud();

        System.out.println("El circulo tiene un area de " + area + " y una longitud de " + longitud);
//4.4
        Almacen obx4 = new Almacen(48, 59);
        System.out.println("Introzuca patatas a añadir al almace.");
        obx4.engadirPatacas(ler.nextInt());
        System.out.println("Introzuca polbo a añadir al almace.");
        obx4.engadirPolbo(ler.nextInt());
        int clientes = obx4.podeAtender();
        System.out.println("Patacas=" + obx4.amosarPatacas() + "Polbo=" + obx4.amosarPolbo());
        System.out.println("En total pode atender a: " + clientes + " clientes");
    }

}
