package collection.arraylist;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("서연");
        list.add("원식");
        list.add("테구");
        list.add("화이트");
        System.out.println(list.size());
        System.out.println(("---------------"));

        list.remove(2);
        System.out.println(list);

    }
}
