
import java.util.Scanner;

public class arreglo {
    public static void main(String[] args) {   
        int n = 5;
        int[] numerosEnteros = new int[5];
        try (Scanner lecturaDato = new Scanner(System.in)) {
            for(int i = 0; i<=n-1; i++){
            System.out.println("Ingresa el valor "+ i);
            numerosEnteros[i] = lecturaDato.nextInt();
        }
        }    
            for(int i = 0; i<10; i++){
            System.out.println("Numero en arreglo: "+numerosEnteros[i]);

        }

    
    }
    
}