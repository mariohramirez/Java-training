package com.code;

public class Main {

    public static void main(String[] args){

        /*
        * Super = palabra clave que se refiere a una superclase (Pariente) de un objeto
        * muy similar a la palabra clave this
        */

        Hero hero1 = new Hero("Batman",42,"$$$");
        Hero hero2 = new Hero("Superman",43,"Todo");

        System.out.println(hero2.toString());
        System.out.println(hero1.toString());

    }

}
