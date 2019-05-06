
package empresaAutos;

public class Auto {
    protected String placa;
    protected int nserie;
    protected String marca;
    protected int anio;
    protected double precio;

    public Auto(String placa, int nserie, String marca, int anio, double precio) {
        this.placa = placa;
        this.nserie = nserie;
        this.marca = marca;
        this.anio = anio;
        this.precio = precio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    

    public int getNserie() {
        return nserie;
    }

    public void setNserie(int nserie) {
        this.nserie = nserie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
