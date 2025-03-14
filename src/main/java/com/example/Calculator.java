package com.example;

public class Calculator {
    public void t() {
        TestMakar tm = new TestMakar();
        System.out.println(tm.bar("sss"));
        tm.foo();
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
    public int tro (int a, int b) {
        return a * b;
    }

}