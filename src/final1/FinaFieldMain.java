package final1;

public class FinaFieldMain {

    public static void main(String[] args) {
        //final 생성자 초기화
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        ConstructInit constructInit3 = new ConstructInit(30);
        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);
        System.out.println(constructInit3.value);

        //final 필드(멤버변수) 초기화
        System.out.println("멤버 변수 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);

        //상수
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);




    }
}
