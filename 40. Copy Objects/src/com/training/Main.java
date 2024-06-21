package com.training;

public class Main {

    public static void main(String [] args) {

        Car car1 = new Car("Chevrolet","Camaro",2021);
        Car car2 = new Car("Ford","Mustang",2022);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getName());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getName());
        System.out.println(car2.getYear());

        //Esto es un error
        //car2 = car1;
        //En este caso le dimos la misma direccion de memoria a ambas variables
        
        car2.copy(car1);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getName());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getName());
        System.out.println(car2.getYear());
    }

}
