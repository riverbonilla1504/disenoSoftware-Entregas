package main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         
            Scanner scanner = new Scanner(System.in);
                    System.out.println("Nombre: ");
                    String nombre = scanner.next();
                    System.out.println("Apellidos: ");
                    String apellidos = scanner.next();
                    System.out.println("DNI: ");
                    int dni = scanner.nextInt();
                    System.out.println("Dirección: ");
                    String direccion = scanner.next();
                    System.out.println("Años de antigüedad: ");
                    int anyosAntiguedad = scanner.nextInt();
                    System.out.println("Teléfono: ");
                    String telefono = scanner.next();
                    System.out.println("Salario: ");
                    double salario = scanner.nextDouble();
                    System.out.println("Despacho: ");
                    String despacho = scanner.next();
                    System.out.println("Número de fax: ");
                    String numFax = scanner.next();
                    Secretario secretario = new Secretario(nombre, apellidos, dni, direccion, anyosAntiguedad, telefono, salario, despacho, numFax);
                    System.out.println(secretario.toString());
               
                    System.out.println("Nombre: ");
                    nombre = scanner.next();
                    System.out.println("Apellidos: ");
                    apellidos = scanner.next();
                    System.out.println("DNI: ");
                    dni = scanner.nextInt();
                    System.out.println("Dirección: ");
                    direccion = scanner.next();
                    System.out.println("Años de antigüedad: ");
                    anyosAntiguedad = scanner.nextInt();
                    System.out.println("Teléfono: ");
                    telefono = scanner.next();
                    System.out.println("Salario: ");
                    salario = scanner.nextDouble();
                    System.out.println("Área de venta: ");
                    String areaVenta = scanner.next();
                    System.out.println("Comisión: ");
                    double comision = scanner.nextDouble();
                    Vendedor vendedor = new Vendedor(nombre, apellidos, dni, direccion, anyosAntiguedad, telefono, salario, areaVenta, comision);
                    System.out.println(vendedor.toString());
                
                    System.out.println("Nombre: ");
                    nombre = scanner.next();
                    System.out.println("Apellidos: ");
                    apellidos = scanner.next();
                    System.out.println("DNI: ");
                    dni = scanner.nextInt();
                    System.out.println("Dirección: ");
                    direccion = scanner.next();
                    System.out.println("Años de antigüedad: ");
                    anyosAntiguedad = scanner.nextInt();
                    System.out.println("Teléfono: ");
                    telefono = scanner.next();
                    System.out.println("Salario: ");
                    salario = scanner.nextDouble();
                    System.out.println("Despacho: ");
                    despacho = scanner.next();
                    JefeZona jefeDeZona = new JefeZona(nombre, apellidos, dni, direccion, anyosAntiguedad, telefono, salario, despacho);
                    System.out.println(jefeDeZona.toString());

                    System.out.println("1. Añadir vendedor");
                    System.out.println("2. Eliminar vendedor");
                    System.out.println("3. Añadir secretario");
                    System.out.println("4. Eliminar secretario");
                    System.out.println("5. Salir");
                    int opcion2 = scanner.nextInt();
                    
                    jefeDeZona.setCarroEmpresa(new CarroEmpresa("Audi", "A3", "1234ABC"));
                    jefeDeZona.addVendedor(vendedor);
                    jefeDeZona.setSecretario(secretario);

                    secretario.raiseSalary();
                    vendedor.raiseSalary();
                    jefeDeZona.raiseSalary();
                    System.out.println(secretario.toString());
                    System.out.println(vendedor.toString());
                    System.out.println(jefeDeZona.toString());
        
    }
}