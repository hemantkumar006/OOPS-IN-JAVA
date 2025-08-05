package collections;

import java.sql.SQLOutput;
import java.util.*;

public class MyCollection {

    public static void main(String[] args) {
        //Anything which is extends the collections is linear in nature
        //Linear means the data is present in one line

        //An interface can extends the interface but a class can only implements the interface

        //List maintained the order in indexed form just like arrays
        //arraylist is using the array internlly
        //ArrayList increases size automatically by 50% when full,
        // using Arrays.copyOf() to create a larger array and copy old elements into it.

        //Collection<String> stringList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();
        //List<String> stringList = new LinkedList<>();
        stringList.add("geeks");
        
        stringList.add("for");
        stringList.add("geeks");
        stringList.add("learning");

        System.out.println(stringList);//without traversing how u print all the elements of stringlist , because
        //ArrayList implements the function internally
        //System.out.println(stringList.get(3));
        System.out.println(stringList.size());
        System.out.println(stringList.remove(3));
        System.out.println(stringList);

        //ArrayList vs LinkedList
        //ArrayList is time-optimized and linkedlist is space-optimized


        ///////////////////Sets//////////////////////////////////
        // Doesnt contains the duplicate elements and not maintain the order
        //        Set<String> stringSet = new HashSet<>();

        //Set<String> stringSet = new LinkedHashSet<>(); // Linkedhashset is only different
        // on the basis of maintaining order, Uses a HashTable + doubly-linked list.

        Set<String> stringSet = new TreeSet<>();
        //Ordering: Maintains natural order (ascending) or uses a custom comparator.
        //Underlying Data Structure: Red-Black Tree (a type of self-balancing BST).

        stringSet.add("geeksisgeeks");
        stringSet.add("geeks");
        stringSet.add("for");
        stringSet.add("learning");
        stringSet.add("hello");
        stringSet.add("kumar");
        stringSet.add("hemant");

        /////////////////////Map///////////////
        //Map<Integer,String> map = new HashMap<>();
        Map<Integer,String> map = new LinkedHashMap<>(); //maintain the insertion order
        map.put(123,"hemant kumar");
        map.put(456,"chaudhary kumar");
        map.put(789,"saurabh kumar");
        map.put(321,"nikhil kumar");
        //map is not allowed to duplicate keys but allowed the duplicate values

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map);
        map.remove(456);
        System.out.println(map.containsKey(689));
        System.out.println(map);

        ////////////////Internal working of hashmap///////////////
        // object class is parent of all the class
        //hashcode() func will convert the object into an int
        // it create an array
        // []["123][][][][][][][]
        //       1
        //      "ABC" -> "XYZ"
        //      "ABC" -> "123"

        // ✅ HashMap Internal Working:

        // Uses Node<K, V>[] array (bucket array)
        // Each bucket uses LinkedList or Tree (if >= 8 nodes)

        // put(key, value):
        // - Compute hash & index → index = hash % array.length
        // - If bucket empty → insert node
        // - If key exists → update value
        // - Else → add to list or convert to tree (Java 8+)

        // get(key):
        // - Compute hash & index
        // - Traverse bucket, match key using equals()

        // Collision Handling:
        // - LinkedList → Tree if bucket has >= 8 entries (Java 8+)

        // Resizing:
        // - If size > capacity * 0.75 → double array size and rehash

        // Special:
        // - Allows one null key (stored at index 0)

        // Time Complexity:
        // - put/get: O(1) avg, O(log n) worst (tree case)

        /////////////////////Queue/////////////////////////
        //In which the first element added in queue , will leave that element first from queue


    }
}

//Java Collection
//-> List
//-> Set
//-> Map
