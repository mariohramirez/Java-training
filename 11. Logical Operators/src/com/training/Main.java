package com.training;

import java.util.Scanner;

public class Main {

    public static void main (String [] args) {
        /*
        * Operadores logicos = Usados para conectar dos o mas expresiones
        * && = (AND) ambas condiciones deben ser verdaderas
        * || = (OR) una de las condiciones debe ser verdadera
        * ! = (NOT) reversa el valor booleano de la condicion
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la temperatura");

        int temp = scanner.nextInt();

        if(temp>30) {
            System.out.println("Esta muy caliente afuera");
        }
        else if(temp>=20 && temp<=30) {
            System.out.println("Esta caluroso afuera");
        }
        else
        {
            System.out.println("Esta frio afuera");
        }

        System.out.println("Ahora estas jugando un juego, presiona q o Q para salir");
        String response = scanner.next();

        if(response.equals("q") || response.equals("Q")){
            System.out.println("Saliste del juego");
        }
        else {
            System.out.println("Sigues en el juego");
        }

        System.out.println("Yo solo miento, di si o no");
        response = scanner.next();

        if (!response.equals("si")){
            System.out.println("Dijiste si");
        }
        else {
            System.out.println("Dijiste no");
        }
    }
}
