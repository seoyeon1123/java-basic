package collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class BoardMain {
    public static void main(String[] args) {
        //ArrayList 생성
        List<Board> list = new ArrayList<>();
        list.add(new Board("제목1","내용1","글쓴이1"));
        list.add(new Board("제목2","내용2","글쓴이2"));
        list.add(new Board("제목3","내용3","글쓴이3"));
        list.add(new Board("제목4","내용4","글쓴이4"));
        list.add(new Board("제목5","내용5","글쓴이5"));

        //list의 크기
        int size = list.size();
        System.out.println("총 객체의 수 : " + size);

        //특정 리스트를 가져오기
        Board board = list.get(2);
        System.out.println("인덱스 2 [ " + board + " ]");

        //모든 객체를 하나씩 가져오기
        for (int i = 0; i < list.size(); i++) {
            Board b = list.get(i);
            System.out.println(b);
        }
        //객체 삭제
        list.remove(3);
        list.remove(3);

        //for문으로 객체를 하나씩 가져오기
        for (Board board1 : list) {
            System.out.println(board1);
        }
    }
}
