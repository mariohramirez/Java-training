package com.training;

import java.util.Scanner;

public class Main {

    public static void main(String [] args) {
        int edad;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu edad: ");

        edad = scanner.nextInt();

        //Verifica si el valor de la edad es mayor o igual a 18 y menor a 75
        if(edad>=18 && edad<75) {
            System.out.println("Eres mayor de edad");
        }
        //De lo contrario si la edad es mayo o igual a 75
        else if(edad>=75) {
            System.out.println("Esta bien boomer");
        }
        //Si la edad es igual a 13
        else if (edad==13) {
            System.out.println("Eres un adolescente");
        }
        //De lo contrario
        else {
            System.out.println("Eres menor de edad");
        }
    }
}
