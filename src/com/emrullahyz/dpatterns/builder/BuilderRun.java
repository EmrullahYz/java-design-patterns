package com.emrullahyz.dpatterns.builder;

public class BuilderRun {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setId(12L);

        //builder pattern product
        Product p2 = new Product.ProductBuilder()
                .id(12L)
                .name("computer")
                .build();
        System.out.println(p1);
        System.out.println(p2);
    }
}
