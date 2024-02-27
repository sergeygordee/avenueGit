package lesson13;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Olya");
        treeSet.add("Albert");
        treeSet.add("Oleg");
        treeSet.add("Samat");
        treeSet.add("Anton");
        treeSet.add("Rinat");
        treeSet.remove("Anton");
    //treeSet.add("Rinat");
        for (String temp:treeSet){
            System.out.println(temp);
        }
        System.out.println();
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        SortedSet<String> sortedSet = treeSet.subSet("Oleg", "Rinat");
        System.out.println(sortedSet);

        System.out.println(treeSet.higher("Samat"));
        System.out.println(treeSet.lower("Albert"));

        System.out.println();
        NavigableSet<String> navigableSet = treeSet.descendingSet();
        System.out.println(navigableSet);
        System.out.println();
        SortedSet<String> sortedSet1 = treeSet.headSet("Rinat");
        System.out.println(sortedSet1);
        System.out.println();
        SortedSet<String> sortedSet2 = treeSet.tailSet("Rinat");
        System.out.println(sortedSet2);

    }
}
