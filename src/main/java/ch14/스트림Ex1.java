package ch14;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class 스트림Ex1 {
    public static void main(String[] args) {
        /*
            스트림(Stream) - 데이터의 연속적인 흐름
                : 다양한 데이터소스(컬렉션, 배열)를 표준화된 방법으로 다루기 위한 것
                : 데이터소스가 가지고 있는 데이터들이 스트림을 통해서 연속적으로 하나씩하나씩 전달되어서 중간작업, 최종작업을 할 수 있음

            CF - List, Set, Map의 사용방법이 다 달랐음
            JDK 1.8에서 Stream이 나오면서 정말 표준화 됨

            컬렉션, 배열 로부터 Stream을 만들 수 있음

            Stream을 만든 후 부터는 똑같은 방법으로 작업을 할 수 있게 됨
            Stream -> 중간연산(n번) -> 최종연산(1번) -> 결과
        */

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> intStream = list.stream();
        Stream<String> strStream = Stream.of(new String[]{"a", "b", "c"});
        Stream<Integer> evenStream = Stream.iterate(0, n -> n + 2);
        Stream<Double> randomStream = Stream.generate(Math::random);
        IntStream intStream2 = new Random().ints(5);

        /*
            스트림이 제공하는 기능 - 중간 연산과 최종 연산
                : 중간 연산 - 연산결과가 스트림인 연산. 반복적으로 적용가능
                : 최종 연산 - 연산결과가 스트림이 아닌 연산. 단 한번만 적용가능(스트림의 요소를 소모)
        */

        intStream.distinct().limit(4).sorted().forEach(System.out::println); // 여기에서 intStream 최종연산, 이후 intStream은 다시 사용 불가

        /*
            스트림은 데이터 소스로부터 데이터를읽기만할 뿐 변경하지 않는다.
           스트림은 Iterator처럼 일회용이다.(필요하면 다시 스트림을 생성해야 함)
        */

        List<Integer> sortedList = list.stream().distinct().limit(4).sorted().collect(Collectors.toList()); // list.stream()으로 스트림 다시 생성
        System.out.println("list = " + list);
        System.out.println("sortedList = " + sortedList);

        /*
            최종 연산 전까지 중간연산이 수행되지 않는다. - 지연된 연산
        */
        IntStream intStream3 = new Random().ints(1, 46);
        intStream3.distinct().limit(6).sorted().forEach(i -> System.out.print(i + ","));    // 중간 연산 어떤작업을 해야하는지 표시만 해둔 후 나중에 처리
        System.out.println();
        /*
            스트림은 작업을 내부 반복으로 처리한다.
        */
        strStream.forEach(System.out::print); // forEach메서드 안에 for문을 넣음
        
        /*
            스트림의 작업을 병렬로 처리 - 병렬스트림 / 멀티쓰레드로 처리
            FP - 빅데이터 처리를 위해 탄생, 한번에 여러 작업 
        */

        Stream<String> strStream2 = Stream.of("dd", "aaa", "cc", "CC", "b");
        int sum = strStream2.parallel() // 병렬 스트림으로 전환(속성만 변경)
                .mapToInt(s -> s.length()).sum(); // 모든 문자열의 길이의 합

        /*
            기본형 스트림 - IntStream, LongStream, DoubleStream
                : 오토박싱&언박싱의 비효율이 제거됨(Stream<Integer>대신 IntStream사용
                : 숫자와 관련된 유용한 메서드를 Stream<T>보다 더 많이 제공
                : 데이터소스가 기본형 일 때! 사용해라 성능 상승
        */
    }
}
