package ch04;

import java.util.Scanner;

public class 조건문Ex3 {
    public static void main(String[] args) {
        /*
            switch문
                : 처리해야 하는 경우의 수가 많을 때 유용한 조건문
                    1. 조건식을 계산한다.
                    2. 조건식의 결과와 일치하는 case문으로 이동한다.
                    3. 이후의 문장들을 수ㅐㅇ한다.
                    4. break문이나 switch문의 끝을 만나면 switch문 전체를 빠져나간다.

            if else문의 경우 조건식에 true, false만 올 수 있음 / 조건을 여러개 따져보게 됨
            switch문의 경우 정수, 문자열 올 수 있음 / 조건을 한번만 수행 / 제약조건이 있어 사용할 수 없는 경우 어쩔수 없이 if-else문 사용

            switch문의 제약조건
            1. switch문의 조건식 결과는 정수 또는 문자열이어야 한다. / 1.7부터 문자열 가능
            2. case문의 값은 정수 상수(문자포함), 문자열만 가능하며, 중복되지 않아야 한다. / case문의 값에 변수 사용 불가능

        */
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("현재의 계절은 봄입니다.");
                break; // break문 빼먹지 않도록 주의
            case 6: case 7: case 8:
                System.out.println("현재의 계절은 여름입니다.");
                break;
            case 9: case 10: case 11:
                System.out.println("현재의 계절은 가을입니다.");
                break;
            default:
                System.out.println("현재의 계절은 겨울입니다.");
        }

        int num, result = 0;
        final int ONE = 1; // 정수 상수
        switch(result) {
            case 3:
                System.out.println("조건에 해당");
                break;
            case 2:
                break;
            case ONE :
                break;
            default:
                System.out.println("default 문장"); // 생략 가능
        }
    }
}
