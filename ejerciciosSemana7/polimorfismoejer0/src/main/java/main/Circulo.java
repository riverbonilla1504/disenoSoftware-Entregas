package main;

public class Circulo extends FiguraGeometrica{

    @Override
    public double getArea(){
        return Math.PI * Math.pow(getValor1(), 2);
    }

    @Override
    public double getPerimetro(){
        return 2 * Math.PI * getValor1();
    }

}
