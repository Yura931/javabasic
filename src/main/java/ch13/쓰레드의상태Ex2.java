package ch13;

import javax.swing.*;

public class 쓰레드의상태Ex2 {
    public static void main(String[] args) {
        /*
            interrupt()
                : 대기상태(WAITING)인 쓰레드를 실행대기 상태(RUNNABLE)로 만든다.
        */

        ThreadInterrupt th1 = new ThreadInterrupt();
        th1.start();
        System.out.println("isInterrupted():" + th1.isInterrupted());
        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력하신 값은 " + input + "입니다.");
        th1.interrupt();    // interrupt()를 호출하면, interrupted상태가 true가 된다.

        System.out.println("isInterrupted():" + th1.isInterrupted());
        System.out.println("isInterrupted():" + th1.isInterrupted());

        // th1.interrupted() 가 th1을 깨우는 것이 아닌 현재 실행 중인 Thread - main 메서드가 interrupted() 실행하는 것.


        /*
            suspend(), resume(), stop()은 교착상태(dead-lock)에 빠지기 쉬워서 deprecated되었음
        */

    }
}

class ThreadInterrupt extends Thread {
    @Override
    public void run() {
        int i = 10;

        while(i !=0 && !isInterrupted()) {
            System.out.println(i--);
            for(long x = 0; x < 2500000000L; x++); // 시간 지연
        }

        System.out.println("카운트가 종료되었습니다.");
        // isInterrupted()와 달리 interrupted()는 interrupted라는 상태변수를 false로 초기화 한다.
        // 실행 중인 쓰레드를 깨우는 것

        System.out.println("interrupted():" + Thread.interrupted());
        System.out.println("interrupted():" + Thread.interrupted());
    }
}
