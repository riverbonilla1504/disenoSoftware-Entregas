package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Auto auto = new Auto(0);
        
        System.out.print("Ingrese la cantidad de gasolina para tanquear: ");
        int cantidadGasolina = scanner.nextInt();
        if ( auto.retanquear(cantidadGasolina) == true){
            System.out.println("Se han agregado " + cantidadGasolina + " litros de gasolina al auto.");
        } else {
            System.out.println("Cantidad de gasolina inválida.");
        }
        auto.conducir();



        Moto moto = new Moto(0);

        System.out.print("Ingrese la cantidad de gasolina para tanquear: ");
        cantidadGasolina = scanner.nextInt();
        if ( moto.retanquear(cantidadGasolina) == true){
            System.out.println("Se han agregado " + cantidadGasolina + " litros de gasolina a la moto.");
        } else {
            System.out.println("Cantidad de gasolina inválida.");
        }
        moto.conducir();
    }
}