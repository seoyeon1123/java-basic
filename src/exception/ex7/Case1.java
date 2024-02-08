package exception.ex7;

public class Case1 {
    public static void main(String[] args) {
        int index = -1;
        int[]array = {1,2,3};
        try{
            System.out.println(array[index]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("예외 발생");
        }
        System.out.println("프로그램 종료");
    }
}
