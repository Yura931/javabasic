package ch14;

import java.io.File;
import java.util.Arrays;
import java.util.stream.Stream;

public class 스트림의연산Ex1 {
    public static void main(String[] args) {
        /*
            스트림의 연산
            스트림이 제공하는 기능 - 중간 연산과 최종 연산

            중간 연산
            distinct() : 중복을 제거
            filter(Predicate<T> predicate) : 조건에 안 맞는 요소 제외
            limit(long maxSize) : 스트림의 일부를 잘라낸다.
            skip(long n) : 스트림의 일부를  건너뛴다.
            peek<Consumer<T> action) : 스트림의 요소에 작업수행
            sorted() : 스트림 요소의 기본 정렬
            sorted(Comparator<T> comparator) : 정렬 기준을 매개변수로 받음

            map : 스트림의 요소를 변환
            flatMap : 스트림의 스트림을 스트림으로 변환

            최종 연산

            forEach(Consumer<? super T> action) : 각 요소에 지정된 작업 수행
            forEachOrdered(Consumer<? super T> action) : 병렬스트림의 경우 순서유지해서 작업

            count() : 스트림의 요소의 개수 반환

            max(Comparator<? super T> comparator) : 스트림의 최대값 반환
            min(Comparator<? super T> comparator) : 스트림의 최소값 반환

            findAny() : 스트림의 요소중 아무거나 하나 반환
            findFirst() : 스트림의 요소 중 첫 번째 요소 하나 반환

            allMatch(Predicate<T> p) : 모두 만족하는지
            anyMatch(Predicate<T> p) : 하나라도 만족하는지
            noneMatch(Predicate<T> p) : 모두 만족하지 않는지

            reduce & collect가 핵심
            reduce() : 스트림의 요소를 하나씩 줄여가면서(리듀싱) 계산한다.
            collect() : 스트림의 요소를 수집한다. 주로 요소를 그룹화하거나 분할한 결과를 컬렉션에 담아 반환하는데 사용된다.
        */

        File[] fileArr = { new File("Ex1.java"), new File("Ex1.bak"), new File("Ex2.java")
            , new File("Ex1"), new File("Ex1.txt")
        };

        Stream<File> fileStream = Stream.of(fileArr);

        Stream<String> filenameStream = fileStream.map(File::getName);
        filenameStream.forEach(System.out::println);

        fileStream = Stream.of(fileArr);

        fileStream.map(File::getName)
                .filter(s -> s.indexOf('.') != -1)
                .peek(s -> System.out.printf("filename=%s%n", s))
                .map(s -> s.substring(s.indexOf('.') + 1))
                .peek(s -> System.out.printf("extension=%s%n", s))
                .map(String::toUpperCase)
                .distinct()
                .forEach(System.out::println);

        System.out.println();

        Stream<String[]> strArrStrm = Stream.of(
                new String[] {"abc", "def", "ghi"},
                new String[]{"ABC", "GHI", "JKL"}
                );

        Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);

        strStrm
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        System.out.println();

        String[] lineArr = {
            "Believe or not It is true",
                "Do or do not There is no try",
        };

        Stream<String> lineStream = Arrays.stream(lineArr);

        lineStream.flatMap(line -> Stream.of(line.split(" +")))
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println();

    }
}
