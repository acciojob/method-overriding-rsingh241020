package com.driver;

// Task 1: Create class A with a method named meth
class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

// Task 2: Create class B which extends class A
class B extends A {

    // Task 4: Override method meth in class B
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

public class Main {
    public static void main(String[] args) {
        // Task 3: Create object of class B and call method meth from class A with it
        B b = new B();

        // Task 5: Call the overridden method from object of class B
        System.out.println(b.meth());  // Should print "Method is overridden in Extended class B"
    }
}
