package ch04;

import java.util.Scanner;

public class 반복문continueEx1 {
    public static void main(String[] args) {
        /*
            continue문
                : 자신이 포함된 반복문의 끝으로 이동 - 다음 반복으로 넘어감
                전체 반복 중에서 특정 조건 시 반복을 건너뛸 때 유용
        */

        for (int i = 0; i <= 10; i++) {
            if(i%3==0)
                continue; // 조건식이 참이되어 continue문이 수행되면 블럭의 끝으로 이동, break문과 달리 반복문을 벗어나지 않음
        }

        int menu = 0;
        int num = 0;

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.print("원하는 메뉴(1 ~ 3)를 선택하세요.(종료:0)>");

            String tmp = sc.nextLine();
            menu = Integer.parseInt(tmp);

            if(menu == 0) {
                System.out.println("프로그램을 종료합니다.");
                break; // 반복문 벗어남
            } else if(!(1 <= menu && menu <= 3)) {
                System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
                continue; //
            }

            System.out.println("선택하신 메뉴는" + menu + "번입니다.");
        }
    }
}
