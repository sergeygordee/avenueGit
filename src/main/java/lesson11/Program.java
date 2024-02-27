package lesson11;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Sergey");
        arrayList.add("Anton");
        arrayList.add("Vladimir");
        arrayList.add("Marat");
        arrayList.add("Albert");
        arrayList.add(3, "Elephant");
        //arrayList.add("Elephant");
        //System.out.println(arrayList.get(3));

        //for (Object elem:arrayList) {
        //    System.out.println(elem);
        //}
        //System.out.println();
        //System.out.println(arrayList);

        /*if (arrayList.contains("Anton")){
            System.out.println("Это дневник Антона");
        }
        else {
            System.out.println("В классе антона нет");
        }*/

        //System.out.println(arrayList);
        //arrayList.remove("Anton");
        //arrayList.remove(1);
        //arrayList.removeAll(arrayList);
        System.out.println(arrayList);
        System.out.println(arrayList.lastIndexOf("Marat"));
        System.out.println(arrayList.size());







        /*String str = "Hello world";
        Object age = 12;
        age = "hello world";
        age = true;
        System.out.println(age);*/

        /*Account<Integer> anton = new Account<>(12,5000 );
        System.out.println(anton.getId());

        Account<String> sergey = new Account<>("qwe12",5000);
        System.out.println(sergey.getId());*/

        /*Account account = new Account("123a", 5000);
        int accountId = (int) account.getId();
        System.out.println(accountId);*/
    }
}
