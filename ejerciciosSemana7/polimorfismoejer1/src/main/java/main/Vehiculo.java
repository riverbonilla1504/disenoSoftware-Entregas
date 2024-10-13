package main;

public class Vehiculo {
    private String matricula;
    private float velocidad;

    public Vehiculo(String matricula){
        this.matricula = matricula;
        this.velocidad = 0;
    }
    public void acelerar(float agregarVelocidad){
        velocidad += agregarVelocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "matricula=" + matricula + ", velocidad=" + velocidad  ;
    }

    

}
