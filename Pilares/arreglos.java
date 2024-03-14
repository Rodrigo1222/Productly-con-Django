//Programa 1. (2 puntos) Crea un programa en Java considerando las siguientes instrucciones:
//Crea un arreglo llamado números el cual tenga los siguientes elementos 12, 10, 4, 24, 5 y 9.
//Realiza un ciclo que recorra todo el arreglo y en cada pasada,
//imprima El arreglo en la posición <número de posición>  tiene
//el número <imprimir el número que se encuentre en esa posición>. 
//Ejemplo. El arreglo en la posición 2 tiene el número 4.
//Toma captura de pantalla del código completo y del programa compilado.



public class arreglos {

    public static void main(String[] args) {
        int[] numeros = {12, 10, 4, 24, 5, 9};
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("El arreglo en la posición " + i + " tiene el número " + numeros[i] + ".");
        }

    }

}