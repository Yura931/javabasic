package ch13;

public class 쓰레드의상태Ex3 {
    public static void main(String[] args) {
        /*
            join()
                : 지정된 시간동안 특정 쓰레드가 작업하는 것을 기다린다.
                : 예외처리를 해야한다.(InterruptedException이 발생하면 작업 재개)

            yield()
                : 남은 시간을 다음 쓰레드에게 양보하고, 자신(현재 쓰레드)은 실행대기한다.
                : yield()와 interrupt()를 적절히 사용하면, 응답성과 효율을 높일 수 있다.
                : OS스케쥴러에게 알려주는 것
        */
    }
}


