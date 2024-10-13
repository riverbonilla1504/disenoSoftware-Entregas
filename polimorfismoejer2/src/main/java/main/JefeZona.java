package main;
import java.util.ArrayList;
import java.util.List;

public class JefeZona extends Empleado {
    private Secretario secretario;
    private List<Vendedor> vendedores = new ArrayList<>();
    private String despacho;
    private CarroEmpresa carroEmpresa;

    public JefeZona(String nombre, String apellidos, int dni, String direccion, int anyosAntiguedad, String telefono, double salario, String despacho) {
        super(nombre, apellidos, dni, direccion, anyosAntiguedad, telefono, salario);
        this.secretario = null;
        this.despacho = despacho;
    }

    public void setSecretario(Secretario secretario) {
        this.secretario = secretario;
    }

    public Secretario getSecretario() {
        return secretario;
    }

    public void addVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
    }

    public void removeVendedor(Vendedor vendedor) {
        vendedores.remove(vendedor);
    }

    public List<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setCarroEmpresa(CarroEmpresa carroEmpresa) {
        this.carroEmpresa = carroEmpresa;
    }

    public CarroEmpresa getCarroEmpresa() {
        return carroEmpresa;
    }

    @Override
    public void raiseSalary() {
        this.salario += salario * 0.1;
    }

    @Override
    public String toString() {
        return "JefeZona{" + super.toString() +
            "secretario=" + secretario +
            ", vendedores=" + vendedores +
            ", despacho='" + despacho + '\'' +
            ", carroEmpresa=" + carroEmpresa +
            '}';
    }





}
