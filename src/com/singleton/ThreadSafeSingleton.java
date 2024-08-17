package com.singleton;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
        System.out.println("private constructor of ThreadSafeSingleton");
    }

  /*  public static synchronized ThreadSafeSingleton getInstance() {
        if(instance==null){
            instance=new ThreadSafeSingleton();
        }
        return instance;
    }*/

    public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        // Call the getInstanceUsingDoubleLocking method to get the instance of ThreadSafeSingleton
        ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
        System.out.println("Singleton instance: " + singleton);

        // Call getInstanceUsingDoubleLocking again to verify the same instance is returned
        ThreadSafeSingleton anotherSingleton = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
        System.out.println("Same instance? " + (singleton == anotherSingleton));
    }

}

/*
Explanation:
 Double-Checked Locking: The getInstanceUsingDoubleLocking() method checks if the instance is null before entering the synchronized block. Inside the synchronized block, it checks again to ensure that no other thread has already created an instance while the current thread was waiting. This makes the singleton thread-safe and avoids unnecessary synchronization once the instance is initialized.
 Thread Safety: This pattern is thread-safe, meaning that even if multiple threads try to access the getInstanceUsingDoubleLocking() method simultaneously, only one instance of ThreadSafeSingleton will be created.
*/