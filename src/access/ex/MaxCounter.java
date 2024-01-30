package access.ex;

public class MaxCounter {
    //최대값을 지정하고 최대값까지만 값이 증가하는 기능 제공

    private int count = 0;
    private int max;

    public MaxCounter(int max){
        this.max = max;
    }
    //숫자 증가
    public void increment(){
        if(count >= max){
            System.out.println("최대값을 초과했습니다.");
        } else {
            count++;
        }
    }
    public int getCount(){
        return count;
    }
}
