package main;

public class Empleado extends Persona{
    
    private String fechaContratacion;
    private String numDespacho;

    public Empleado(String nombre, String apellidos, int dni, String estadoCivil, String fechaContratacion, String numDespacho) {
        super(nombre, apellidos, dni, estadoCivil);
        this.fechaContratacion = fechaContratacion;
        this.numDespacho = numDespacho;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public String getNumDespacho() {
        return numDespacho;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public void setNumDespacho(String numDespacho) {
        this.numDespacho = numDespacho;
    }

    @Override
    public String toString() {
        return "Empleado{" + super.toString() +
                "fechaContratacion='" + fechaContratacion + '\'' +
                ", numDespacho='" + numDespacho + '\'';
    }

}
