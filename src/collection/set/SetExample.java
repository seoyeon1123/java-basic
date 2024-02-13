package collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("java");
        set.add("JDB");
        set.add("JSP");
        set.add("Spring");
        set.add("java"); //중복객체이므로 저장되지 않음

        int size = set.size();
        System.out.println("객체 수  :" + size);
    }
}
