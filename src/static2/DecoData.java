package static2;

public class DecoData {
    private int instanceValue; //인스턴스 변수
    private static int staticValue; //static변수

    public static void staticCall(){
        staticValue++;
        staticMethod();
        //instanceValue ++; static메소드에서 인스턴스 변수 접근 , 컴파일 에러
        //instanceMethod(); static메소드에서 인스턴스 메소드 접근, 컴파일 에러
    }
    public void instanceCall(){
        instanceValue ++;
        instanceMethod();

        staticValue ++; //인스턴스 메서드에서 static변수 호출 가능
        staticMethod(); //인스턴스 메서드에서 static메서드 호출 가능
    }
    public static void staticMethod(){
        System.out.println("staticValue = " + staticValue);
        //System.out.println("instanceValue = " + instanceValue);
        //static 메소드에서 인스턴스 변수 접근 컴파일 오류
    }
    public void instanceMethod(){
        // System.out.println("staticValue = " + staticValue);
        //인스턴스 메소드에서 static변수 접근 가능
        System.out.println("instanceValue = " + instanceValue);
    }
    public static void staticCall(DecoData data){
        data.instanceValue++;
        data.instanceCall();
    }


}
