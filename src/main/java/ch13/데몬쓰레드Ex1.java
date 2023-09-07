package ch13;

public class 데몬쓰레드Ex1 implements Runnable {
    static boolean autoSave = false;

    public static void main(String[] args) {
        /*
            데몬 쓰레드(daemon thread)
                : 일반 쓰레드(non-daemon thread)의 작업을 돕는 보조적인 역할을 수행
                : 일반 쓰레드가 모두 종료되면 자동적으로 종료된다.
                : 가비지 컬렉터, 자동저장, 화면 자동갱신 등에 사용된다.
                : 무한루프와 조건문을 이용해서 실행 후 대기하다가 특정조건이 만족되면 작업을 수행하고 다시 대기하도록 작성한다.
        */

        Thread t = new Thread(new 데몬쓰레드Ex1());
        t.setDaemon(true);  // 데몬쓰레드로 지정, main쓰레드가 종료되면 daemon쓰레드도 함께 종료된다.
        t.start();

        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }

            System.out.println(i);
            if(i==5) autoSave = true;
        }

        System.out.println("프로그램을 종료합니다.");
    }

    public void run() {
        while(true) {   // 무한 루프
            try{
                Thread.sleep(3 * 1000); // 3초마다
            } catch(InterruptedException e) {

            }

            if(autoSave) autoSave();
        }
    }

    public void autoSave() {
        System.out.println("작업파일이 자동저장되었습니다.");
    }
}


