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
        return "Method is overridden in Extendend class B";
    }
}

public class Main {
    public static void main(String[] args) {
        // Task 3: Create object of class B and call method meth of class A with it
        B b = new B();

        // Call the overridden method
        b.meth(); // Task 5: Output should show overridden method from class B
        b.meth();
    }
}
