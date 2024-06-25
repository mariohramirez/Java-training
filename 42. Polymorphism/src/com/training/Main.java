package com.training;

public class Main {

    public static void main(String [] args){
        /*
        * Polymorphism = Palabra griega para poly mucho y morph forma
        * Es la habilidad de un objeto de identificarse como mas de un tipo
        */

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();
        //Si hacemos la declaracion de esta forma tenemos un problema
        //Car racers = {car,bicycle,boat}
        //Podemos guardar el carro, pero no la bicicleta ni el bote
        //Lo mismo pasaria con Bicycle y Boat
        //Ahora cada una de las clase se idetnfica como la clase que es, Car, Boat o Bicycle
        //Pero tambien se identifican como Vehicle, por la herencia
        //Por lo cual los tres son de tipo Vehicle
        Vehicle[] racers = {car, bicycle, boat};

        for(Vehicle x: racers){
            x.go();
        }
    }

}
