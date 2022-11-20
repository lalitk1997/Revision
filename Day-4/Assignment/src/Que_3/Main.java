package Que_3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

// Ques 3 What is fail-safe and fail-fast collection iterations.
/*
Iterators -> In java iterators are used to iterate over the Collections.

Fail-fast iterators ->
It throws ConcurrentModificationException, if there is structural modification of the collection.
Structural modifications include adding, removing any element from the collection while a thread is iterating
    over the collection.
ArrayList, HashMap classes are some example of fail-fast iterator.
Not reliable, only used for debug purposes.

Fail-safe iterators ->
Make an internal copy of the collections and then iterate over the copy-collection.
Any structural modification done to the iterator affects the copied collection only.
Original collection structure remain unchanged.
Ex- CopyOnWriteArrayList etc.

Fail-safe iterator which does not create separate copy -> ConcurrentHashMap
 */
public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Gurgaon", "Haryana");
        map.put("Chandni Chowk", "Delhi");
        map.put("Indore", "Maharashtra");

        Iterator iterator = map.keySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            // map.put("Nainital", "Uttarakhand");
        }

        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator iterator1 = list.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
            list.add(20);
        }
        System.out.println(list);
    }
}
