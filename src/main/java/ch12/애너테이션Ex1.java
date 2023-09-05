package ch12;

import java.util.ArrayList;
import java.util.Date;

public class 애너테이션Ex1 {
    public static void main(String[] args) {
        /*
            애너테이션
                : 주석처럼 프로그래밍 언어에 영향을 미치지 않으며, 유용한 정보를 제공
                : 문서와 소스코드를 합쳐서 하나로!

                소스 코드와 문서 버전의 불일치 합치는 작업

                javadoc.exe
                내용을 읽어서 문서를 따로 추출

                XML -> 애너테이션
                설정에 대한 부분을 애너테이션을 달아서 사용
                각자 필요한 설정정보를 애너테이션을 사용해서 만들 수 있음
        */


        /*
            @Override
                : 오버라이딩을 올바르게 했는지 컴파일러가 체크하게 한다.
                : 오버라이딩할 때 메서드이름을 잘못적는 실수를 하는 경우가 많다.

            @Deprecated
                : 앞으로 사용하지 않을 것을 권장하는 필드나 메서드에 붙인다.
                : @Deprecated의 사용 예, Date클래스의 getDate()

            @FunctionalInterface
                : 함수형 인터페이스에 붙이면, 컴파일러가 올바르게 작성했는지 체크
                : 함수형 인터페이스에는 하나의 추상메서드만 가져야 한다는 제약이 있음

            @SupperessWarnings
                : 컴파일러의 경고메시지가 나타나지 않게 억제한다.
                : 괄호()안에 억제하고자하는 경고의 종류를 문자열로 지정
                : 둘 이상의 경고 동시에 억제
                    @SupperessWarnings({ "deprecation", "unchecked", "varargs" })
        */

        Date date = new Date();
        date.getDate(); // @Deprecated 애너테이션이 붙어있는 메서드, 컴파일하면 에러는 deprecated API~~ 경고 메세지를 남겨 줌

        Child child = new Child();
        child.parentMethod();
    }
}

@FunctionalInterface // 함수형 인터페이스는 하나의 추상 메서드만 가능
interface Testable {
    void test();
}

class Parent {
    void parentMethod() {}
}

class Child extends Parent {

    @Override
    @Deprecated
    void parentMethod() {}
}

