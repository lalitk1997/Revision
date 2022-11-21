package Que2;

/*
Ques 2: Implement 2 interfaces in a single class having same default methods and observe the catch there?
 */

public interface Inter1 {

    void displayName1();

    default void displayData(){
        System.out.println("default method -> displayData() Inter1");
    }
}
