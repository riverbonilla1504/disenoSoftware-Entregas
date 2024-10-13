package main;

public class Camion extends Vehiculo{

    private Remolque remolque;

    public Camion(String matricula) {
        super(matricula);
        this.remolque = null;
    }

    public void ponRemolque(Remolque remolque){
        this.remolque = remolque;
    }

    public void quitaRemolque(){
        this.remolque = null;
    }

    public Remolque getRemolque() {
        return remolque;
    }

    @Override
    public void acelerar(float agregarVelocidad) {
        if (agregarVelocidad > 100 && remolque != null){
            agregarVelocidad = 100;
            super.acelerar(agregarVelocidad);
            System.out.println("velocidad maxima alcanzada, no se puede acelerar mas de 100km/h debido al remolque"); 
        }else{super.acelerar(agregarVelocidad);}
    }

    @Override
    public String toString() {
        return "Camion{" + super.toString() + (remolque != null ? remolque.toString() : "") + '}';
    }



}
