package com.emrullahyz.dpatterns.decorator;

public class IPhone11Pro extends PhoneDecorator{

    public IPhone11Pro(IPhone basicPhone){
        super(basicPhone);
    }
    @Override
    public String getName() {
        return super.getName() + "11 pro";
    }

    @Override
    public int getCameraCount() {
        return super.getCameraCount() + 1 ;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 100 ;
    }
}
