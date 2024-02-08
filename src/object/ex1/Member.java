package object.ex1;

public class Member {
    public String id;

    public Member(String id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        //모든 자바클래스는 오브젝을 상속 받는다. 어떠한 자바 객체도 대입이 가능하다
        if (obj instanceof Member target) {
            if (id.equals(target.id)) {
                return true;
            }
            }
        return false;
    }
}
