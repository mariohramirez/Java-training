package com.training;

import java.io.File;

public class Main {

    public static void main(String[] args){

        /*
        * File = Una representacion abstracta de un archivo y la direccion de un directorio
        */

        //Creamos el archivo con el nombre del archivo como parametro
        File file = new File("secret_message.txt");

        //Verifica si el archivo existe
        if(file.exists()){
            System.out.println("El archivo existe");
            //Obtiene el nombre del archivo
            System.out.println(file.getPath());
            //Obtiene la direccion completa del archivo
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
           // file.delete();
        }
        else {
            System.out.println("El archivo no existe");
        }
    }
}
