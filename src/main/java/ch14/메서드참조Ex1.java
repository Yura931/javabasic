package ch14;

import java.util.function.Function; // 자바에서 제공하는 함수형 인터페이스
import java.util.function.Supplier;

public class 메서드참조Ex1 {
    public static void main(String[] args) {
        /*
            하나의 메서드만 호출하는 람다식은 '메서드 참조'로 간단히 할 수 있다.
            클래스이름::메서드이름
        */

        //      입력      출력
        Function<String, Integer> f = (String s) -> Integer.parseInt(s);
        Function<String, Integer> f2 = Integer::parseInt; // 함수형 인터페이스에 정보(입력, 출력)가 다 있기 때문에 더 축약 가능
        System.out.println(f2.apply("10"));

        /*
            생성자와 메서드 참조
        */
        // Supplier 입력X, 출력O
        Supplier<MyClass> s = () -> new MyClass();
        Supplier<MyClass> s2 = MyClass::new;

        System.out.println("s = " + s.get());
        System.out.println("s2 = " + s2.get());


        // 객체 생성 시 매개값이 있는 경우
        Function<Integer, MyClass> f3 = (i) -> new MyClass(i);
        Function<Integer, MyClass> f4 = MyClass::new;

        MyClass mc = f4.apply(100);
        System.out.println("mc = " + mc.iv);


        /*
            배열과 메서드 참조
        */
        Function<Integer, int[]> f5 = x -> new int[x];
        Function<Integer, int[]> f6 = int[]::new;
        int[] intArray = f6.apply(10);

        System.out.println("intArray.length = " + intArray.length);
    }
}

class MyClass {
    int iv;
    public MyClass() {}
    public MyClass(Integer iv) {
        this.iv = iv;
    }
}
