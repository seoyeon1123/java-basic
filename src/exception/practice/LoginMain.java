package exception.practice;

public class LoginMain {
    public static void main(String[] args) {
        try {
            Login.login("white", "12345");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            Login.login("blue", "12345");  // 비밀번호를 "12345"로 수정
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}