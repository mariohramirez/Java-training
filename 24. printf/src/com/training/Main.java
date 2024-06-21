package com.training;

public class Main {

    public static void main(String[] args) {
        /*
        * printf() = Un metodo pcional para controlar, formatear y mostrar texto en la consola
        * dos argumentos = formato del string + (objeto/variable/valor)
        * % [flags] [precision] [width] [conversion-character]
        */

        //Con printf podemos darme formato a un string, por ejemplo usando %d podemos mostrar
        //el valor que le damos como parametro, en este caso es para un digito % sera nuestro
        //especificador de formato
        System.out.printf("Este es un formato de string %d",123);
        System.out.println();

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000;

        //[conversion-character]
        //Usamos el especificador de formato % y luego b, que nos permite mostrar booleanos
        System.out.printf("%b", myBoolean);
        System.out.println();
        //Usamos el especificador de formato % y luego c, que nos permite mostrar caracteres
        System.out.printf("%c", myChar);
        System.out.println();
        //Usamos el especificador de formato % y luego s, que nos permite mostrar Strings
        System.out.printf("%s", myString);
        System.out.println();
        //Usamos el especificador de formato % y luego d, que nos permite mostrar digitos
        System.out.printf("%d", myInt);
        System.out.println();
        //Usamos el especificador de formato % y luego f, que nos permite mostrar racionales
        System.out.printf("%f", myDouble);
        System.out.println();

        //[width]
        //Asgina el numero minmo de caracteres que se van a escribir en la salida
        System.out.printf("Hola %10s",myString);
        System.out.println();

        //[precision]
        //Asigna el numero de digitos de precision cuando se muestre un valor racional
        System.out.printf("Tienes esta cantidad de dinero %.2f",myDouble);
        System.out.println();

        //[flags]
        //Agrega un efecto a la salida segun el flag agrgado al especifidor de formato
        //-: justificado a la izquierda
        //+:
        //0: Los valores numericos son
        //,: Agrupa separadores si numeros son mayores a 1000
    }
}
