package com.driver;

class A {
    public String meth() {
        // return "Invoking method from class A";
        System.out.println("Invoking method from class A");
    }
}

class B extends A {
    @Override
    public String meth() {
        System.out.println("Method is overridden in Extended class B");
    }
}

public class Main {
    public static void main(String[] args) {
        // A objA = new A();
        // System.out.println(objA.meth());

        B objB = new B();
        objB.meth();
    }
}
