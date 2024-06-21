package com.training;

import java.util.ArrayList;

public class Main {

    public static void main(String [] args) {

        /*
        * For-each = Una tecnica para recorrer, iterando a traves de los elementos en un arreglo/coleccion
        * menos passo, se lee mejor
        * menos flexible
        */

        String[] animals = {"cat", "dog", "rat", "bird"};

        //for-each Para cada String i en el arreglo animals
        for(String i : animals) {
            System.out.println(i);
        }

        ArrayList<String> animalsArray = new ArrayList<String>();

        animalsArray.add("cat");
        animalsArray.add("dog");
        animalsArray.add("rat");
        animalsArray.add("bird");

        for(String i : animalsArray) {
            System.out.println(i);
        }


    }
}
