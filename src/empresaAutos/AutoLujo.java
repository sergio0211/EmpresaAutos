
package empresaAutos;

public class AutoLujo extends Auto{
    private int numpasajero;

    public AutoLujo(int numpasajero, String placa, int nserie, String marca, int anio, double precio) {
        super(placa, nserie, marca, anio, precio);
        this.numpasajero = numpasajero;
    }

    public int getNumpasajero() {
        return numpasajero;
    }

    public void setNumpasajero(int numpasajero) {
        this.numpasajero = numpasajero;
    }
    
    
}
