package com.company;

public class Addition {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("addition is "+c);
    }
    public static void addition(int a, int b){
        int c = a+b;
        System.out.println("Addition using function:"+c);
    }
    public static int addition(){
        int a = 10;
        int b = 30;
        return a+b;
    }
}
