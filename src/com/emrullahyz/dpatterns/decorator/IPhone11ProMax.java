package com.emrullahyz.dpatterns.decorator;

public class IPhone11ProMax extends IPhone11Pro{

    public IPhone11ProMax(IPhone basicPhone){
        super(basicPhone);
    }
    @Override
    public String getName() {
        return super.getName() + " Max";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 100 ;
    }

    public String getColors(){
        return "red, green, purple";
    }
}
