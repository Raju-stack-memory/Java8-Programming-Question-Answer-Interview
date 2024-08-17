package com.singleton;

public class StaticBlockSingleton {
    //Static block is similar to eager initialization, and except that instance of the class is created in the static block
    // that provides the option for exception handling.

    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {
        System.out.println("private Constructor of StaticBlockSingleton ");
    }

    // static block initialization for exception handling
    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }


    public static void main(String[] args) {
        // Call the getInstance method to get the instance of StaticBlockSingleton
        StaticBlockSingleton singleton = StaticBlockSingleton.getInstance();
        System.out.println("Singleton instance: " + singleton);
    }
}
        /*
        Explanation:
        Static Block Initialization: The static block is executed when the class is loaded, and it creates the singleton instance.
        This block allows for exception handling during the creation of the instance.
        getInstance() Method: This method returns the single instance of the class.
        */
