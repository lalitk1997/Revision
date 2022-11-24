package Que_5;
/*
Implementing Hash-set
-> Allows null value.
-> It stores the elements using the hashing mechanism.
-> It is a non-synchronized class.
-> Elements are inserted and identified using hash code.
-> Only contains unique elements.
-> Most useful in the search operations.
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetImpl {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        for (int i=0; i<10; i++){
            set.add(i);
        }
        for (int i=0; i<20; i++){
            set.add(i);
        }

        // Using in-build toString()
        System.out.println(set);

        // Iterator
        Iterator itr = set.iterator();
        while (itr.hasNext())
            System.out.print(itr.next()+" ");
        System.out.println("");

        // ForEach
        set.forEach(System.out::print);
    }
}
