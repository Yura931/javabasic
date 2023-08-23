package ch04;

import java.util.Scanner;

public class 반복문whileEx1 {
    public static void main(String[] args) {
        /*
            while문
                : 조건을 만족시키는 동안 블럭{}을 반복 - 반복횟수 모를 때
        */

        int i = 5;
        while(i-- != 0) {
            // 조건식의 연산결과가 참(true)인 동안, 반복될 문장
            System.out.println(i + " - I can do it.");
        }

        int sum = 0;
        i = 0;

        // i를 1씩 증가시켜서 sum에 계속 더해나간다.
        while (sum <= 100) {
            System.out.printf("%d - %d%n", i, sum);
            sum += ++i;
        }

        int num = 0;
        sum = 0;
        System.out.print("숫자를 입력하세요.(예:12345)>");

        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine();
        num = Integer.parseInt(tmp);

        while(num > 0) {
            sum += num % 10;
            num = num / 10;
            System.out.println("sum =" + sum + " num=" + num);
        }

        System.out.println("각 자리수의 합:" + sum);
    }
}
