package ch05;

import java.util.Arrays;

public class 배열Ex1 {
    public static void main(String[] args) {
        /*
            배열은 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
            저장공간이 연속적
            배열의 선언 - 배열을 다루기 위한 참조변수의 선언

            배열이름.length - 배열의 길이(int형 상수) / 변경에 유리한 코드 / 인덱스 범위 벗어난 에러 방지
            : 배열은 한번 생성하면 실행 동안 그 길이를 바꿀 수 없음
            : 왜 ? 메모리 공간  int * 5 = 20byte / 20byte 공간을 찾아서 사용 / 만약 길이를 늘렸을 경우 연속된 공간을 찾아야 하는데 공간이 비어있다는 보장이 없음, 길이 변경하고 싶은 경우 배열을 새로 만들어 기존 내용 복사해서 사용
            :

            배열의 초기화
                : 배열의 각 요소에 처음으로 값을 저장하는 것
                : 기본적으로 자동 초기화 해 줌 (int의 경우 0으로 초기화)
        */

        // 배열의 선언과 생성(저장공간)
        int[] score;        // int타입의 배열을 다루기 위한 참조변수 score선언 / 배열을 선언(배열을 다루기 위한 참조변수 선언)
        score = new int[5]; // int타입의 값 5개를 저장할 수 있는 배열 생성 / 배열을 생성(실제 저장공간을 생성) / 저장공간에 인덱스 자동으로 붙음(0부터)

        // 배열의 인덱스 - 각 요소(저장공간)에 자동으로 붙는 일련번호
        // 저장공간 하나 - 배열의 요소

        score[3] = 100;
        int value = score[3]; // 배열 score의 4번째 요소의 값을 읽어서 value에 저장
        for (int i = 0; i < score.length; i++) {
            System.out.println("score[" + i + "]=" + score[i]);
        }

        int[] score2 = {50, 60, 70, 80, 90}; // 선언과 초기화를 함께 / 이 방식은 두줄로 나눠 쓸 수 없음 new int[] 사용 x
        // 배열을 가리키는 참조변수 score2의 값을 출력
        System.out.println("score2 = " + score2); // [I@16d3585와 같은 형식의 문자열이 출력됨 // 예외로 캐릭터 배열의 경우 저장된 문자가 출력 됨
        for (int i = 0; i < score2.length; i++) {
            System.out.println(score2[i]); // 배열의 요소를 순서대로 하나씩 출력
        }

        System.out.println(Arrays.toString(score2)); // 배열의 내용을 쉽게 출력할 수 있는 방법 / Arrays 클래스 이용 / 배열의 내용을 문자열로 반환
    }
}
