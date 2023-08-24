package ch05;

import java.util.Arrays;

public class 배열Ex3 {
    public static void main(String[] args) {
        int sum = 0;
        float average = 0f;

        int[] score = {100, 88, 100, 100, 90};

        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }

        average = sum / (float) score.length; // 계산결과를 float으로 형변환

        System.out.println("총점: " + sum);
        System.out.println("평균: " + average);

        // 배열 최소, 최대 값 찾기
        int[] score2 = {79, 88, 91, 33, 100, 55, 95};

        int max = score2[0];
        int min = score2[0];

        for (int i = 1; i < score2.length; i++) { // 배열의 두 번째 요소부터 읽기 위해 변수 i의 값을 1로 초기화
            if(score2[i] > max) {
                max = score2[i];
            } else if(score2[i] < min) {
                min = score2[i];
            }
        }

        System.out.println("최대값 :" + max);
        System.out.println("최소값 :" + min);

        // 배열의 요소 섞기
        int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(numArr));

        for (int i = 0; i < 10; i++) {
            int n = (int) (Math.random() * numArr.length - 1); // 랜덤한 인덱스
            int tmp = numArr[i]; // i번지 값을 tmp에 담아둠
            numArr[i] = numArr[n]; // n번지 값을 i번지에 옮김
            numArr[n] = tmp; // n번지에  i번지 값을 담아두었던 tmp값을 담아줌
            System.out.println("tmp = " + tmp);
            System.out.println("numArr[" + i + "] = " + numArr[i]);
            System.out.println("numArr[" + n + "] = " + numArr[n]);
            System.out.println(Arrays.toString(numArr));
        }

        System.out.println(Arrays.toString(numArr));

        // 로또번호
        int[] ball = new int[45]; // 길이가 45인 int타입 배열 선언

        for (int i = 0; i < ball.length; i++) {
            ball[i] = i + 1; // 값 할당
        }

        int tmp = 0; // 두 값을 바꾸는데 사용할 변수
        int j = 0;   // 임의의 값을 얻어서 저장할 변수
        
        // 배열의 i번째 요소와 임의의 요소에 저장된 값ㅇ르 서로 바꿔서 값을 섞음
        for (int i = 0; i < 6; i++) {
            j = (int)(Math.random() * ball.length - 1);
            tmp = ball[i];
            ball[i] = ball[j];
            ball[j] = tmp;
        }
        
        // 배열 ball의 앞에서 부터 6개의 요소를 출력
        for (int i = 0; i < 6; i++) {
            System.out.printf("ball[%d]=%d%n", i, ball[i]);
        }
    }
}
