package main;

public class Cubo extends Cuadrado{

    @Override
    public double getArea(){
        return 6 * Math.pow(getValor1(), 2);
    }

    @Override
    public double getPerimetro(){
        return 12 * getValor1();
    }
    
    public double getVolumen(){
        return Math.pow(getValor1(), 3);
    }

}
