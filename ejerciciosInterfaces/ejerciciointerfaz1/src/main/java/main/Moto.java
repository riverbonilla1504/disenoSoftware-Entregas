package main;

class Moto implements IVehiculo {
    private int gasolina;

    public Moto(int gasolinaInicial) {
        this.gasolina = gasolinaInicial;
    }

    @Override
    public void conducir() {
        if (gasolina > 0) {
            System.out.println("La moto está conduciendo.");
            gasolina--; 
        } else {
            System.out.println("No hay gasolina suficiente para conducir.");
        }
    }

    @Override
    public boolean retanquear(int cantidad) {
        if (cantidad > 0) {
            gasolina += cantidad; 
            return true;
        }
        return false;
    }
}