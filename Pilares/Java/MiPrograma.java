/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *Comentario de bloque.
 * @author Aldo
 */
public class MiPrograma { //Comentario de linea

double num1= 5, num2 = 4, num3= 5, num4= 2, resultado1, resultado2, resultado3, resultado4, numero2 = 2.1;
static String saludo = "Hola mundo";
static int numero1 = 2;
static char variable_Caracter= 'a';
static boolean booleanos = true, mayor_Que, menor_Que, igual_Que, diferente_De, and2, or2;

public void suma() {
resultado1= num1 + num2;
    }
public void resta() {
resultado2= num3 - num4;
}
public void multi() {
resultado3= num1 * num2;
}
public void div() {
    resultado2= num3 / num4;
}
public void mayorQue(){
mayor_Que = num1 > num2;
}
public void menorQue(){
    menor_Que = num3 < num4;
}
public void igualQue(){
    igual_Que = num1 == num2;
}
public void diferenteDe(){
diferente_De = num3 != num4;
}
public void and2(){
  and2 =  mayor_Que && menor_Que; 
}
public void or2(){
    or2 =  mayor_Que || diferente_De; 
}  
public void imprimirREsultados() {
    System.out.println("La suma es:"+ resultado1);
    System.out.println("La resta es:"+ resultado2);
    System.out.println("La Multi es:"+ resultado3);
    System.out.println("La div es:"+ resultado4);
    System.out.println("Num1 es mayor que num2?:"+ mayor_Que);
    System.out.println("Num3 es menor que num4?:"+ menor_Que);
    System.out.println("Num1 es igual que num2?:"+ igual_Que);
    System.out.println("Num3 es diferente que num4?:"+diferente_De);
    System.out.println("true y flase:"+and2);
    System.out.println("true o flase:"+or2);
    
}
public static void main(String[] args){
MiPrograma operacion = new MiPrograma();
operacion.suma();
operacion.resta();
operacion.div();
operacion.multi();
System.out.println(saludo);
System.out.println(numero1);
System.out.println(numero2);
System.out.println(variable_Caracter);
System.out.println(booleanos);
operacion.imprimirREsultados();
    }
}