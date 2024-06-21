package com.training;

public class Main {

    public static void main(String[] args) {
        /*
        * Overloaded constructors = Multiples constructores dentro de la clase con el mismo nomnbre
        * pero con diferentes parametros, nombre + parametros = firma
        */

        Pizza pizza1 = new Pizza();
        Pizza pizza2 = new Pizza("thicc crust","tomato","mozzerella","pepperoni");
        Pizza pizza3 = new Pizza("thicc crust","tomato","mozzerella");

        System.out.println("Aqui estan los ingredientes de su pizza");
        System.out.println(pizza2.bread);
        System.out.println(pizza2.cheese);
        System.out.println(pizza2.sauce);
        System.out.println(pizza2.topping);
    }

}
