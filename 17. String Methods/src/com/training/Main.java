package com.training;

public class Main {

    public static void main(String[] args) {

        //String = Un tipo de dato de referencia que puede guardar uno o mas caracteres
        // los tipos de datos de referencia tienen acceso a metodos muy utiles

        String name = "Bro";

        //Compara los dos strings, ignorando las mayusculas y minusculas
        boolean resultBoolean = name.equalsIgnoreCase("bro");
        System.out.println(resultBoolean);
        //Devuelve la longitud del String
        int resultInt = name.length();
        System.out.println(resultInt);
        //Devuelve el caracter en la posicion 0 del string
        char resultChar = name.charAt(0);
        System.out.println(resultChar);
        //Devuleve el indice en el que se encuentra el caracter
        resultInt = name.indexOf("o");
        System.out.println(resultInt);
        //Verifica si el string esta vacio
        resultBoolean = name.isEmpty();
        System.out.println(resultBoolean);
        //Devuelve el string en mayuscula
        String result = name.toUpperCase();
        System.out.println(result);
        //Devuelve el string en minuscula
        result = name.toLowerCase();
        System.out.println(result);
        //Elimina los espacios del string
        result = name.trim();
        System.out.println(result);
        //Remplaza el caracter en el string dado como primer parametro, por el caracter dado en el segundo parametro
        result = name.replace('o','a');
        System.out.println(result);
    }
}
