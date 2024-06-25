package com.training;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        * Exception = UN evento que ocurre durante la ejecucion del programa, el cual
        * irrumpe con el flujo normla de las instrucciones
        */

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese un numero entero para dividir");
            int x = scanner.nextInt();

            System.out.println("Ingrese iun mero entero por el cual dividir");
            int y = scanner.nextInt();

            int z = x / y;

            System.out.println("Resultado: " + z);
        }//Excepcion aritmetica
        catch (ArithmeticException e){
            System.out.println("No es posible dividir por cero");
        }//Excepcion cuando es un tipo diferente al necesario
        catch (InputMismatchException e){
            System.out.println("Es necesario ingresar un numero entero");
        }//Excepcion general
        catch (Exception e) {
            System.out.println("Ocurrio un error");
        }
        finally {
            System.out.println("Esto siempre se va a imprimir");
        }
    }

}
