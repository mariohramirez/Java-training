package com.training;

public class Main {

    public static void main(String [] args) {

        //Array = usado para guardar multiples valores en una sola variable

        String[] cars = {"Camaro", "Corvette", "Tesla"};

        for (int i=0; i<cars.length; i++) {
            System.out.println(cars[i]);
        }

        String[] carsNew = new String[3];

        carsNew[0] = "Ford";
        carsNew[1] = "Mazda";
        carsNew[2] = "Ferrari";

        int j = 0;

        while(j<carsNew.length) {
            System.out.println(carsNew[j]);
            j++;
        }
    }
}
