package com.training;

import java.util.ArrayList;

public class Main {

    public static void main(String [] args) {
        /*
        * ArrayList = Un arrglo de tamano ajustable. Los elementos pueden ser
        * agregados y eliminados despues de la fase de compilacion. Guarda datos
        * que son de tipo de referencia
        */

        ArrayList<String> food = new ArrayList<String>();

        //Agrega un elemento al ArrayList
        food.add("Pizza");
        food.add("Hamburguesa");
        food.add("Perro");

        //Para el i iniciado en 0, mientras sea menor al tamano del arreglo, aumentar i en 1
        for (int i=0;i<food.size(); i++) {
            System.out.println(food.get(i));
        }

        //Remplaza el elemento en el indice dado como primer parametro, con el elemento dado en
        //el segundo parametro
        food.set(0, "Sushi");

        for (int i=0;i<food.size(); i++) {
            System.out.println(food.get(i));
        }

        //Elimina el elemento en el indice dado como parametro
        food.remove(2);

        for (int i=0;i<food.size(); i++) {
            System.out.println(food.get(i));
        }

        //Limpia el ArrayList
        food.clear();

        //Para guardar valores primitivos usamos las clases wrapper
        ArrayList<Integer> enteros = new ArrayList<Integer>();



    }

}
