package com.singleton;

public class EagerInitializedSingleton {
    //1. Eager initialization
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
    ;

    private EagerInitializedSingleton() {
        System.out.println("private constructor");
    }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        EagerInitializedSingleton singleton = EagerInitializedSingleton.getInstance();
        System.out.println("Singleton instance: " + singleton);

    }
}

/*
    Explanation:
        getInstance() Method: You call this method to access the single instance of the class.
        Output: When you run this program, it will call the private constructor only once during class loading,
        and then it will return the same instance every time getInstance() is called.
*/
