package main;

public class Cuadrado extends FiguraGeometrica{


    @Override
    public double getArea(){
        return Math.pow(getValor1(), 2);
    }

    @Override
    public double getPerimetro(){
        return 4 * getValor1();
    }


}
