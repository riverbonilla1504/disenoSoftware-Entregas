package main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Crear las instancias
        Estudiante estudiante = new Estudiante("Maria", "Gomez", 87654321, "Casada", "1º ESO");
        Profesor profesor = new Profesor("Ana", "Martinez", 87654321, "Casada", "01/01/2021", "A1", "Matematicas");
        PersonalServicio personalServicio = new PersonalServicio("Luis", "Garcia", 12345678, "Soltero", "01/01/2021", "A1", "Conserje");

        while (true) {
            System.out.println("\n--- MENÚ DE ACCIONES ---");
            System.out.println("1. Cambiar estado civil de una persona");
            System.out.println("2. Reasignar despacho a un empleado");
            System.out.println("3. Matricular a un estudiante en un nuevo curso");
            System.out.println("4. Cambiar departamento de un profesor");
            System.out.println("5. Trasladar sección de un empleado del personal de servicio");
            System.out.println("6. Imprimir información de cada individuo");
            System.out.println("7. Salir");

            System.out.print("Elige una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();  // Limpiar el buffer de entrada
            
            switch (opcion) {
                case 1:
                    System.out.println("¿De quién quieres cambiar el estado civil? (1. Estudiante, 2. Profesor, 3. Personal de Servicio)");
                    int persona = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Introduce el nuevo estado civil: ");
                    String nuevoEstadoCivil = sc.nextLine();
                    
                    if (persona == 1) {
                        estudiante.setEstadoCivil(nuevoEstadoCivil);
                    } else if (persona == 2) {
                        profesor.setEstadoCivil(nuevoEstadoCivil);
                    } else if (persona == 3) {
                        personalServicio.setEstadoCivil(nuevoEstadoCivil);
                    }
                    System.out.println("Estado civil actualizado.");
                    break;
                
                case 2:
                    System.out.print("Introduce el nuevo despacho para el profesor: ");
                    String nuevoDespacho = sc.nextLine();
                    profesor.setNumDespacho(nuevoDespacho);
                    System.out.println("Despacho reasignado.");
                    break;
                
                case 3:
                    System.out.print("Introduce el nuevo curso para el estudiante: ");
                    String nuevoCurso = sc.nextLine();
                    estudiante.setCurso(nuevoCurso);
                    System.out.println("Estudiante matriculado en el nuevo curso.");
                    break;
                
                case 4:
                    System.out.print("Introduce el nuevo departamento para el profesor: ");
                    String nuevoDepartamento = sc.nextLine();
                    profesor.setDepartamento(nuevoDepartamento);
                    System.out.println("Departamento del profesor actualizado.");
                    break;
                
                case 5:
                    System.out.print("Introduce la nueva sección para el personal de servicio: ");
                    String nuevaSeccion = sc.nextLine();
                    personalServicio.setSeccion(nuevaSeccion);
                    System.out.println("Sección del personal de servicio actualizada.");
                    break;
                
                case 6:
                    System.out.println("Información del estudiante: " + estudiante);
                    System.out.println("Información del profesor: " + profesor);
                    System.out.println("Información del personal de servicio: " + personalServicio);
                    break;
                
                case 7:
                    System.out.println("Saliendo del programa...");
                    sc.close();
                    return;
                
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
}
