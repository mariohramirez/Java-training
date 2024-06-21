package com.training;

public class Main {

    public static void main(String[] args) {

        //Overloaded methods = SOn metodos que comparten el mismo nombre pero tienen diferentes parametros
        // nombre del metodo +parametros = firma de un metodo

        int resultado1 = add(1,2);

        System.out.println(resultado1);

        int resultado2 = add(5,10,15);

        System.out.println(resultado2);

        int resultado3 = add(9,3,7,12);

        System.out.println(resultado3);

        double resultado4 = add(1.0,2.0);

        System.out.println(resultado4);

        double resultado5 = add(1.0,2.0,3.0);

        System.out.println(resultado5);

        double x = add(1.0, 2.0, 3.0, 4.0);

        System.out.println(x);

    }

    //Definimos el metodo add que suma dos valores
    static int add(int a, int b) {
        System.out.println("Este es el metrodo sobrecargado 1");
        return a+b;
    }

    //Definimos el metodo con el mismo nombre pero tres parametros
    static int add(int a, int b, int c) {
        System.out.println("Este es el metrodo sobrecargado 2");
        return a+b+c;
    }

    //Definimos el metodo con el mismo nombre pero con cuatro parametros
    static int add(int a, int b, int c, int d) {
        System.out.println("Este es el metrodo sobrecargado 3");
        return a+b;
    }

    //Definimos el metodo con el mismo nombre pero ahora devuelve un tipo de dato distinto
    static double add(double a, double b) {
        System.out.println("Este es el metrodo sobrecargado 5");
        return a+b;
    }
    static double add(double a, double b, double c) {
        System.out.println("Este es el metrodo sobrecargado 5");
        return a+b+c;
    }
    static double add(double a, double b, double c, double d) {
        System.out.println("Este es el metrodo sobrecargado 6");
        return a+b+c+d;
    }
}
