package Que2;

public interface Inter2 {

    void displayName2();

    default void displayData(){
        System.out.println("default method -> displayData() Inter2");
    }
}
