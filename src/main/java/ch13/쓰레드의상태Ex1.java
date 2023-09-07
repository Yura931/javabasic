package ch13;

public class 쓰레드의상태Ex1 {
    public static void main(String[] args) {
        /*
            쓰레드의 상태
            NEW - 쓰레드가 생성되고 아직 start()가 호출되지 않은 상태
            RUNNABLE - 실행 중 또는 실행 가능한 상태
            BLOCKED - 동기화블럭에 의해서 일시정지된 상태(lock이 풀릴 때까지 기다리는 상태)
            WAITING / TIMED_WAITING - 쓰레드의 작업이 종료되지는 않았지만 실행가능하지 않은(unrunnable) 일시정지상태. TIMED_WAITING은 일시정지시간이 지정된 경우를 의미
            TERMINATED - 쓰레드의 작업이 종료된 상태

            쓰레드의 실행제어
                : 쓰레드의 실행을 제어할 수 있는 메서드가 제공된다.

            sleep()
                : 현재 쓰레드를 지정된 시간동안 멈추게 한다.
                : 특정 쓰레드를 지정해서 멈추게 하는 것은 불가능하다. 쓰레드 자기자신한테만 적용 가능
        */

        Thread4 th1 = new Thread4();
        Thread5 th2 = new Thread5();
        th1.start();
        th2.start();

        delay(2 * 1000);
        System.out.print("<<main 종료>>");

    }

    static void delay(long millis) {
        try {
            Thread.sleep(2000); // main 쓰레드가 잠드는 것, 실행 중인 Thread가 잠드는 것
        } catch (InterruptedException e) {}
    }
}

class Thread4 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("-");
        }
        System.out.print("<<th1종료>>");
    }
}

class Thread5 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("|");
        }
        System.out.print("<<th2종료>>");
    }
}
