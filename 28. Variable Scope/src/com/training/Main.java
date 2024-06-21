package com.training;

public class Main {

    public static void main(String[] args){

        //Local = Es declarado dentro de un metodo, visible solo para el metodo
        //Global = Declarado fuera del metodo, pero dentro de la clase, visible en todas partes de la clase

        DiceRoller diceRoller = new DiceRoller();

        diceRoller.roll();

    }

}
