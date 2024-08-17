package com.singleton;

public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {
        System.out.println("private constructor of LazyInitializedSingleton");
    }

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }


    public static void main(String[] args) {
        // Call the getInstance method to get the instance of LazyInitializedSingleton
        LazyInitializedSingleton singleton = LazyInitializedSingleton.getInstance();
        System.out.println("Singleton instance: " + singleton);

        // Call getInstance again to show that the same instance is returned
        LazyInitializedSingleton anotherSingleton = LazyInitializedSingleton.getInstance();
        System.out.println("Same instance? " + (singleton == anotherSingleton));
    }


}

/*
Explanation:
  Lazy Initialization: The LazyInitializedSingleton instance is created only when getInstance() is called for the first time. If the instance already exists, the method simply returns it.
  getInstance() Method: This method checks if the instance is null. If it is, it creates a new instance; otherwise, it returns the existing instance.
*/
