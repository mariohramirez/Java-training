package com.training;

import java.util.Random;

public class DiceRoller {

    //Variables de forma global
    Random random;
    int number;

    DiceRoller() {
        //Atributos en forma local al metodo Constructor
        //Random random = new Random();
        //int number = 0;
        random = new Random();
        roll();
    }

    void roll() {
        //No funciona puesto que definimos number dentro de la clase constructor
        // Asi que es local a la clase constructor
        // number = random.nextInt(6)+1;
        number = random.nextInt(6)+1;
        System.out.println(number);
    }

}
