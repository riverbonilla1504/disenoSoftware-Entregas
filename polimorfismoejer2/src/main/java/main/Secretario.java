package main;

public class Secretario extends Empleado {

    private String despacho;
    private String numFax;

    public Secretario(String nombre, String apellidos, int dni, String direccion, int anyosAntiguedad, String telefono, double salario, String despacho, String numFax) {
        super(nombre, apellidos, dni, direccion, anyosAntiguedad, telefono, salario);
        this.despacho = despacho;
        this.numFax = numFax;
    }

    public void setNumFax(String numFax) {
        this.numFax = numFax;
    }

    public String getNumFax() {
        return numFax;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public String getDespacho() {
        return despacho;
    }

    @Override
    public void raiseSalary() {
        this.salario += salario * 0.05;
    }

    

    @Override
    public String toString() {
        return  " Secretario{" + super.toString() +
            "despacho='" + despacho + '\'' +
            ", numFax='" + numFax + '\'' + 
            '}';
    }
    
    

}
