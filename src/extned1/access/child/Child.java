package extned1.access.child;

import extned1.access.parent.Parent;

public class Child extends Parent {
    public void call(){
        publicValue = 1;
        protectedValue = 1; //상속 관계로 인해 사용 가능
        //defaultValue = 1; //다른패키지 접근 불가,컴파일 오류
        //privateValue = 1; //접근 불가, 컴파일 오류

        publicMethod();
        protectedMethod(); //상속관계로 인해 사용 가능
       // defaultMethod();
       // privateMethod();

        printParent();

    }
}

