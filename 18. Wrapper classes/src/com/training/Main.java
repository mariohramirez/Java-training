package com.training;

public class Main {

    public static void main (String[] args) {

        /*
        * Wrapper class = Provee una forma de usar tipos de datos primitivos como tipos de datos
        * de referencia que pueden ser usados con colecciones por ejemplo los arreglos
        *
        * Los datos de referencia son mas lentos de acceder que los datos primitivos
        *
        * Primitivo     Wrapper
        * ---------     ----------
        * boolean       Boolean
        * char          Character
        * int           Integer
        * double        Double
        *
        * autoboxing = La conversion automatica que hace el compilador de java entre primitivos a Wrapper
        * unboxing = lo contratio a autoboxing. La conversion automatica de clases Wrapper a primitivas
        */

        //Se aplica autobocing, los valores primitivos han pasado a ser Wrapper
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Bro";

        //Aca se da el unboxing, tratando los datos como si fueran primitivos
        if(a==true) {
            System.out.println("Esto es verdad");
        }
    }
}
