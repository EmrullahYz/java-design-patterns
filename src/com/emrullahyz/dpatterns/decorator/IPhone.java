package com.emrullahyz.dpatterns.decorator;

public class IPhone implements Phone{
    @Override
    public String getName() {
        return "Iphone";
    }

    @Override
    public int getCameraCount() {
        return 2;
    }

    @Override
    public double getPrice() {
        return 699.90;
    }
}
