package ch12;

import java.util.ArrayList;

public class GenericsEx1 {
    public static void main(String[] args) {
        /*
            Generics
                : 컴파일시 타입을 체크해 주는 기능(compile-time type check) - JDK1.5
                : 객체의 타입 안정성을 높이고 형변환의 번거로움을 줄여줌

                장점
                    - 타입 안정성을 제공
                    - 타입체크와 형변환을 생략할 수 있으므로 코드가 간결해 짐
        */

        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add("30");

        Integer i = (Integer) list.get(2); // 컴파일 OK, 컴파일러의 한계, ClassCastException 발생
                                            // 실행시 발생에러보다는 컴파일타임 에러가 훨씬 안전
                                            // 런타임에러를 어떻게 컴파일타임 에러로 끌어올 수 있을까?

        ArrayList<Integer> intList = new ArrayList<Integer>();  // 저장할 타입 지정, Generics 도입 JDK1.5 이후! 타입을 함께 사용해주는 방식 권장
                                                                // 기존 ArrayList 일반 클래스에서 ArrayList<E> 제네릭 클래스로 변경 됨
        intList.add(10);
        intList.add(20);
        intList.add(30);
//        intList.add("30");    컴파일러가 체크 해 줌, 타입체크가 강화됨.
        i = intList.get(2);

        System.out.println(list);

        /*
            코드 작성시 최대한 RuntimeException을 줄이는 방향으로 해야한다.
                - String의 경우 빈문자열로 초기화
                - 배열의 경우 길이가 0인 배열로 초기화
                - 등 최대한 신경 써 주어야 함
                - 안전한 코드!
        */
    }
}


