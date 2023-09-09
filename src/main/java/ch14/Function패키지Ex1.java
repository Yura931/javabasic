package ch14;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class Function패키지Ex1 {
    public static void main(String[] args) {
        /*
            java.util.function패키지
                : 자주 사용되는 다양한 함수형 인터페이스를 제공
        */

        Predicate<String> isEmptyStr = s -> s.length() == 0;
        String s = "";

        if (isEmptyStr.test(s)) {
            System.out.println("This is an empty String.");
        }

        Supplier<Integer> randomMath = () -> (int) (Math.random() * 100) + 1;
        System.out.println("randomMath = " + randomMath.get());


    }
}
