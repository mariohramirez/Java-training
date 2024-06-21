package com.training;

//IMportamos la libreria para usar Random
import java.util.Random;

public class Main {

    public static void main (String[] args) {

        Random random = new Random();

        //Obtenemos un numero INT aleatorio
        int x = random.nextInt();

        System.out.println(x);

        //Obtenemos un numero int aleatorio entre 0 y 6
        x = random.nextInt(6);

        System.out.println(x);

        //Obtenemos un numero int aleatorio entre 1 y 6

        x = random.nextInt(6)+1;

        System.out.println(x);

        //Obtenemos un numero doble aleatorio
        double y = random.nextDouble();

        System.out.println(y);

        //Obtenemos un booleano aleatorio
        boolean z = random.nextBoolean();

        System.out.println(z);

    }
}
