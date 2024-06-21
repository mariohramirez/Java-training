package com.training;

public class Main {

    public static void main(String[] args) {
        // inheritance = EL proceso en el cual una clase adquiere los atributos y metodos de otra

        Car car = new Car();

        //Llamamos al metodo que es de la clase Vehicle, el cual la clase Car ha heredado
        car.go();

        Bicycle bike = new Bicycle();

        bike.stop();

        System.out.println(car.doors);
        System.out.println(bike.pedals);

        bike.setSpeed(4.5);

        car.setSpeed(5.5);

        System.out.println(car.getSpeed());

        System.out.println(bike.getSpeed());

    }

}
