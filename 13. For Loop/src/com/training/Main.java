package com.training;

public class Main {

    public static void main(String [] args) {
        //For loop = ejecuta el bloque de codigo por una cantidad de veces limitadas

        //Para i que es igual a 0, mientras sea menor  o igual a 10, sume uno a i
        for(int i=0;i<=10;i++) {
            System.out.println(i);
        }

        for(int i=10;i>=0;i--) {
            System.out.println(i);
        }

        for (int i=0;i<=20;i+=2) {
            System.out.println(i);
        }
    }
}
