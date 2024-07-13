package com.jala.operators;

public class Logical {
    public static void main(String[] args) {
        int a = 20;
        int b = 12;
        int c = 6;
        System.out.println(a > b || a > c);
        System.out.println(a < b || a < c);
        System.out.println(a < b || a > c);
        System.out.println(a > b && a > c);
        System.out.println(a < b && a < c);
        System.out.println(a > b && a < c);
        System.out.println(!(a > b));
        System.out.println(!(a < b));
    }
}
