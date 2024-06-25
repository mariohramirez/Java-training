package com.training;

public class Main {

    public static void main(String[] args) {

        /*
        * Interface = Una plantilla que puede ser aplicada a una clase.
        * Similar a la herencia, pero especifica lo que una clase tiene o debe hacer.
        * La clases pueden ser aplicadas con mas de una interface, la herencia esta limitada
        * a 1 clase super.
        */

        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        Fish fish = new Fish();

        fish.hunt();
        fish.flee();

    }

}
