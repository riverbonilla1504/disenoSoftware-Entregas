package main;

public class PersonalServicio extends Empleado{

    private String seccion;

    public PersonalServicio(String nombre, String apellidos, int dni, String estadoCivil, String fechaContratacion, String numDespacho, String seccion) {
        super(nombre, apellidos, dni, estadoCivil, fechaContratacion, numDespacho);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return "PersonalServicio" + super.toString() +
                "seccion='" + seccion + '\'' +
                '}';
    }

}
