package com.training;

public class Main {

    public static void main(String[] args) {

        Food food1 = new Food("pizza");
        Food food2 = new Food("haburger");
        Food food3 = new Food("hotdog");

        //Creamos el arreglo y lo conformamos de objetos tipo Food
        Food [] refrigerator = {food1, food2, food3};

        for(int i=0;i<refrigerator.length;i++){
            System.out.println(refrigerator[i].name);
        }

        Food[] elections = new Food[3];

        elections[0] = food1;
        elections[1] = food2;
        elections[2] = food3;

        int i=0;

        while (i<elections.length){
            System.out.println(elections[i].name);
            i++;
        }

    }

}
