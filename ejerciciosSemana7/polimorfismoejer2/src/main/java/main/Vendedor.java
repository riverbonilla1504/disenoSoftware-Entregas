package main;
import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Empleado {

    private CarroEmpresa carroEmpresa;
    private String areaVenta;
    private List<String> clientes = new ArrayList<>();
    private double comision;


    public Vendedor(String nombre, String apellidos, int dni, String direccion, int anyosAntiguedad, String telefono, double salario, String areaVenta, double comision) {
        super(nombre, apellidos, dni, direccion, anyosAntiguedad, telefono, salario);
        this.areaVenta = areaVenta;
        this.comision = comision;
    }

    public void setCarroEmpresa(CarroEmpresa carroEmpresa) {
        this.carroEmpresa = carroEmpresa;
    }

    public CarroEmpresa getCarroEmpresa() {
        return carroEmpresa;
    }

    public void setAreaVenta(String areaVenta) {
        this.areaVenta = areaVenta;
    }

    public String getAreaVenta() {
        return areaVenta;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }

    public void addCliente(String cliente) {
        clientes.add(cliente);
    }

    public void removeCliente(String cliente) {
        clientes.remove(cliente);
    }

    public List<String> getClientes() {
        return clientes;
    }

    @Override
    public void raiseSalary() {
        this.salario += salario * 0.1;
    }

    @Override
    public String toString() {
        return "Vendedor{" + super.toString() +
                ", carroEmpresa=" + carroEmpresa +
                ", areaVenta='" + areaVenta + '\'' +
                ", clientes=" + clientes +
                ", comision=" + comision +
                '}';
    }

    





}
