package com.training;

//Hacemos los importes necesarios
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String [] args){

        //Hacemos un blo que try catch para la excepcion
        try {
            //Creamos una instancia de FileWriter
            FileWriter file = new FileWriter("poem.txt");
            //Escribimos la primera linea del texto
            file.write("Hola \neste es un \npoema");
            //Agrega un string o caracteres a la ultima linea
            file.append("\n(Un poema por mi)");
            //Ciera el filewriter
            file.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
