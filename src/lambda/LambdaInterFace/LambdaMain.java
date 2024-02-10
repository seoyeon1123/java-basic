package lambda.LambdaInterFace;

import lambda.LambdaInterFace.LambdaInterFace2;
import lambda.LambdaInterFace.LambdaInterFace3;
import lambda.LambdaInterFace.LambdaInterFace4;
import lambda.LambdaInterFace.LambdaInterface;

public class LambdaMain {
    public static void main(String[] args) {
        LambdaInterface li1 = (String s1, String s2, String s3) -> {
            System.out.println(s1 +s2+s3);
        };
        li1.method("hello", "Java","world");

        LambdaInterFace2 li2 = System.out::println;
        li2.method("안녕 원식");

        LambdaInterFace3 li3 = () -> System.out.println("안녕");
        li3.method();

        LambdaInterFace4 li4 = (x, y) -> {
            int result = x + y;
            return result;
        };
        System.out.println(li4.method(3,5));
    }
}
