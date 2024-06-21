package com.training;

public class Main {

    public static void main(String[] args) {

        /*
        * Encapsulation = Los atributos de una clase estaran escondidos o seran privados,
        * Pueden ser accedidos mediante metodos(Getters y Setters)
        * Los atributos deberian hacerse privados si no hay razon para hacerlos publicos
        */

        Car car = new Car("Chevrolet", "Camaro", 2021);

        //Asginamos al atributo privado year un nuevo valor, por medio del metodo set
        car.setYear(2022);

        //Obtenemos los valores de atributos privados por medio de los metodos get
        System.out.println(car.getMake());
        System.out.println(car.getName());
        System.out.println(car.getYear());

    }

}
