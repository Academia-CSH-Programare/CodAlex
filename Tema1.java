package com.company;

class Cons {
    double x,y,z,r;
}

public class Main {
    
    public static void main(String[] args) {
        Cons cons = new Cons();
        cons.x = Math.random();
        cons.y = Math.random();
        cons.z = Math.random();
        cons.r = Math.random();
        System.out.println(calc(cons.x,cons.y,cons.z,cons.r));
    }

    public static double calc(double xv, double yv, double zv, double rv) {
        double result = xv + yv + zv + rv;
        return result;
    }
}