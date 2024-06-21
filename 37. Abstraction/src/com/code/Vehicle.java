package com.code;

//Creamos una clase con la palabra clave abstract, lo que lo hace una clase abstracta
public abstract class Vehicle {

    int wheels;

    Vehicle(int wheels){
        this.wheels = wheels;
    }

    //Metodo abstracto que no tiene ninguna implementacion
    //Los metodos abstractos no pueden tener nada en el cuerpo de los mismos
    public abstract void go();
}
