package com.training;

import java.util.Scanner;

/*
* Switch sirve para comparar un valor con una lista posible de valores
* Podemos usar tipos de datos que sean byte, short, char e int
*/
public class Main {

    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un dia");
        String day = scanner.nextLine();

        switch (day) {
            case "Domingo":
                System.out.println("Es Domingo");
                break;
            case "Lunes":
                System.out.println("Es Lunes");
                break;
            case "Martes":
                System.out.println("Es "+day);
                break;
            case "Miercoles":
                System.out.println("Es "+day);
                break;
            case "Jueves":
                System.out.println("Es "+day);
                break;
            case "Viernes":
                System.out.println("Es "+day);
                break;
            case "Sabado":
                System.out.println("Es "+day);
                break;
            default:
                System.out.println("No es un dia");
                break;
        }
    }

}
