package ch04;

import java.util.Scanner;

public class 반복문doWhileEx1 {
    public static void main(String[] args) {
        /*
            do-while문
                : 블럭{}을 최소한 한 번 이상 반복 - 사용자 입력받을 때 유용
        */

        int input = 0, answer =0;

        answer = (int)(Math.random() * 100) + 1; // 1 ~ 100 사이 임의의 수 저장
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("1과 100사이의 정수를 입력하세요.>");
            input = sc.nextInt(); // do-while문 사용으로 입력 코드를 줄일 수 있음

            if(input > answer) {
                System.out.println("더 작은 수로 다시 시도해보세요.");
            } else if(input < answer) {
                System.out.println("더 큰 수로 다시 시도해보세요.");
            }
        } while(input != answer);

        System.out.println("정답입니다.");
    }
}
