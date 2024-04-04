import java.util.Scanner;

public class Java_20OperacionesBasicas {
 //Propiedades o atributos
    double numero1, numero2, numero3, numero4, numero5, numero6; 
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
    public void imprimirREsultados() {
        System.out.println("La suma es:"+ numero3 );
        System.out.println("La resta es:"+ numero4);
        System.out.println("La Multi es:"+ numero5);
        System.out.println("La div es:"+ numero6);
    }
    public static void main(String[] args) {
       Java_02OperacionesBasicas operacion = new Java_03OperacionesBasicas();
       operacion.asignarValores();
       operacion.suma();
       operacion.resta();
       operacion.multi();
       operacion.div();
       operacion.imprimirREsultados();
    }

}
