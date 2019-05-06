
package empresaAutos;

public class Camioneta extends Auto{
    private int numpasajero;
    private int capacidadcarga;
    private int cantidadejes;

    public Camioneta(int numpasajero, int capacidadcarga, int cantidadejes, String placa, int nserie, String marca, int anio, double precio) {
        super(placa, nserie, marca, anio, precio);
        this.numpasajero = numpasajero;
        this.capacidadcarga = capacidadcarga;
        this.cantidadejes = cantidadejes;
    }

    public int getNumpasajero() {
        return numpasajero;
    }

    public void setNumpasajero(int numpasajero) {
        this.numpasajero = numpasajero;
    }

    public int getCapacidadcarga() {
        return capacidadcarga;
    }

    public void setCapacidadcarga(int capacidadcarga) {
        this.capacidadcarga = capacidadcarga;
    }

    public int getCantidadejes() {
        return cantidadejes;
    }

    public void setCantidadejes(int cantidadejes) {
        this.cantidadejes = cantidadejes;
    }

    @Override
    public String toString() {
        return "Camioneta{" + "numpasajero=" + numpasajero + ", capacidadcarga=" + capacidadcarga + ", cantidadejes=" + cantidadejes + '}';
    }
    
    
}
