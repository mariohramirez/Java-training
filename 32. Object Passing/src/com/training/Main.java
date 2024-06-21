package com.training;

public class Main {

    public static void main(String [] args){

        //Creamos el objeto de tipo garaje
        Garage garage = new Garage();

        //Creamos los objetos de tipo Car
        Car car1 = new Car("BMW");
        Car car2 = new Car("Tesla");

        //Llamamos al meto park de la clase Garage y le damos un objeto de tipo
        //Car como parametro
        garage.park(car1);
        garage.park(car2);

    }

}
