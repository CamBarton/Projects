package com.company;

public class Runner {

    public static void main(String[] args) {

        Dog myDog = new Dog("German Shepard" , 2);
        Shark myShark = new Shark("Great White", "Pacific");
        Cat myCat = new Cat("Orange");


        System.out.println(myDog.getDogBreed() + "," + myDog.getDogAge());
        System.out.println(myShark.getSharkType() + " ," + myShark.getOcean());
        System.out.println(myCat.getcolorOfCat());





    }
}
