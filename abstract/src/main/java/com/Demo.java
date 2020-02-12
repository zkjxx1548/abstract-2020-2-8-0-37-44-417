package com;

public class Demo {

  public static void main(String[] args) {
    Chickens cock = new Cock();
    Chickens hen = new Hen();
    Chickens childChicken = new ChildChicken();

    cock.buyChickensByMoeny(100);
    hen.buyChickensByMoeny(100);
    childChicken.buyChickensByMoeny(100);
  }

}
