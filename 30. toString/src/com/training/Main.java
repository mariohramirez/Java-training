package com.training;

public class Main {

    public static void main(String [] args){

        /*
        * toString() = Metodo especial que heredan todos los objetos,
        * retorna un String que es la representacion textual de un objeto.
        * Puede ser usado implicitamente y explicitamente
        */

        Car car = new Car();

        //Usamos el meotodo de manera explicita
        //Imprime la direccion de memoria del objeto si no sobrecargamos al metodo en la clase
        System.out.println(car.toString());

        //Usamos el metodo de manera implicita
        System.out.println(car);

    }

}
