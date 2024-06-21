package com.training;

public class Main {

    public static void main(String [] args) {
        /*
        * data type--size-----primitive/reference---value
        * boolean----1 bit----primitive-------------true or false
        * byte-------1 byte---primitive-------------(-128 to 127)
        * short------2 bytes--primitive-------------(-32,768 to 32,767)
        * int--------4 bytes--primitive-------------(-2 billion to 2 billion)
        * long-------8 bytes--primitive-------------(-9 quintillion to 9 quintillion)
        * float------4 bytes--primitive-------------(fractional number up to 6-7 digits)
        * double-----8 bytes--primitive-------------(fractional number up to 15 digits)
        * char-------2 bytes--primitive-------------single character/letter/ASCII value
        * String-----varies---reference-------------a sequence of characters
        *
        * Las diferencias entre los datos primitivos y los de referencia.
        * Los primitivos son los tipos de valores vistos anteriormente, los de referencia
        * son ilimitados, definidos por el ususario. Los primitivos guardan informacion, los de referencia guardan
        * direcciones. Los primitivos solo pueden guardar un valor, los de referenci mas de uno. Los primitivos usan
        * menos memoria. Los primitivos son mas rapidos.
        * */

        //Declaracion de una variable
        int x;
        //Asignar un valor a la variable
        x = 123;
        //Inicializacion de una variable
        int y = 234;

        System.out.println("La variable x, tiene el valor: "+x);
        System.out.println("La variable y, tiene el valor: "+y);

        long numeroGrande = 1231321232324212323L;

        System.out.println("El numero grande es: "+numeroGrande);

        float numeroFloat = 3.14f;

        System.out.println("EL numero float es: "+numeroFloat);

        double numeroDouble= 3.14;

        System.out.println("El numero double es: "+numeroDouble);

        boolean variableBooleana = true;

        System.out.println("La variable booleana es: "+variableBooleana);

        char simbolo = '@';

        System.out.println("El char es: "+simbolo);

        String nombre = "Mario";

        System.out.println("EL string es: "+nombre);
    }
}
