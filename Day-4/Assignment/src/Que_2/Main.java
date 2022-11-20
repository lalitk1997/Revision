package Que_2;

// Ques 2: Why collections are used in java, if everything can be implemented using Array?

/*
Collections provide in-buit data-structure implementable classes.
Standardized implementation of popular data-structure allows programmers to re-use already optimized methods.
Support of multiple optimized methods for each data-structure.
Ease development process for developers and code is more reliable, efficient and optimized.
Giving example of ArrayList and associated implemented methods.
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
