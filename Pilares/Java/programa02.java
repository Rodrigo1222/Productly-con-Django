
import java.util.Scanner;

public class programa02 {
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
    public void Modulo() {
        numero6 = numero1 % numero2;
        
        if (numero6==0 ){
            System.out.println("La operación es entera.");
        }
        else{
            System.out.println("La operación no es entera"+numero6);
        }
        }
    public void Diferencia() {
        if (numero1 == numero2){
        System.out.println("Son iguales.");    
        }
        else{
        System.out.println("Son diferentes");
        }
        }
    public void mayorMenor() {
        if (numero1 < numero2){
            System.out.println("El numero" + numero2 + "es mayor");    
        }
        else{
            System.out.println("El numero" + numero1 + "es mayor");
        }
        }
    public void positivo() {
        if (numero1 >=  0){
            System.out.println("El numero" + numero2 + "es positivo");    
        }
        break;
        }
        }
        public void negativo() {
            if (numero1 >=  0){
                System.out.println("El numero" + numero2 + "es positivo");    
            }
            break;
        }  
    public void imprimirREsultados() {
        System.out.println("La suma es:"+ numero3 );
        System.out.println("La resta es:"+ numero4);
        System.out.println("La Multi es:"+ numero5);
        System.out.println("La div es:"+ numero6);
        
    }
    
    public static void main(String[] args) {
    programa02 operacion = new programa02();
        operacion.asignarValores();
        operacion.suma();
        operacion.resta();
        operacion.multi();
        operacion.div();
        operacion.imprimirREsultados();
        operacion.Modulo();
        operacion.Diferencia();
        operacion.mayorMenor();
        operacion.positivo();
    }
}    

