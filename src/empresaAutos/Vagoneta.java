
package empresaAutos;

public class Vagoneta extends Auto {
    private int numpasajero;

    public Vagoneta(int numpasajero, String placa, int nserie, String marca, int anio, double precio) {
        super(placa, nserie, marca, anio, precio);
        this.numpasajero = numpasajero;
    }

    public int getNumpasajero() {
        return numpasajero;
    }

    public void setNumpasajero(int numpasajero) {
        this.numpasajero = numpasajero;
    }

    @Override
    public String toString() {
        return "Vagoneta{" + "numpasajero=" + numpasajero + '}';
    }
    
    
}
