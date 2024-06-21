package com.training;

public class Main {

    public static void main(String[] args) {

        //2D Arrays = un arreglo de arreglos

        String[][] cars = new String[3][3];

        cars[0][0]= "Camaro";
        cars[0][1]= "Corvette";
        cars[0][2]= "Silverado";
        cars[1][0]= "Mustang";
        cars[1][1]= "Ranger";
        cars[1][2]= "Ford";
        cars[2][0]= "Mazda";
        cars[2][1]= "Ferrari";
        cars[2][2]= "F-150";

        for (int i=0; i<cars.length;i++) {
            System.out.println();
            for(int j=0;j<cars[i].length;j++){
                System.out.print(cars[i][j]+" ");
            }
        }

        String[][] carsNew = {{"Camaro", "Corvette", "Silverado"},
                {"Mustang", "Ranger", "F-150"},
                {"Ferrari", "Lambo", "Tesla"}
        };

        for (int i=0; i<carsNew.length;i++) {
            System.out.println();
            for(int j=0;j<carsNew[i].length;j++){
                System.out.print(carsNew[i][j]+" ");
            }
        }


    }
}
