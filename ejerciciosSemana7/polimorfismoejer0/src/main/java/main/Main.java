package main;

public class Main {
    public static void main(String[] args) {
        
        Circulo circulo = new Circulo();
        circulo.setValor1(5);
        System.out.println("Area del circulo: " + circulo.getArea());
        System.out.println("Perimetro del circulo: " + circulo.getPerimetro());

        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setValor1(5);
        System.out.println("Area del cuadrado: " + cuadrado.getArea());
        System.out.println("Perimetro del cuadrado: " + cuadrado.getPerimetro());

        Cubo cubo = new Cubo();
        cubo.setValor1(5);
        System.out.println("Area del cubo: " + cubo.getArea());
        System.out.println("Perimetro del cubo: " + cubo.getPerimetro());

        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setValor1(5);
        rectangulo.setValor2(10);
        System.out.println("Area del rectangulo: " + rectangulo.getArea());
        System.out.println("Perimetro del rectangulo: " + rectangulo.getPerimetro());

        Triangulo triangulo = new Triangulo();
        triangulo.setValor1(5);
        triangulo.setValor2(10);
        System.out.println("Area del triangulo: " + triangulo.getArea());
        System.out.println("Perimetro del triangulo: " + triangulo.getPerimetro());


    }
}