package main;

public class Empleado {
    private String nombre;
    private double apellidos;
    private int dni;
    private String direccion;

    private int anyosAntiguedad;
    private String telefono;
    protected double salario;

    private Empleado supervisor;

    public Empleado(String nombre, double apellidos, int dni, String direccion, int anyosAntiguedad, String telefono, double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.anyosAntiguedad = anyosAntiguedad;
        this.telefono = telefono;
        this.salario = salario;
        this.supervisor = null;
    }

    public void setSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }

    public Empleado getSupervisor() {
        return supervisor;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setAnyosAntiguedad(int anyosAntiguedad) {
        this.anyosAntiguedad = anyosAntiguedad;
    }

    public int getAnyosAntiguedad() {
        return anyosAntiguedad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }

    public void setApellidos(double apellidos) {
        this.apellidos = apellidos;
    }

    public double getApellidos() {
        return apellidos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return 
                ", nombre='" + nombre + '\'' +
                ", apellidos=" + apellidos +
                ", dni=" + dni +
                ", direccion='" + direccion + '\'' +
                ", anyosAntiguedad=" + anyosAntiguedad +
                ", telefono='" + telefono + '\'' +
                ", salario=" + salario +
                ", supervisor=" + supervisor 
                ;
    }

    public void raiseSalary() {
        this.salario += salario;
    }







}
