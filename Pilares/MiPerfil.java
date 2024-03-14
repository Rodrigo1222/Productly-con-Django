/* En el método main(), crea una variable llamada nombre que contenga tu nombre, 
como una secuencia de caracteres.
Crea una variable llamada edad que contenga tu edad como un número entero.
Crea una variable llamada salarioDeseado que contenga tu salario deseado 
por mes con una precisión de dos puntos decimales.
Crea una variable llamada genero que contenga un solo carácter, m (masculino), f (femenino),
 n (para ninguno) u o (para otro).

Crea una variable llamada buscandoTrabajo que contenga si actualmente 
estás abierto a ofertas de trabajo o no.
Imprime el valor de cada una de las variables, una por cada línea.
Escribe la salida.
Toma captura de pantalla del código completo y del programa compilado.
 */

 public class MiPerfil {
    public static void main(String[] args) {
        String nombre ="Aldo Rodrigo Mondragón Soto";
        int edad = 34;
        float  salarioDeseado = 18000;
        char genero = 'm';
        boolean buscandoTrabajo = true;
System.out.println("Mi nombre es: "+ nombre);
System.out.println("Tengo: "+ edad);
System.out.println("Salario deseado: " + salarioDeseado);
System.out.println("Genero" + genero);
System.out.println("Busco trabajo: " + buscandoTrabajo);

}
}
