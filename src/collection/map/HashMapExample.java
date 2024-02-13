package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("홍길동",85);
        map.put("이서연",100);
        map.put("표원식",80);
        map.put("홍길동",90);
        // key값이 중복이기 때문에, 마지막으로 저장한 홍길동만 저장이 됌.
        int size = map.size();
        System.out.println(size);

        //키로 값 얻기
        String key = "홍길동";
        int value = map.get(key);
        System.out.println(value);

        //키 set컬렉션 얻고 반복해서 키와 값 얻기
        Set<String> keyset = map.keySet();
        Iterator<String> keyIterator = keyset.iterator();
        while (keyIterator.hasNext()){
            String k = keyIterator.next();
            Integer v = map.get(key);
            System.out.println(k + v);
        }


    }
}
