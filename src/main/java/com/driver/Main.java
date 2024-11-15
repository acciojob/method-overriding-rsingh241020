package com.driver;

public class Main {
    // Task 1: Define class A as a static inner class
    static class A {
        public String meth() {
            return "Invoking method from class A";
        }
    }

    // Task 2 and 4: Define class B as a static inner class that extends A
    static class B extends A {
        @Override
        public String meth() {
            return "Method is overridden in Extended class B";
        }
    }

    public static void main(String[] args) {
        //A a = new A();   // No need for an instance of Main
        B b = new B();

        // Call meth on each instance and print the result
        //System.out.println(a.meth());
        System.out.println(b.meth());
    }
}
