package com.training;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args){
        /*
        * FileReader = Lee el contenido de un archivo como un flujo de caracteres. Uno por uno
        * read() retorna un valor entero el cual contiene el valor en byte, cuando read() retorna
        * -1, significa que no hay mas dato para ser leidos
        */

        try{
            //Se crea una instancia de FileReader y se le da como parametro el nombre del archivo
            FileReader reader = new FileReader("art.txt");
            //Lee el primer caracter
            int data = reader.read();
            //Ciclo para leer el resto de caracteres
            while (data!=-1){
                System.out.println((char)data);
                data = reader.read();
            }
            reader.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}
