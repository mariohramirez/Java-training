package com.training.package1;

import com.training.package2.C;

public class A {

    protected String protectedMessage = "This is protected";

    public static void accessC(){
        C c = new C();
        //Como el atributo es public, A puede acceder a el aunque se encuentre en otro paquete
        System.out.println(c.pubicMessage);

    }

}
