package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        //객체 저장
        map.put("이서연", 100);
        map.put("표원식",95);
        map.put("도도",80);
        map.put("이서연",99); //키가 같기 때문에 제일 마지막에 저장된 값만 저장된다
        System.out.println("총 객체 수 : " + map.size());

        //키로 값(value) 얻기
        String key = "표원식";
        int value = map.get(key); //키에 해당된 value 값을 꺼내옴
        System.out.println(key + " : " + value);
        System.out.println("---------------------------");

        //키 set 컬렉션을 얻고, 반복해서 키와 값을 얻기
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator(); //키를 반복하기 위해 반복자를 얻음

        while(iterator.hasNext()){
            String k = iterator.next();
            Integer v = map.get(k);
            System.out.println(k + " : " + v);

        }System.out.println("------------------------------");

        //엔트리 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()){
            Map.Entry<String,Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + " : " + v);

        } System.out.println("-----------------------------------");

        //키로 엔트리 삭지
        map.remove("도도");
        System.out.println(map.size());





    }
}
