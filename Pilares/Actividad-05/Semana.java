
import java.util.Scanner;

public class Semana {

    public static void main(String[] args) {
        int dia=0;
        String texto ="";
        Scanner diaDeLaSemana = new Scanner(System.in);
        System.out.println(" Introduce un número del 1 al 7 para conocer el día de la semana: ");
        dia = diaDeLaSemana.nextInt();

        switch (dia) {
            case 1:
                texto = "Es lunes.";
                break;

            case 2:
            texto = "Es Martes.";
                break; 
            
            case 3:
            texto = "Es Miercoles.";
                break; 
            
            case 4:
            texto = "Es Jueves.";
                break; 

            case 5:
            texto = "Es Viernes.";
                break; 

            case 6:
            texto = "Es Sabado.";
                break; 

            case 7:
            texto = "Es Domingo.";
                break; 


            default:
            System.out.println("Numero no valido.");
                break;
        }
    System.out.println(texto);
    }
}
