package com.training;

import java.util.Scanner;

public class Main {

    public static void main(String [] args) {

        //nested loops = Un ciclo dentro de un ciclo

        Scanner scanner = new Scanner(System.in);
        int row;
        int columns;
        String symbol = "";

        System.out.println("Ingrese el numero de filas: ");
        row = scanner.nextInt();

        System.out.println("Ingrese el numero de columnas: ");
        columns = scanner.nextInt();

        System.out.println("Ingrese el simbolo para usar: ");
        symbol = scanner.next();

        for(int i=1; i<=row; i++){
            System.out.println();
            for (int j=1; j<=columns; j++) {
                System.out.print(symbol);
            }
        }

    }

}
