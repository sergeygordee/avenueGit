package org.example;


public class HomeTask3 {
    public static void main(String[] args) {
        String text = "Я буду учиться лучше";
        String[] words = text.split(" ");
        for (String word : words){
            System.out.println(word);
        }
    }
}
