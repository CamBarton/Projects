package com.company;

public class Cat extends Mammals {

    private String colorOfCat;

    public String getcolorOfCat() {

        return colorOfCat;
    }


    public void setColorOfCat(String colorOfCat) {

        this.colorOfCat = colorOfCat;
    }

    public Cat(String colorOfCat) {
        this.colorOfCat = colorOfCat;

    }


}
