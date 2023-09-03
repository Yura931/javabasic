package ch11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysEx1 {
    public static void main(String[] args) {
        /*
            Arrays
                : 배열을 다루기 편리한 메서드(static) 제공
        */

        // 배열의 출력
        String[] arr = {"1", "2", "3"};
        Arrays.toString(arr);

        // 배열의 복사
        String[] arrCopy = Arrays.copyOf(arr, arr.length);

        // 배열 채우기
        int[] intArr = new int[5];
        Arrays.fill(intArr, 9);
        System.out.println("intArr = " + Arrays.toString(intArr));
        Arrays.setAll(intArr, (i) -> (int) (Math.random() * 5) + 1);

        for(int i : intArr) {
            char[] graph = new char[i];
            Arrays.fill(graph, '*');
            System.out.println(new String(graph) + i);  // char[] -> String 변환
        }

        // 배열의 정렬과 검색
        int[] intArr2 = {3, 2, 0, 1, 4};
        int idx = Arrays.binarySearch(intArr2, 2);  // idx= -5 -> 잘못된 결과
        System.out.println("idx = " + idx);
        // binarySearch() -> 이진탐색 => 정렬된 배열에만 사용이 가능하다.
        Arrays.sort(intArr2);
        System.out.println(Arrays.toString(intArr2));
        idx = Arrays.binarySearch(intArr2, 4);
        System.out.println("idx = " + idx);

        // 다차원 배열의 출력 - deepToString()

        // 다차원 배열의 비교 - deepEquals()

        // 배열을 List로 변환 - asList(object... a) 가변 매개변수
        List list = Arrays.asList(new Integer[]{1, 2, 3, 4, 5});
        list = Arrays.asList(1, 2, 3, 4, 5); // 읽기 전용
//        list.add(6);  읽기 전용이기 때문에 UnsupportedOperationException 예외 발생
        list = new ArrayList(Arrays.asList(1, 2, 3, 4, 5)); // 새로운 ArrayList 생성 후 add() 할 수 있음


        /*
            순차 검색과 이진 검색
            이진 검색 -> 정렬을 해야함, 정렬에 대한 고민 필요..
        */

    }
}
