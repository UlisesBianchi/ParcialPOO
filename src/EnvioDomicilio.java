public class EnvioDomicilio extends Caja implements Comparable{
    private int cantPedidosMes;
    private int cantCamionesDesp;


    public EnvioDomicilio(Persona persona, double cantDinero, int cantTicketsDia, boolean aceptaTarjeta, int cantPedidosMes, int cantCamionesDesp) {
        super(persona, cantDinero, cantTicketsDia, aceptaTarjeta);
        this.cantPedidosMes = cantPedidosMes;
        this.cantCamionesDesp = cantCamionesDesp;
    }

    public int getCantPedidosMes() {
        return cantPedidosMes;
    }

    public void setCantPedidosMes(int cantPedidosMes) {
        this.cantPedidosMes = cantPedidosMes;
    }

    public int getCantCamionesDesp() {
        return cantCamionesDesp;
    }

    public void setCantCamionesDesp(int cantCamionesDesp) {
        this.cantCamionesDesp = cantCamionesDesp;
    }

    @Override
    public int compareTo(Object o) {
        EnvioDomicilio otroEnvio = (EnvioDomicilio)o;
        if (otroEnvio.cantPedidosMes > this.cantPedidosMes) {
            return 1;
        } else if (otroEnvio.cantPedidosMes < this.cantPedidosMes) {
            return -1;
        }else {
            return 0;
        }
    }
}
