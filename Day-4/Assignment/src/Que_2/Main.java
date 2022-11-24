package Que_2;

// Ques 2: Why collections are used in java, if everything can be implemented using Array?

/*
 Advantages of using collections :
 1. Collections are dynamic. Can increase size.
 2. Collection consumes less memory but also have lowe performance.
 3. Collection can hold both homogeneous and heterogeneous elements.
 4. Collection can hold only Object type data. (not primitive).
 5. Collections have implementations of all data-structures in form of classes and methods.

 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        // Adding Elements to list
        for(int i=1; i<10; i++){
            list.add(i);
        }

        // Retrieving Elements from the list
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }

        // Adding elements at a particular idx
        System.out.println("");
        list.add(0, 11);
        System.out.println(list);

        // Remove elements from the list
        list.remove(list.size()-1);
        System.out.println(list);
    }
}
