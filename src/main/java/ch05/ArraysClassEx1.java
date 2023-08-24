package ch05;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysClassEx1 {
    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 3, 4};
        int[][] arr2D = {{11, 12}, {21, 22}};
        
        // 배열 출력
        System.out.println(Arrays.toString(arr)); // 1차원배열
        System.out.println(Arrays.deepToString(arr2D)); // 2차원, 다차원 배열

        String[][] str2D = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};
        String[][] str2D2 = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};

        // 편리하게 두 배열 비교 가능
        System.out.println(Arrays.equals(str2D, str2D2)); // 1차원 배열비교
        System.out.println(Arrays.deepEquals(str2D, str2D2)); // 2차원, 다차원 배열비교
        
        // 배열 복사
        int[] ar = {0, 1, 2, 3, 4};
        int[] ar2 = Arrays.copyOf(ar, ar.length); // 두번째 인자 : 복사할 요소의 갯수
        int[] ar3 = Arrays.copyOf(ar, 3);
        int[] ar4 = Arrays.copyOf(ar, 7); // 복사하는 배열의 길이보다 갯수가 큰 경우 남은 자리는 타입 기본값으로 초기화되어 들어감
        int[] ar5 = Arrays.copyOfRange(ar, 2, 4); // from ~ to / index가 2부터 4까지 : 4는 불포함
        int[] ar6 = Arrays.copyOfRange(ar, 0, 7); // 기본 배열보다 넘어가는 자리는 0으로 초기화
        
        // 정렬
        int[] sortArr = {3, 2, 0, 1, 4};
        Arrays.sort(sortArr); // 오름차순 정렬
        System.out.println(Arrays.toString(sortArr));
    }
}
