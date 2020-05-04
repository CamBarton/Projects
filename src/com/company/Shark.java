package com.company;

public class Shark extends Fish{

    private String SharkType;
    private String Ocean;

    public String getSharkType() {

        return SharkType;
    }

    public void setSharkType(String SharkType) {

        this.SharkType = SharkType;
    }

    public Shark(String SharkType, String Ocean) {
        this.SharkType = SharkType;
        this.Ocean = Ocean;

    }

    public String getOcean() {
        return Ocean;
    }

    public void setDogAge(String Ocean) {

        this.Ocean = Ocean;
    }



}
