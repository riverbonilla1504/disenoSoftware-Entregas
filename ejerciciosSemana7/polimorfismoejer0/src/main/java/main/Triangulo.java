package main;

public class Triangulo extends FiguraGeometrica{

    protected int valor2;

    protected int getValor2() {
        return valor2;
    }

    protected void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    @Override  
    public double getArea(){
        return (getValor1() * valor2) / 2;
    }

    @Override
    public double getPerimetro(){
        double hipotenusa = Math.sqrt(Math.pow(valor1, 2) + Math.pow(valor2, 2));
        return valor1 + valor2 + hipotenusa;
    }
    

    




}
