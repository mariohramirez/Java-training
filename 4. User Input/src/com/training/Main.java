package com.training;

import java.util.Scanner;

public class Main {

    public static void main(String [] args) {

        //Creamos el scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cual es tu nombre?");

        String name = scanner.nextLine();

        System.out.println("Hola "+name);

        System.out.println("Cuantos anos tienes?");

        //Acepta enteros
        int edad = scanner.nextInt();


        System.out.println("Tienes "+edad+" anos");

        System.out.println("Cual es tu comida favorita?");
        //Si usamos nextLine despues de algun otro metodo next del scanner
        //que no sea un nextLine, tendremos un error, puesto que el nextInt
        //No agrega un /n despues de la linea que lee, asi que se mantiene en la misma
        //linea, por lo tanto el nextLine considera que esta en la misma linea
        //y agrega el salto, asi que es como si no sucediera nada, para arreglarlo podemos
        //hacer un llamado al metodo nextLine antes de usarlo en la variable que leera el
        //input del usuairo
        scanner.nextLine();
        String comida = scanner.nextLine();

        System.out.println("Te gusta la siguiente comida: "+comida);

        
    }
}
