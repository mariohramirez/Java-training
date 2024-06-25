package com.training;

import java.util.Scanner;

public class Main {

    /*
    * Dynamic = Despues de la compilacion(Durante la ejecucion)
    * Ejemplo: Un corvette es un: corvette, un carro, un vehiculo y un objeto
    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("Que animal quieres?");
        System.out.println("(1=Perro) O (2=Gato)");
        int choice = scanner.nextInt();

        if (choice==1){
            //El animal que fue creado anteriormente sera identificado como tipo
            //Dog en medio de la ejecucion y llamara al metodo sobreescrito
            //speak de Dog
            animal = new Dog();
            animal.speak();
        }
        else if(choice==2){
            animal = new Cat();
            animal.speak();
        }

    }
}
