package co.edu.unisabana.example;
import java.util.Scanner;



public class Suma{
    public static void suma(){
        int numero1 = 0;
        int numero2 = 0;
        int resultado;

        Scanner reader = new Scanner(System.in);
  
        System.out.println("Introduce el primer número:");      
        numero1 = reader.nextInt();
      
        System.out.println("Introduce el segundo número:");
        numero2 = reader.nextInt();

        resultado = numero1+numero2;

        System.out.println("La suma es " + numero1 + " + " + numero2 + " = " + resultado);
    }
}

