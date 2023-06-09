public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Marta", "Perez", 40665779, 25);
        Persona p2 = new Persona("Matias", "Gonzalez", 41265379, 23);
        RetiroCaja r1 = new RetiroCaja(p1, 550.00, 200, true, 200.00, 300, "rapida");
        RetiroCaja r2 = new RetiroCaja(p2, 250.00, 500, false, 100.00, 98, "comun");
        EnvioDomicilio e1 = new EnvioDomicilio(p1,700.00, 98, true, 100,50);
        EnvioDomicilio e2 = new EnvioDomicilio(p2, 200.00, 180, false,150,80);

        {
            if (r1.retirarTickets()) {
                System.out.println("Puede retirar");
            } else {
                System.out.println("No puede retirar");
            }
        }
        {
            if (e1.retirarTickets()) {
                System.out.println("Puede retirar");
            } else {
                System.out.println("No puede retirar");
            }
        }

        int resultadoComparacion;

        resultadoComparacion = e1.compareTo(e2);

        if (resultadoComparacion == 1){
            System.out.println("La caja de " + e1.persona.getNombre() +" es mayor a la de "+ e2.persona.getNombre());
        }if (resultadoComparacion == -1) {
            System.out.println("La caja de " + e1.persona.getNombre() + " es menor a la de " + e2.persona.getNombre());
        }else{
            System.out.println("Las cajas son iguales");
        }


if (r1.tipoCaja()){
    System.out.println("Es una caja rapida");
}else {
    System.out.println("No es una caja rapida");}








    }
}

