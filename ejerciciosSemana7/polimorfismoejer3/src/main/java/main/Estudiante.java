package main;

public class Estudiante extends Persona{

    private String curso;

    public Estudiante(String nombre, String apellidos, int dni, String estadoCivil, String curso) {
        super(nombre, apellidos, dni, estadoCivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Estudiante{" + super.toString() +
                "curso='" + curso + '\'' +
                '}';
    }

}
