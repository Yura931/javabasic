package ch14;

import java.util.Optional;
import java.util.OptionalInt;

public class OptionalEx1 {
    public static void main(String[] args) {
        /*
            Optional<T>
                : T 타입 객체의 래퍼클래스 - Optional<T>
                모든 타입의 객체 저장

                null을 직접다루는 것은 위험
                간접적으로 null을 다룸

                null을 Optional 객체에 담는 것
                결과가 null이더라도 객체의 주소값이 있기 때문에 null이 아님

                NullPointException 발생을 없앨 수 있고
                if문을 통해 null체크하는 코드들이 간결해 짐

                Null 최소화!! 중요
        */

        Optional<String> optional = Optional.ofNullable(null);
        System.out.println("optional = " + optional);

        /*
            Optional<T>객체 생성하기
        */

        String str = "abc";
        Optional<String> optVal = Optional.of(str);
        Optional<String> optVal2 = Optional.of("abc");
//        Optional<String> optVal3 = Optional.of(null);   // NullPointerException발생
        Optional<String> optVal4 = Optional.ofNullable(null);   // 이 메서드만 Null저장 가능

        /*
            null대신 빈 Optional<T> 객체를 사용
        */

        Optional<String> optVal5 = null; // 널로 초기화 바람직하지 않음
        Optional<String> optVal6 = Optional.<String>empty(); // 빈 객체로 초기화


        String str1 = optVal.get(); // optVal에 저장된 값을 반환. null이면 예외 발생
        String str2 = optVal.orElse(""); // optVal에 저장된 값이 null일 때는, ""를 반환
        String str3 = optVal.orElseGet(String::new); // 람다식 사용가능 () -> new String()
        String str4 = optVal.orElseThrow(NullPointerException::new); // 널이면 예외 발생


        System.out.println("str3 = " + str3);

        /*
            OptionalInt, OptionalLong, OptionalDouble
                : 기본형 값을 감싸는 래퍼클래스 (성능을 위해 사용)
        */

        /*
            빈 Optional객체와의 비교
            isPresent()
        */

        // of(0)초기화, empty() 둘 다 0이 저장되지만 isPresent()를 통해 객체에 값이 있는지 없는지 알 수 있다.
        OptionalInt opt = OptionalInt.of(0); // 0을 저장
        OptionalInt opt2 = OptionalInt.empty(); // 빈 객체를 생성

        System.out.println("opt.isPresent() = " + opt.isPresent()); // true
        System.out.println("opt2.isPresent() = " + opt2.isPresent());   // false
        System.out.println("opt.equals(opt2) = " + opt.equals(opt2));   // falase
    }
}
