package lesson13;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Anton");
        hashSet.add("Albert");
        hashSet.add("Oleg");
        hashSet.add("Olya");
        hashSet.add("Samat");
        hashSet.add("Rinat");
        boolean isAdded = hashSet.add("Oleg1");
        System.out.println(isAdded);
        System.out.println(hashSet.size());
        hashSet.remove("Oleg");
        System.out.println(hashSet);
    }
}
