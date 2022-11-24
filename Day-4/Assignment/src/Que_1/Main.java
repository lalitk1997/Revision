package Que_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// How to convert a Array into ArrayList and vice-versa ?
/*
1. Can use Arrays.asList() method to convert an array into arraylist.
2. Can ise List.toArray() method to convert an arraylist to array.
 */
// Write example.
public class Main {
    public static void main(String[] args) {
        Integer[] arr2 = new Integer[10];
        for(int i=1; i<10; i++){
            arr2[i] = i;
        }
        System.out.println("Printing Array : ");
        System.out.println(Arrays.toString(arr2));
        List<Integer> list2 = Arrays.asList(arr2);
        System.out.println("Conversion Array -> List done...");
        System.out.println("Printing List :");
        System.out.println(list2.toString());

        List<Integer> list = new ArrayList<>();
        for(int i=1; i<10; i++){
            list.add(i);
        }
        System.out.println("Printing List : ");
        System.out.println(list);
        Integer[] arr = list.toArray(new Integer[9]);
        System.out.println("Converting List -> Array done...");
        System.out.println(Arrays.toString(arr));
    }
}
