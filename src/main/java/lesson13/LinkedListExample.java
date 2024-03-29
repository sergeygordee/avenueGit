package lesson13;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
       /* LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Anton");
        linkedList.add("Albert");
        linkedList.add("Oleg");
        linkedList.add("Olya");
        linkedList.add("Samat");
        linkedList.addLast("Rinat");
        linkedList.addFirst("Amir");
        linkedList.add(3, "Sergey");
        System.out.println(linkedList);
        System.out.println(linkedList.get(4));
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.getFirst());
        System.out.println();
        for (String temp:linkedList) {
            System.out.println(temp);
        }
        //linkedList.remove();
        //linkedList.removeFirst();
        //linkedList.removeLast();
        System.out.println(linkedList);*/

        LinkedList<Person> people = new LinkedList<>();
        people.add(new Person("Anton"));
        people.add(new Person("Albert"));
        people.add(new Person("Oleg"));
        people.add(new Person("Olya"));
        people.add(new Person("Samat"));
        people.addLast(new Person("Rinat"));
        people.addFirst(new Person("Amir"));
        people.add(3, new Person("Sergey"));
        for (Person person : people) {
            System.out.println(person.getName());
        }
    }
}
