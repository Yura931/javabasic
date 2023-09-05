package ch12;

import java.util.ArrayList;

public class 와일드카드Ex1 {
    public static void main(String[] args) {
        /*
            와일드 카드 <?>
            - 하나의 참조 변수로 대입된 타입이 다른 객체를 참조 가능
            <? extends T> 와일드 카드의 상한 제한. T와 그 자손들만 가능
            <? super T> 와일드 카드의 하한 제한. T와 그 조상들만 가능
            <?> 제한 없음. 모든 타입이 가능. <? extends Object>와 동일
            - 메서드의 매개변수에 와일드 카드를 사용

            제네릭 메서드
            - 메서드를 호출할 때마다 타입을 대입(대부분 생략 가능)
            - 메서드를 호출할 때 타입을 생략하지 않을 때는 클래스 이름 생략 불가

            제네릭 타입의 형변환
            - 제네릭 타입과 원시 타입 간의 형변환은 바람직 하지 않다.(경고 발생)
            - 와일드 카드가 사용된 제네릭 타입으로는 형변환 가능

            제네릭 타입의 제거
            - 컴파일러는 제네릭 타입을 제거하고, 필요한 곳에 형변환을 넣음 -> 하위호완을 위해, JDK1.5버전 이하와 문제가 없도록 하기위해, 안정성
                1. 제네릭 타입의 경계(bound)를 제거
                2. 제네릭 타입 제거 후에 타입이 불일치하면, 형변환을 추가
                3. 와일드 카드가 포함된 경우, 적절한 타입으로 형변환 추가

        */
        ArrayList<? extends Product> list = new ArrayList<Tv>();
        ArrayList<? extends Product> list2 = new ArrayList<Audio>();
    }
}
