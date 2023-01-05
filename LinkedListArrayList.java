import java.util.LinkedList;
import java.util.ArrayList;

public class LinkedListArrayList {
    public static void main(String[] args) {
        // TLDR: identical methods but very different operations behind the scenes

        LinkedList<String> fruitsLinkedList = new LinkedList<>();
        fruitsLinkedList.add("Banana");
        fruitsLinkedList.add("Apple");
        fruitsLinkedList.add("Melon");
        fruitsLinkedList.add("Grape");
        System.out.println(fruitsLinkedList.get(2));
        
        ArrayList<String> fruitsArrayList = new ArrayList<>();
        fruitsArrayList.add("Banana");
        fruitsArrayList.add("Apple");
        fruitsArrayList.add("Melon");
        fruitsArrayList.add("Grape");
        System.out.println(fruitsArrayList.get(2));
    }
}