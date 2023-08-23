package ch04;

public class 조건문Ex1 {
    public static void main(String[] args) {
        /*
            제어문 flow control statement
            조건문 : 조건을 만족할때만 {}를 수행(0 ~ 1번)
                조건에 따라 실행흐름 변경

            반복문 : 조건을 만족하는 동안 {}를 수행(0 ~ n번)

            블럭 {} : 여러 문장을 하나로 묶어주는 것
            한 줄의 문장인 경우 블럭 생략 가능

        */

        int x = 10, y = 20;
        int score = 50;

        if(score > 60) {
            System.out.println("합격입니다.");
        } else if(score <= 30) {
            System.out.println("불합격입니다.");
        } else { // else를 안 쓰는 방법이 있는지 고민 한번 해보고 사용
            
        }

    }
}
