package com.company;
public class Calculator {
    public static void sum(int a, int b){
        System.out.println("The sum of "+a+" and "+b+" is "+(a+b));
    }
    public static void multiply(int a, int b){
        System.out.println("The multiplication of "+a+" and "+b+" is "+a*b);
    }
    public static void divide(int a, int b){
        System.out.println("The division of "+a+" and "+b+" is "+a/b);
    }
    public static void modulus(int a, int b){
        System.out.println("The modulus of "+a+"%"+b+" is "+a%b);
    }
    public static void sin(int a){
        System.out.println("The sin value of "+a+" is "+Math.sin(a));
    }
    public static void cos(int a){
        System.out.println("The cos value of "+a+" is "+Math.cos(1));
    }
    public static void tan(int a){
        System.out.println("The tan value of "+a+" is "+Math.tan(1));
    }

}
