package ch14;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class 함수형인터페이스Ex1 {
    public static void main(String[] args) {
        /*
            함수형 인터페이스(람다식을 다루기 위해서 사용)
                : 단 하나의 추상 메서드만 선언된 인터페이스
        */

        MyFunction f = new MyFunction() {   // 익명 클래스, 클래스의 선언, 객체 생성 동시에
            @Override
            public int max(int a, int b) {
                return a > b ? a : b;
            }
        };

        int value = f.max(3, 5);
        System.out.println("value = " + value);
        
        // 함수형 인터페이스 타입의 참조변수로 람다식을 차몾할 수 있다.
        // (단, 함수형 인터페이스의 메서드와 람다식의 매개변수 개수와 반환타입이 일치해야 함.)
        MyFunction f2 = (a, b) -> a > b ? a : b;
        int value2 = f2.max(10, 30);    // 실제로는 람다식(익명함수)이 호출 됨
        System.out.println("value2 = " + value2);


        MyFunction2 mf = () -> System.out.println("myMethod()");
        aMethod(mf);
        aMethod(() -> System.out.println("myMethod()"));    // 매개변수로 람다식을 넘기고 호출

        MyFunction2 mf2 = () -> System.out.println("myFunction2 myMethod()");
        mf2.myMethod();


        List<String> list = Arrays.asList("abc", "aaa", "bbb", "ddd", "aaa");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        List<String> list2 = list;
        Collections.sort(list2, (s1, s2) -> s2.compareTo(s1));

    }

    static void aMethod(MyFunction2 f) {
        f.myMethod();
    }
    
    // 함수형 인터페이스 타입의 반환타입
    static MyFunction2 myMethod() {
        return () -> System.out.println("MyFunction2 myMethod()");
    }
}

@FunctionalInterface    // 함수형 인터페이스는 단 하나의 추상 메서드만 가져야 함. 애너테이션 붙여주면 컴파일러가 체크 해 줌
interface MyFunction {
    //    public abstract int max(int a, int b);    public abstract 생략 가능
    int max(int a, int b);
}

@FunctionalInterface
interface MyFunction2 {
    void myMethod();
}