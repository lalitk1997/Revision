package Que_4;

/*
Que 4. Difference between Iterator and ListIterator
Ans
1.1 Iterators are used for all Collections.
1.2 ListIterator are specifically used for list e.g. liked list, arraylist etc.

2.1 Iterator can only traverse in forward direction.
2.2 ListIterator can traverse in both (forward and backward) directions.

3.1 Iterator cannot replace elements.
3.2 ListIterator can be used to replace elements.

 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for(int i=0; i<10; i++)
            list.add(i);

        System.out.println(list);

        // Normal Iterator
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println("");

        // List Iterator
        ListIterator itr = list.listIterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println("");

        // Iterating Backwards
        while (itr.hasPrevious()){
            System.out.print(itr.previous()+" ");
        }
        System.out.println("");

        // Adding values
        itr.next();
        itr.set(80000);

        System.out.println(list);

    }
}
