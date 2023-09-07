package ch13;

public class 쓰레드종류Ex1 {
    static long startTime = 0;
    public static void main(String[] args) {
        /*
            main 쓰레드
                : main메서드의 코드를 수행하는 쓰레드
                : 쓰레드는 '사용자 쓰레드'와 '데몬 쓰레드' 두 종류가 있다.

                실행 중인 사용자 쓰레드가 하나도 없을 때 프로그램은 종료된다.

                멀티쓰레드 작업 시 시간이 조금 더 걸림
                A작업에서 B작업으로 넘어갈 때 context switching이 발생하고 여기에서 시간이 소요 됨

                시간이 조금 더 걸리더라도 동시에 작업한다는 장점!
        */
        Thread1 th1 = new Thread1();
        Thread2 th2 = new Thread2();
        th1.start();
        th2.start();
        startTime = System.currentTimeMillis();
        try {
            th1.join(); // main쓰레드가 th1의 작업이 끝날 때까지 기다린다.
            th2.join(); // main쓰레드가 th2의 작업이 끝날 때까지 기다린다.
        } catch(InterruptedException e) {

        }
        System.out.print("소요시간 :" + System.currentTimeMillis());
        System.out.println();
        System.out.println("싱글쓰레드");

        for (int i = 0; i < 300; i++) {
            System.out.print(new String("-"));
        }
        for (int i = 0; i < 300; i++) {
            System.out.print(new String("|"));
        }
    }
}

class Thread1 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print(new String("-"));
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print(new String("|"));
        }
    }
}
