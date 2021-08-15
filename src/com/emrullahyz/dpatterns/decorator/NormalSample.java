package com.emrullahyz.dpatterns.decorator;

public class NormalSample {
    public static class Iphone12{
        public String name(){
            return "iphone12";
        }
        int getCameraCount(){
            return 2;
        }
    }
    public static class Iphone12pro{
        public String name(){
            return "Iphone12pro";
        }
        int getCameraCount(){
            return 3;
        }
    }
    public static class Iphone12proMax{
        public String name(){
            return "Iphone12proMax";
        }
        int getCameraCount(){
            return 3;
        }
    }

}
