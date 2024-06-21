package com.training;

public class Main {

    public static void main(String [] args) {

        String x = "agua";
        String y = "gaseosa";

        System.out.println("X: "+x);
        System.out.println("Y: "+y);

        String temp;

        //Le llevamos el valor de x a la variable temporal
        temp = x;
        x=y;
        y=temp;

        System.out.println("Tras el cambio");
        System.out.println("X: "+x);
        System.out.println("Y: "+y);
    }

}
