
import java.util.Scanner;

public class Programa01 {
 //Propiedades o atributos
    double numero1, numero2, numero3, numero4, numero5, numero6;
    String positivo, mayor, modulo, diferencia, Modulo;
//Metodos    
    public void asignarValores() {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresa el valor del numero uno: ");
        numero1=entrada.nextDouble();

        System.out.println("Ingresa el valor del numero uno: ");
        numero2=entrada.nextDouble();
    }
    public void suma() {
        numero3 = numero1 + numero2;
    }
    public void resta() {
        numero4 = numero1 - numero2;
    }
    public void multi() {
        numero5 = numero1 * numero2;
    }
    public void div() {
        numero6 = numero1 / numero2;
    }
    public void Modulo() {
        modulo = numero1 % numero2;
        
        if (numero6==0 ){
            System.out.println("La operación es entera.");
        }
        else{
            System.out.println("La operación no es entera"+modulo);
        }
        }
    public void Diferencia() {
        diferencia = (numero1== numero2) ? "Son iguales":"Son diferentes";
        }
    public void mayorMenor() {
        mayor =(numero1>numero2)?"Es mayor":"Es menor";
        }
        }
    public void positivo() {
        positivo = (numero1>0)? "Es posito":"Es negativo";
        }
    
    public void imprimirREsultados() {
        System.out.println("La suma es:"+ numero3 );
        System.out.println("La resta es:"+ numero4);
        System.out.println("La Multi es:"+ numero5);
        System.out.println("La División es:"+ numero6);
        System.out.println("Numero 1 es: " + mayor);
        System.out.println("Numero 1 es:" + positivo);
        
    
    public static void main(String[] args) {
    Programa01 operacion = new Programa01();
        operacion.asignarValores();
        operacion.suma();
        operacion.resta();
        operacion.multi();
        operacion.div();
        operacion.modulo();
        operacion.Modulo();
        operacion.Diferencia();
        operacion.mayorMenor();
        operacion.positivo();
    }
}    

