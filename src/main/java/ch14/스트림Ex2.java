package ch14;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class 스트림Ex2 {
    public static void main(String[] args) {
        /*
            스트림 만들기 - 컬렉션
            Collection인터페이스의 stream()으로 컬렉션을 스트림으로 변환
        */

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> intStream = list.stream();

        intStream.forEach(System.out::print);   // 12345
        System.out.println();

        /*
            객체 배열로부터 스트림 생성하기
        */
        Stream<String> strStream = Stream.of("a", "b", "c"); // 가변 인자
        Stream<String> strStream2 = Stream.of(new String[]{"a", "b", "c"});
        Stream<String> strStream3 = Arrays.stream(new String[]{"a", "b", "c"});
        Stream<String> strStream4 = Arrays.stream(new String[]{"a", "b", "c"}, 0, 3);

        /*
            기본형 배열로부터 스트림 생성하기
            제네릭을 사용하지 않고 기본형 스트림을 사용하면 객체가 아닌 기본형을 다루는 메서드를 제공해주기 때문에 조금 더 유용하게 사용할 수 있다.
            IntStream의 경우 sum(), average() 등 연산관련 메서드 제공
            속도도 향상!
        */

        IntStream intStream1 = IntStream.of(1, 2, 3, 4, 5);
        IntStream intStream2 = IntStream.of(new int[]{1, 2, 3, 4, 5});
        IntStream intStream3 = Arrays.stream(new int[]{1, 2, 3, 4, 5});
        IntStream intStream4 = Arrays.stream(new int[]{1, 2, 3, 4, 5}, 0, 3);

        System.out.println(intStream3.count());

        /*
            임의의 수
            ints(), longs(), doubles() // 무한 스트림 생성
            Random()클래스에 정의되어 있음

            * 지정된 범위의 난수를 요소로 갖는 스트림을 생성하는 메서드
            // 무한 스트림
            IntStream ints(int begin, int end)
            LongStream longs(long begin, long end)
            DoubleStream doubles(double begin, double end)

            // 유한 스트림
            IntStream ints(long streamSize, int begin, int end)
            LongStream longs(long streamSize, long begin, long end)
            DoubleStream doubles(long streamSize, double begin, double end)
        */

        IntStream intStream5 = new Random().ints();
        //intStream5.limit(5).forEach(System.out::println); // 무한 스트림이기 때문에 limit()을 사용해 제한을 걸어준다.
        IntStream intStream6 = new Random().ints(5);    // 크기가 5인 난수 스트림을 반환
        intStream6.forEach(System.out::println);

        /*
            특정 범위의 정수를 요소로 갖는 스트림 생성(intStream, LongStream)
        */

        IntStream intStreamRange = IntStream.range(1, 5);   // 1, 2, 3, 4
        IntStream intStreamRangeClosed = IntStream.rangeClosed(1, 5); // 1, 2, 3, 4, 5 두번째 매개변수까지 포함

        /*
            람다식을 소스로 하는 스트림 생성
                : iterate() - 이전 요소에 종속적
                : generate() - 이전 요소에 독립적
        */
        Stream<Integer> evenStream = Stream.iterate(0, n -> n + 2); // 이전 요소를 seed로 해서 다음 요소를 계산
        Stream<Integer> evenStream2 = Stream.iterate(0, n->n+2).filter(f -> f < 10);


        Stream<Double> randomStream = Stream.generate(Math::random);    // generate()는 seed를 사용하지 않음
        Stream<Integer> oneStream = Stream.generate(() -> 1);
        
        Stream emptyStream = Stream.empty(); // 비어있는 스트림
        emptyStream.count();
    }
}
