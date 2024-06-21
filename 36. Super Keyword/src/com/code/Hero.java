package com.code;

public class Hero extends Person{

    String power;

    public Hero(String name, int age, String power){
        //Para name y age funciona, pero no es la mejor practica, ya que son
        //atributos de la clase Person
        //this.name = name;
        //this.age = age;
        //Super se refiere a la clase Person, llamamos al metodo constructor de la clase Person
        //Y pasamos los parametros name y age
        super(name, age);
        this.power = power;
    }

    @Override
    public String toString() {
        //Llamamos al metodo toString de la clase pariente
        return super.toString()+this.power;
    }
}
