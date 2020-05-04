package com.company;

 public class Dog extends Mammals {


  private String DogBreed;
  private int DogAge;

  public String getDogBreed() {

   return DogBreed;
  }

  public void setDogBreed(String DogBreed) {

   this.DogBreed = DogBreed;
  }

  public int getDogAge() {
   return DogAge;
  }

  public void setDogAge(int DogAge) {

   this.DogAge = DogAge;
  }


  public Dog(String DogBreed, int DogAge) {
   this.DogBreed = DogBreed;
   this.DogAge = DogAge;
  }

}
