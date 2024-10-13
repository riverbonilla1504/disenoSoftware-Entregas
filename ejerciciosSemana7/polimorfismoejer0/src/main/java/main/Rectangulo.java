package main;

public class Rectangulo extends FiguraGeometrica{
    private int valor2;


    @Override
    public double getArea(){
        return getValor1() * valor2;
    }

    @Override
    public double getPerimetro(){
        return 2 * getValor1() + 2 * valor2;
    }

    protected int getValor2() {
        return valor2;
    }

    protected void setValor2(int valor2) {
        this.valor2 = valor2;
    }

}
