package collection;

import java.util.ArrayList;

public class collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("hello");
        list.add("i'm");
        list.add("Java");

        list.add(2, "서연이");
        //인덱스 위치에 add ->추가해준다
        list.set(0, "원식이");
        //인덱스 위치에 set -> 교체한다
        System.out.println(list);
        String str = list.get(2);
        //인덱스(2)에 위치한 리스트를 get 추출한다
        System.out.println(str);

        String remove = list.remove(3);
        // 인덱스(3)에 위치한 리스트를 remove 지운다.
        System.out.println(list);

        list.clear();
        //리스트를 전체 제거한다
        System.out.println(list);

    }

}
