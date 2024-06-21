package com.training;

public class Main {

    public static void main(String[] args) {

        /*
        * OOP = Object Oriented Programming, Porgramacion Orientada a Objetos
        * Object = Una instancia de una clase que puede contener atributos y metodos
        * Ejemplo: Telefono, Escritorio, Computador, Taza de Cafe
        */

        Car myCar1 = new Car();
        Car myCar2 = new Car();

        System.out.println(myCar1.make);
        System.out.println(myCar1.model);
        System.out.println();
        System.out.println(myCar2.make);
        System.out.println(myCar2.model);

        myCar1.drive();
        myCar1.brake();

    }

}
