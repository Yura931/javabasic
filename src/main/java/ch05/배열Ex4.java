package ch05;

import java.util.Arrays;

public class 배열Ex4 {
    public static void main(String[] args) {
        /*
            String배열의 선언과 생성
                : String은 참조형 / 배열 선언 시 참조형의 기본값이 null로 초기화 됨
        */

        // index: 0~3
        String[] strArr = {"가위", "바위", "보"};

        for (int i = 0; i < 10; i++) {
            int tmp = (int) (Math.random() * strArr.length);
            System.out.println(strArr[tmp]);
        }
        System.out.println(Arrays.toString(strArr));
    }
}
