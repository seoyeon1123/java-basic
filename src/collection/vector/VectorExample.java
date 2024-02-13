package collection.vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        List<Board> list = new Vector<>();

        // 작업 스레드 객체 생성
        Thread threadA = new Thread() {
            public void run() {
                for (int i = 0; i <= 1000; i++) {
                    list.add(new Board("제목 : " + i, "내용 : " + i, "글쓴이 : " + i));
                }
            }
        };
        //작업 스레드 실행
        threadA.start();
        //작업 스레드를 모두 종료될 때까지 스레드를 긷리게 ㅎㅁ
        try{
            threadA.join();
        }catch (Exception e){
        }
        //저장된 총 객체 수 얻기
        int size = list.size();
        System.out.println("총 객체 수 : " + size);

    }
}
