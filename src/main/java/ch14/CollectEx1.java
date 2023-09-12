package ch14;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectEx1 {
    public static void main(String[] args) {
        /*
            collect()와 Collectors
                : collect()는 Collector를 매개변수로 하는 스트림의 최종연산


            reduce() : 스트림 전체에 대해서 리듀싱
            collect() : 그룹별 노나서 리듀싱

            Collector는 수집(collect)에 필요한 메서드를 정의해 놓은 인터페이스
                구현된 클래스가 있기 때문에 직접 구현할 일은 거의 없음
                Collectors클래스를 잘 사용하자

            Collectors클래스는 다양한 기능의 컬렉터(Collector를 구현한 클래스)를 제공
        */

        /*
            스트림을 컬렉션으로 변환 - toList(), toSet(), toMap(), toCollection()
        */

        /*
            스트림을 배열로 변환 - toArray()
            Student[] stuNames = studentStream.toArray(Student[]::new); -> 변환하고자 하는 타입을 매개변수로 넘겨서 만드는 방법 권장
            Object[] stuNames = studentStream.toArray(); //
       */

        Stream<Integer> intStream1 = Arrays.asList(1,2,3,4,5).stream();
        Integer[] intArray = intStream1.toArray((i) -> new Integer[i]);
        System.out.println("intArray = " + Arrays.toString(intArray));

        /*
            스트림의 통계 - counting(), summingInt(), maxBy(), minBy(), ...
        */


        /*
            스트림을 리듀싱 - Collectors.reducing() : 그룹별 리듀싱
        */

        IntStream intStream = new Random().ints(1, 46).distinct().limit(6);
        IntStream intStream2 = new Random().ints(1, 46).distinct().limit(6);

        OptionalInt max = intStream.reduce(Integer::max);
        Optional<Integer> max2 = intStream2.boxed().collect(Collectors.reducing(Integer::max));

        System.out.println("max2 = " + max2);

        /*
            문자열 스트림의 요소를 모두 연결 - joining()
        */
    }
}

