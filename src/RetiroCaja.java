public class RetiroCaja extends Caja {
    private double cantEfectivo;
    private int cantUnidades;
    private String categoria;

    public boolean tipoCaja() {
        if (this.categoria == "rapida") {
            return true;
        } else {
            return false;
        }
    }


    public RetiroCaja(Persona persona, double cantDinero, int cantTicketsDia, boolean aceptaTarjeta, double cantEfectivo, int cantUnidades, String categoria) {
        super(persona, cantDinero, cantTicketsDia, aceptaTarjeta);
        this.cantEfectivo = cantEfectivo;
        this.cantUnidades = cantUnidades;
        this.categoria = categoria;
    }
    public double getCantEfectivo() {
        return cantEfectivo;
    }

    public void setCantEfectivo(double cantEfectivo) {
        this.cantEfectivo = cantEfectivo;
    }

    public int getCantUnidades() {
        return cantUnidades;
    }

    public void setCantUnidades(int cantUnidades) {
        this.cantUnidades = cantUnidades;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
