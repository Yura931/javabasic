package ch07;

public class 인터페이스Ex2 {
    public static void main(String[] args) {
        /*
            인터페이스의 장점
                : 두 대상(객체)간의 '연결, 대화, 소통'을 돕는 '중간 역할'을 한다.
                : 선언(설계)와 구현을 분리시킬 수 있게 한다.
                : 개발 시간을 단축할 수 있다.
                : 변경에 유리한 유연한 설계가 가능하다.
                : 표준화가 가능하다. - JDBC
                : 서로 관계없는 클래스들을 관계를 맺어줄 수 있다.
        */

        I i = new B();
        i.method();
        
        C c = new C();
        c.method(new B()); // C가 B를 사용(의존)
//        c.method(new E()); c의 method는 B만 받음 E를 매개변수로 넘겨주고 싶을 때 C클래스의 매소드 매개변수도 수정해주어야 함
        
        A a = new A();
        // a의 method()는 I 인터페이스를 구현한 모든 객체를 매개변수로 받기 때문에 직접적인 변경 없이 interface를 상속받게하면 수정작업을 줄일 수 있다.
        a.method(new B());
        a.method(new E());
    }
}

class A {
    public void method(I i) { // 인터페이스를 사용, B와 직접적인 관계가 없어 짐
        i.method();
    }
}

class C {
    public void method(B b) { // 매개변수 B가 변경되면 코드를 다 변경해야 함
        b.method();
    }
}

class E implements I {
    @Override
    public void method() {
        System.out.println("methodInE");
    }
}

class B implements I{
    public void method() {
        System.out.println("methodInB");
    }
}

interface I {
    public void method();
}

