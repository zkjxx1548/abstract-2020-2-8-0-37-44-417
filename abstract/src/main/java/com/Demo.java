package com;

public class Demo {

  public static void main(String[] args) {
    Chickens cock = new Cock();
    Chickens hen = new Hen();
    Chickens childChicken = new ChildChicken();

    cock.buyChickensBy100();
    hen.buyChickensBy100();
    childChicken.buyChickensBy100();
  }

}
