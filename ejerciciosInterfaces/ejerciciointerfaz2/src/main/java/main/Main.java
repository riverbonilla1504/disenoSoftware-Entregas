package main;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("L001", "El principito", 1988);
        Revista revista1 = new Revista("R001", "El tiempo", 2022, 5);


        System.out.println(libro1);
        System.out.println(revista1);

       
        libro1.prestar();
        System.out.println(libro1);
        libro1.devolver();
        System.out.println(libro1);
    }
}