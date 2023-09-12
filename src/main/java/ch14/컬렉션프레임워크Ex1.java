package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class 컬렉션프레임워크Ex1 {
    public static void main(String[] args) {
        /*
            함수형 인터페이스를 사용하는 컬렉션 프레임워크의 메서드
            람다식 사용과 함께 컬렉션 프레임워크 코드 간결해짐

            Error = more code...
        */

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        // list의 모든 요소를 출력
        list.forEach(i -> System.out.print(i + ","));
        System.out.println();

        // list에서 2또는 3의 배수를 제거한다.
        list.removeIf(x -> x % 2 == 0 || x % 3 == 0);
        System.out.println(list);

        // list의 각 요소에 10을 곱한다.
        list.replaceAll(i -> i * 10);
        System.out.println(list);

        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");

        // map의 모든 요소를 {k,v}의 형식으로 출력한다.
        map.forEach((k, v) -> System.out.print("{" + k + "," + v + "},"));
        System.out.println();

    }
}
