package com.training.package2;

import com.training.package1.A;

public class Asub extends A {

    /*
    * Niveles de acceso
    * Modifier-------Class---Package---Subclass---World
    * public---------Y-------Y---------Y----------Y
    * protected------Y-------Y---------Y----------N
    * no modifier----Y-------Y---------N----------N
    * private--------Y-------N---------N----------N
    */

    public static void main(String[] args){

        C c = new C();

        //Como se encuentra en el mismo paquete puede acceder a dicho atributo
        System.out.println(c.defaultMessage);

        A.accessC();

        Asub asub = new Asub();


        //Puede hacer al atributo, puesto que Asub es una subclase de A
        System.out.println(asub.protectedMessage);

    }

}
