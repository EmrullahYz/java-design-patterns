package com.emrullahyz.dpatterns.decorator;

public class DecoratorRun {
    public static void main(String[] args) {
        Phone phone = new IPhone11ProMax(new IPhone());

        System.out.println("Name :" +phone.getName());
        System.out.println("Price :" +phone.getPrice());
        System.out.println("Camera Count :" +phone.getCameraCount());

    }
}
