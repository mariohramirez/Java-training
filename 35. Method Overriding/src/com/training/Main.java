package com.training;

public class Main {

    public static void main(String[] args) {

        /*
        * Method overriding = Declarar un metodo en una sub clase, el cual ya esta presente
        * en la clase pariente. Hacerlo de esta forma significa que la clase hija puede darle
        * su propia implementacion
        */

        Animal animal = new Animal();
        Dog dog = new Dog();

        dog.speak();

    }

}
