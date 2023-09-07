package ch13;

import javax.swing.*;

public class 쓰레드의IO블락킹Ex1 {
    public static void main(String[] args) {
        /*
            쓰레드의 I/O 블락킹(blocking) - input / output 입출력시 작업 중단
        */

        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력하신 값은 " + input + "입니다.");

        // 싱글쓰레드의 경우 사용자로부터 입력을 받는 동안 아무일도 하지 않고 기다리고 있게 됨

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000); // 1초간 시간을 지연한다.
            } catch (Exception e) {

            }
        }
    }
}


