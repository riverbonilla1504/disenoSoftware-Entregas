package main;

public class Profesor extends Empleado{

    private String departamento;

    public Profesor(String nombre, String apellidos, int dni, String estadoCivil, String fechaContratacion, String numDespacho, String departamento) {
        super(nombre, apellidos, dni, estadoCivil, fechaContratacion, numDespacho);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Profesor" + super.toString() +
                "departamento='" + departamento + '\'' +
                '}';
    }

}
