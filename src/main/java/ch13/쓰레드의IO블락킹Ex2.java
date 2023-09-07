package ch13;

import javax.swing.*;

public class 쓰레드의IO블락킹Ex2 {
    public static void main(String[] args) {
        Thread3 th3 = new Thread3();
        th3.start();

        // 멀티쓰레드로 구성하는 경우 사용자 입력을 기다리지 않고 다른 작업을 실행할 수 있음
        String input = JOptionPane.showInputDialog("아무값이나 입력하세요.");
        System.out.println("입력하신 값은 " + input + "입니다.");


        /*
            멀티쓰레드 프로그래밍의 장점 !
            외부 요인에 의해서 멈춰 있을 때에도 다른 쓰레드가 작업을 할 수 있기 때문에 좀 더 효율적으로 프로그래밍을 할 수 있다.
        */
    }
}

class Thread3 extends Thread {
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                sleep(1000);
            } catch (Exception e) {

            }
        }
    }
}
