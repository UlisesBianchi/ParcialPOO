public abstract class Caja {
    protected Persona persona;
    protected double cantDinero;
    protected int cantTicketsDia;
    protected boolean aceptaTarjeta;

    public boolean retirarTickets(){
        if(this.cantTicketsDia>100) {
            return true;
        }else {
            return false; }
        }

    public Caja(Persona persona, double cantDinero, int cantTicketsDia, boolean aceptaTarjeta) {
        this.persona = persona;
        this.cantDinero = cantDinero;
        this.cantTicketsDia = cantTicketsDia;
        this.aceptaTarjeta = aceptaTarjeta;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public double getCantDinero() {
        return cantDinero;
    }

    public void setCantDinero(double cantDinero) {
        this.cantDinero = cantDinero;
    }

    public int getCantTicketsDia() {
        return cantTicketsDia;
    }

    public void setCantTicketsDia(int cantTicketsDia) {
        this.cantTicketsDia = cantTicketsDia;
    }

    public boolean isAceptaTarjeta() {
        return aceptaTarjeta;
    }

    public void setAceptaTarjeta(boolean aceptaTarjeta) {
        this.aceptaTarjeta = aceptaTarjeta;
    }
}
