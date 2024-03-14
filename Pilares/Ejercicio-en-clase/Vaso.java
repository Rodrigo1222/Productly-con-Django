import java.util.Scanner;;
public class Vaso {
    
public static void main(String[] args) {
    String tamano="",  texto = "El vaso encontrado es: "; 
    int  numero =0; 
    Scanner lecturaDato = new Scanner(System.in);
    System.out.println("Ingresa el tamaño. 9oz, 12oz, 20oz, 32oz: ");
    numero = lecturaDato.nextInt();
    switch (numero)
    {
        case 9:
            tamano = "Chico";
            break;
        case 12:
            tamano = "Mediano";
            break;
        case 20:
            tamano = "Grande";
            break;
        case 32:
            tamano = "Extra grande";
            break;
        default:
            System.out.print("No encontrado.");
}
System.out.println(texto + ""+ tamano);
}
}