package Que1;

// Ques 1. Can we create a non-Abstract method inside an interface: -> YES
// We can have static as well as defaults methods in interfaces.
public interface Inter {

    public void displayName();

    public void displayAddress();

    default void displayInstitute(){
        System.out.println("Masai Java Batch");
    }

    static void batchStrength(){
        System.out.println("WEB18 : 712");
    }
}
