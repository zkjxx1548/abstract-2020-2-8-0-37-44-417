package com;

public abstract class Chickens {
    public abstract double getPrice();

    public String getType() {
        return getClass().getSimpleName();
    }

    public void buyChickensByMoeny(int money) {
        System.out.format("%d元可以买%s %d只\n", money, getType(), (int)(money / getPrice()));
    }
}
