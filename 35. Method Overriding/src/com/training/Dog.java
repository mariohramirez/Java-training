package com.training;

//Clase hija que hereda de la clase Animal
public class Dog extends Animal{

    //Llamamos al metodo de igual forma para hacer la sobrecarga del metodo
    //Ponemos la etiqueta de sobrecarga
    @Override
    public void speak() {
        System.out.println("El perro ha ladrado");
    }
}
