package ch07;

public class 제어자Ex1 {
    public static void main(String[] args) {
        /*
            제어자(modifier)
                : 클래스와 클래스의 멤버(멤버 변수, 메서드)에 부가적인 의미 부여

                접근제어자 : public, protected, (default), private
                그 외 : static, final, abstract, native, transient, synchronized, volatile, strictfp

                : 하나의 대상에 여러 제어자를 같이 사용가능(접근 제어자는 하나만)

            static - 클래스의, 공통적인
                멤버변수 : 모든 인스턴스에 공통적으로 사용되는 클래스 변수가 된다.
                        : 클래스 변수는 인스턴스를 생성하지 않고도 사용 가능하다.
                        : 클래스가 메모리에 로드될 때 생성된다.
                메서드 : 인스턴스를 생성하지 않고도 호출이 가능한 static 메서드가 된다.
                      : static 메서드 내에서는 인스턴스멤버들을 직접 사용할 수 없다.

            final - 마지막의, 변경될 수 없는
                클래스 : 변경될 수 없는 클래스, 확장될 수 없는 클래스가 된다. String(보안), Math(static 메서드 집합, 굳이 상속받아 쓸 일 없음)
                        그래서 final로 지정된 클래스는 다른 클래스의 조상이 될 수 없다.
                메서드 : 변경될 수 없는 메서드, final로 지정된 메서드는 오버라이딩을 통해 재정의 될 수 없다.
                멤버변수&지역변수 : 변수 앞에 final이 붙으면, 값을 변경할 수 없는 상수가 된다.

            abstract - 추상의, 미완성의
                클래스 : 클래스 내에 추상 메서드가 선언되어 있음을 의미한다.
                메서드 : 선언부만 작성하고 구현부는 작성하지 않은 추상 메서드임을 알린다.
        */
    }
}

final class FinalTest {             // 조상이 될 수 없는 클래스, 상속계층도의 제일 마지막, 자식이 없는 클래스
    final int MAX_SIZE = 10;        // 값을 변경할 수 없는 멤버변수(상수)

    final int getMaxSize() {        // 오버라이딩 할 수 없는 메서드(변경불가)
        final int LV = MAX_SIZE;    // 값을 변경할 수 없는 지역변수(상수)
        return MAX_SIZE;
    }
}

abstract class AbstractTest {   // 추상 클래스(추상 메서드를 포함한 클래스, 미완성 클래스, 미완성 설계도, 추상 클래스의 인스턴스 생성불가(객체를 만들 수 없음))
    abstract void move();       // 추상 메서드(구현부가 없는 메서드, 미완성 메서드, 선언부만 있고 구현부는 없음)
}

class AbstractClass extends AbstractTest {
    @Override
    void move() {
      // 추상클래스를 상속받아서 완전한클래스를 만든 후에 객체생성 가능, 완성된 설계도(구상 클래스)
    }
}