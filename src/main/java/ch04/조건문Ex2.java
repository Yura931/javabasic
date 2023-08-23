package ch04;

import java.util.Scanner;

public class 조건문Ex2 {
    public static void main(String[] args) {
        /*
            중첩 if문
        */
        char grade = 'C', opt = '0';
        int score = 0;

        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        System.out.printf("당신의 점수는 %d입니다.%n", score);

        if(score >= 90) {
            grade = 'A';
            if (score >= 98) {
                opt = '+';
            } else if (score < 94) {
                opt = '-';
            }
        } else if (score >= 80) {
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if(score < 84) {
                opt = '-';
            }
        }

        System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);
    }
}
