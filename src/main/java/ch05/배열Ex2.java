package ch05;

import java.util.Arrays;

public class 배열Ex2 {
    public static void main(String[] args) {
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = {100, 95, 80, 70, 60}; // 선언과 초기화
        char[] chArr = {'a', 'b', 'c', 'd'};

        for (int i = 0; i < iArr1.length; i++) {
            iArr1[i] = i + 1;
        }

        for (int i = 0; i < iArr2.length; i++) {
            iArr2[i] = (int) (Math.random() * 10) + 1;
        }


        for (int i = 0; i < iArr1.length; i++) {
            System.out.print(iArr1[i]+",");
        }
        System.out.println();
        
        // 배열의 값 문자열로 출력
        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(iArr3));
        System.out.println(Arrays.toString(chArr));

        // 배열의 참조주소 값 출력
        System.out.println(iArr1);
        System.out.println(iArr2);
        System.out.println(iArr3);
        
        // 캐릭터 타입의 경우 예외로 값이 그대로 출력
        System.out.println(chArr); 
    }
}
