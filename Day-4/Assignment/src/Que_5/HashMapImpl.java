package Que_5;
/*
HashMap
-> No order is maintained.
-> Key : value pair (majorly to count keys)
-> Involves hashing -> hashCode() method
-> Faster searching

Java HashMap contains values based on the key.
Java HashMap contains only unique keys.
Java HashMap may have one null key and multiple null values.
Java HashMap is non synchronized.
Java HashMap maintains no order.

 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapImpl {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        String name = "Lalit Kumar";

        for(int i=0; i<name.length(); i++){
            if(map.get(name.charAt(i)) == null)
                map.put(name.charAt(i), 1);
            else
                map.put(name.charAt(i), map.get(name.charAt(i))+1);
        }

        System.out.println(map);

        // Iterator
        Iterator itr = map.keySet().iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

        // Using Entry Set
        for(Map.Entry entry : map.entrySet())
            System.out.println(entry.getKey()+" "+entry.getValue());
    }
}
