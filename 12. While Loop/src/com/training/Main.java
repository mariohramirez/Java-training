package com.training;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        //while loop = Ejecuta el bloque de codigo mientras la condicion sea verdadera

        Scanner scanner = new Scanner(System.in);

        String name = "";

        //Mientras nmae este vacio haga el codigo
        while(name.isEmpty()) {
            System.out.println("Ingrese su nombres: ");
            name = scanner.nextLine();
        }

        name = "";

        //Ejecuta el codigo primero y luego verifica la condicion
        do{
            System.out.println("Ingrese su nombre: ");
            name = scanner.nextLine();
        }while (name.isEmpty());

    }
}
