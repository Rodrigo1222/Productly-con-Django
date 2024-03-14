public class CuentaBancaria {
    
public static void main(String[] args) {
    
    double saldo = 1000.75;
    double cantidadARetirar = 250;
    double saldoActualizado = saldo - cantidadARetirar;
    double cantidadParaCadaAmigo = saldoActualizado/3;
    boolean puedeComprarTicket = cantidadParaCadaAmigo > 250;
    System.out.println("Le di a cada amigo" + cantidadParaCadaAmigo);
    System.out.println("¿Pueden comprar ticket?:"+ puedeComprarTicket);

    }    



}