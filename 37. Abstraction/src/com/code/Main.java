package com.code;

public class Main {

    public static void main(String[] args){
        /*
        * abstract = Las clases abstractas o pueden ser instanciadas, pero pueden tener una subclase
        * los metodos abstractos son declarados sin una implementacion
        */


        //La clase no puede ser instanciada, puesto que es abstracta
        //Vehicle vehicle = new Vehicle();

        Car car = new Car();

        System.out.println(car.wheels);

    }

}
