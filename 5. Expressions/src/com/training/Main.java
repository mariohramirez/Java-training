package com.training;

public class Main {

    public static void main(String[] args) {
        //Expresion = operandos y operadores
        //Operandos = valores, variables, numeros, cantidades
        //Operadores = + - * / %

        int friends = 10;

        friends = friends + 1;

        System.out.println(friends);

        friends = friends - 1;

        System.out.println(friends);

        friends = friends * 2;

        System.out.println(friends);

        friends = friends/2;

        System.out.println(friends);

        //Nos da el residuo de la division
        friends = friends % 3;

        System.out.println(friends);

        //Adicion en 1
        friends++;

        System.out.println(friends);

        //Resta en 1
        friends--;

        System.out.println(friends);

        //Usamos el double antes de la expresion double para conertir el resultado a un double
        //Y lo guardamos en resultado
        double resultado = (double) friends/2;

        System.out.println(resultado);
    }

}
