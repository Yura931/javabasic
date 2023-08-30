package ch07;

public class 인터페이스Ex3 {
    public static void main(String[] args) {
        /*
            인터페이스에 디폴트 메서드, static메서드 추가 가능.(JDK1.8부터) 부가적인 사항
            인터페이스에 새로운 메서드(추상 메서드)를 추가하기 어려움.

            해결책 => 디폴트 메서드(default method)
            디폴트 메서드는 인스턴스 메서드(인터페이스 원칙 위반)
            기존에 사용되던 인터페이스에 새로운 추상메서드를 추가하면 이 인터페이스를 구현한 클래스들이 추상메서드를 다 구현해야 하기 때문에 예외사항을 만들어 준 것..
            몸통이 있는 default method가 생김에 따른 충돌
                : 여러 인터페이스의 디폴트 메서드 간의 충돌
                    - 인터페이스를 구현한 클래스에서 디폴트 메서드를 오버라이딩해야 한다.
                : 디폴트 메서드와 조상 클래스의 메서드 간의 충돌
                    - 조상 클래스의 메서드가 상속되고, 디폴트 메서드는 무시된다.
        */
    }
}

interface MyInterface {
    void method();
        default void newMethod() {} // default method
}
