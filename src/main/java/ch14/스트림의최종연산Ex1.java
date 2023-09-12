package ch14;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class 스트림의최종연산Ex1 {
    public static void main(String[] args) {
        /*
            스트림의 최종연산 - forEach(), allMatch(), anyMath(), noneMatch(), findFirst(), findAny()
                            reduce(), collect()

            최종연산은 1번만 할 수 있고 최종연산을 하면 스트림 요소가 소모되고 스트림이 닫힘
        */

        /*
            스트림의 모든 요소에 지정된 작업을 수행
                forEach() - 병렬처리시 순서 보장되지 않음
                forEachOrdered() - 병렬처리시에도 순서 보장됨, 하지만 성능이 조금 느려짐
        */

        IntStream.range(1, 10).parallel().forEach(System.out::print);
        IntStream.range(1, 10).parallel().forEachOrdered(System.out::print);
        System.out.println();

        /*
            조건 검사
                boolean allMatch(Predicate<? super T> predicate) - 모든 요소가 조건을 만족시키면 true
                boolean anyMatch(Predicate<? super T> predicate) - 한 요소라도 조건을 만족시키면 true
                boolean noneMatch(Predicate<? super T> predicate) - 모든 요소가 조건을 만족시키지 않으면 true
        */

        /*
            조건에 일치하는 요소 찾기
                Optional<T> findFirst() - 첫 번째 요소를 반환. 순차 스트림에 사용
                Optional<T> findAny()   - 아무거나 하나를 반환. 병렬 스트림에 사용
        */

        /*
                reduce() - 스트림의 요소를 하나씩 줄여가며 누적연산 수행
                    identity : 초기값
                    accumulator : 이전 연산결과와 스트림의 요소에 수행할 연산
                    combiner : 병렬처리된 결괄르 합치는데 사용할 연산(병렬 스트림)
        */
        int count = IntStream.rangeClosed(1, 10).reduce(0, (a, b) -> a + 1);
        System.out.println("count = " + count);
        int sum = IntStream.rangeClosed(1, 10).reduce(0, (a, b) -> a + b);
        System.out.println("sum = " + sum);

        String[] strArr = {
            "Inheritance", "Java", "Lambda", "stream", "OptionalDouble", "IntStream",
            "count", "sum"
        };

        Stream.of(strArr)
                .parallel() // 병렬 처리
                .forEach(System.out::println);

        boolean noEmptyStr = Stream.of(strArr).noneMatch(s -> s.length() == 3);
        Optional<String> sWord = Stream.of(strArr).parallel()
                .filter(s -> s.charAt(0) == 's').findAny();

        System.out.println("noEmptyStr = " + noEmptyStr);
        System.out.println("sWord = " + sWord.get());

        // Stream<String>을 Stream<Integer>으로 변환. (s) -> s.length()
        Stream<Integer> intStream = Stream.of(strArr).map(String::length);

        // Stream<String>을 IntStream으로 변환. mapToInt 사용 시 IntStream기본형 스트림으로 반환해줌
        IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);

        count = intStream1.reduce(0, (a, b) -> a + 1);
        sum = intStream2.reduce(0, (a, b) -> a + b);

        OptionalInt max = intStream3.reduce(Integer::max);
        OptionalInt min = intStream4.reduce(Integer::min);

        System.out.println("count = " + count);
        System.out.println("sum = " + sum);
        // Optional사용 시 값을 바로 가져오는 get(), getAsInt() 메서드 보다는 orElse(), orElseGet()을 사용해 null을 대비해주는 것이 좋다.
        System.out.println("max = " + max.getAsInt());
        System.out.println("min = " + min.orElse(0));
        System.out.println("min.orElseGet(() -> 0) = " + min.orElseGet(() -> 0));
    }
}
