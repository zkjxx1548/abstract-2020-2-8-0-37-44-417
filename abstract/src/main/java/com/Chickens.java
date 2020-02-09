package com;

public abstract class Chickens {
    public abstract double getPrice();

    public String getType() {
        return getClass().getSimpleName();
    }

    public void buyChickensBy100() {
        System.out.format("100元可以买%s %d只\n", getType(), (int)(100 / getPrice()));
    }
}
