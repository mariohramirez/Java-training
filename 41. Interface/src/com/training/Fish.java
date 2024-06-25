package com.training;

/*
* La clase Fish implementa dos interfaces, Prey y Predator
*/

public class Fish implements Prey,Predator{

    @Override
    public void flee(){
        System.out.println("El pez esta huyendo");
    }

    @Override
    public void hunt(){
        System.out.println("El pez esta cazando peces mas pequenos");
    }
}
