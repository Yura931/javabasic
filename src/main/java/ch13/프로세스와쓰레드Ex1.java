package ch13;

public class 프로세스와쓰레드Ex1 {
    public static void main(String[] args) {
        /*
            프로세스 : 실행 중인 프로그램, 자원(resources)과 쓰레드로 구성
            쓰레드 : 프로세스 내에서 실제 작업을 수행.
                    모든 프로세스는 최소한 하나의 쓰레드를 가지고 있다.

                    프로세스 : 쓰레드 = 공장 : 일꾼

            싱글 쓰레드 프로세스
            = 자원 + 쓰레드

            멀티 쓰레드 프로세스
            = 자원 + 쓰레드 + 쓰레드 + ... + 쓰레드


            "하나의 새로운 프로세스를 생성하는 것보다
                하나의 새로운 쓰레드를 생성하는 것이 더 적은 비용이 든다."

            대부분의 프로그램이 멀티쓰레드로 작성되어 있다.
                멀티쓰레드 프로그래밍이 장점만 있는 것은 아니다.

            장점
                - 시스템 자원을 보다 효율적으로 사용할 수 있다.
                - 사용자에 대한 응답성(responsiveness)이 향상된다.
                - 작업이 분리되어 코드가 간결해 진다.

            단점
                - 동기화(synchronization)에 주의해야 한다.
                - 교착상태(dead-lock)가 발생하지 않도록 주의해야 한다.
                - 각 쓰레드가 효율적으로 고르게 실행될 수 있게 해야 한다. 기아.. 특정 쓰레드는 작업할 기회를 가지지 못 할 지도..
        */

        /*
            쓰레드의 구현과 실행
                1. Thread 클래스를 상속
                2. Runnable 인터페이스를 구현 - 자바는 단일상속만 되므로 이 방법 더 추천
        */

        MyThread t1 = new MyThread();

        Runnable r = new MyThread2();
        Thread t2 = new Thread(r);

        t1.start(); // start() 실행이 바로 되는 것이 아닌 실행 가능한 상태가 되는것, OS스케줄러가 실행순서 결정, OS에 의존적
        t2.start();

        // start() 메서드는 새로운 호출스택을 생성 -> 새로운 호출스택에 run을 올림 -> 각각의 쓰레드가 호출스택을 가지고 실행하게 되는 것 / 서로 독릭적으로 작업수행
    }
}

class MyThread extends Thread { // Thread클래스를 상속해서 쓰레드를 구현
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.print(0);
        }
    }
}

class MyThread2 implements Runnable { // Runnable인터페이스를 구현해서 작업
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            // Thread.currentThread() - 현재 실행중인 Thread를 반환
            System.out.print(1);
        }
    }
}
