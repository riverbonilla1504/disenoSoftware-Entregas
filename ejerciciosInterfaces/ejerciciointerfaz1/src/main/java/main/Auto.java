package main;

class Auto implements IVehiculo {
    private int gasolina;

    public Auto(int gasolinaInicial) {
        this.gasolina = gasolinaInicial;
    }

    @Override
    public void conducir() {
        if (gasolina > 0) {
            System.out.println("El coche está conduciendo.");
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