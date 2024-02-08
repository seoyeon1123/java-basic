package object.ex3;

public class SmartPhoneMain {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("삼성전자","안드로이드");

        String s = smartPhone.toString();
        System.out.println(s);
        System.out.println(smartPhone);
    }
}
