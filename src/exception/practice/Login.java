package exception.practice;

public class Login {

    public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
        if (!id.equals("blue")) {
            throw new NotExistIDException("아이디가 존재하지 않습니다.");
        }
        if (!password.equals("12345")) {
            throw new WrongPasswordException("비밀번호가 올바르지 않습니다.");
        }
    }
}
