package com.training;

public class Main {

    public static void main(String[] args) {

        //Constructor = Es un metodo especial que es llamado cuando un objeto es instanciado(Creado)

        Human human = new Human("Rick", 65, 70.0);

        System.out.println("El humano: "+human.getName()+" de edad: "+human.getAge()+", con el peso: "+human.getWeight());

        human.eat();
    }

}
