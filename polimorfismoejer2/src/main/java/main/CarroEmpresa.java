package main;

public class CarroEmpresa {

    private String matricula;
    private String marca;
    private String modelo;
    private static CarroEmpresa instance;


    public CarroEmpresa(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }
}