package SetsAndMaps;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class demoSets {
    public static void main(String[] args) {

        // A set keeps unique elements

        //HashSet -> Does not guarantee the constant order of elements over time
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(73);
        hashSet.add(13);
        hashSet.add(69);
        hashSet.add(42);
        // print elements from the hashSet
        for (int e : hashSet) {
            System.out.println(e);
        }

        System.out.println("-------------------------");

        //TreeSet  // The elements are ordered incrementally
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(73);
        treeSet.add(13);
        treeSet.add(69);
        treeSet.add(42);
        // print elements from the treeSet
        for (int e : treeSet) {
            System.out.println(e);
        }
        System.out.println("----------------------");

        //LinkedHashSet  -> The order of appearance is preserved

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(23);
        linkedHashSet.add(2);
        linkedHashSet.add(13);
        linkedHashSet.add(42);

        for (int e : linkedHashSet) {
            System.out.println(e);
        }
    }
}
