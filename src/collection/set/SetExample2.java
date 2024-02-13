package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample2 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("java");
        set.add("JDB");
        set.add("JSP");
        set.add("Spring");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            //객체를 하나 가져오기
            String element = iterator.next();
            System.out.println(element);
            if(element.equals("JSP")){
                //가져온 객체를 컬렉션에서 제거하기
                iterator.remove();
            }
        }
        set.remove("Java");
        for (String s : set) {
            System.out.println(s);

        }
    }
}
