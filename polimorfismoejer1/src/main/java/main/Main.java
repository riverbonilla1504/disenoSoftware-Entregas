package main;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        while (true) { 
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Crear un coche");
            System.out.println("2. Crear un camion");
            System.out.println("3. Salir");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce la matricula del coche");
                    String matricula = sc.next();
                    System.out.println("Introduce el numero de puertas del coche");
                    int numPuertas = sc.nextInt();
                    Coche coche = new Coche(matricula, numPuertas);
                    System.out.println(coche);
                    System.out.println("a que velocidad desea acelerar el coche?");
                    float velocidadCoche = sc.nextFloat();
                    coche.acelerar(velocidadCoche);
                    System.out.println(coche);
                    break;
                case 2:
                    System.out.println("Introduce la matricula del camion");
                    String matriculaCamion = sc.next();
                    Camion camion = new Camion(matriculaCamion);
                    System.out.println(camion);
                    System.out.println("desea poner un remolque? 1. si 2. no");
                    int opcionRemolque = sc.nextInt();
                    if (opcionRemolque == 1){
                        System.out.println("Introduce el peso del remolque");
                        int peso = sc.nextInt();
                        Remolque remolque = new Remolque(peso);
                        camion.ponRemolque(remolque);
                    }
                    System.out.println(camion);
                    System.out.println("a que velocidad desea acelerar el camion?");
                    float velocidad = sc.nextFloat();
                    camion.acelerar(velocidad);
                    System.out.println(camion);

                    System.out.println("desea quitar el remolque? 1. si 2. no");
                    int opcionQuitarRemolque = sc.nextInt();
                    if (opcionQuitarRemolque == 1){
                        camion.quitaRemolque();
                    }
                    System.out.println(camion);
                    
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }           
        }
    }
}