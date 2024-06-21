package com.training;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /*
        *
        */

        //Creamos un arreglo de 2D dimensiones, por eso en el tipo de dato ponemos un ArrayList
        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        //Creamos un ArrayList
        ArrayList<String> bakeryList = new ArrayList();
        //Agregamos los elementos
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        System.out.println(bakeryList);

        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        for(int i=0; i<produceList.size();i++){
            System.out.println(produceList.get(i));
        }

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("soda");
        drinksList.add("coffe");

        int j=0;

        while(j<drinksList.size())
        {
            System.out.println(drinksList.get(j));
            j +=1;
        }

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList);

        for (int i=0; i<groceryList.size();i++){
            System.out.println(groceryList.get(i));
            for(int k =0;k<groceryList.get(i).size();k++){
                System.out.print(groceryList.get(i).get(k)+" ");
            }
            System.out.println();
        }

    }

}
