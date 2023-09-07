package ch13;

public class 쓰레드의우선순위Ex1 {
    public static void main(String[] args) {
        /*
            쓰레드의 우선순위(priority of thread)
                : 작업의 중요도에 따라 쓰레드의 우선순위를 다르게 하여 특정 쓰레드가 더 많은 작업시간을 갖게 할 수 있다.

            희망사항일 뿐 .. 결국엔 OS스케쥴러가 정해줌 ..

            우선순위에 크게 기대하면 안됨! 확률적으로 좀 높아질 뿐
        */
    }
}

class ThreadPriority extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {

        }
    }
}
