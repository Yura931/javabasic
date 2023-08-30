package ch07;

public class 추상클래스Ex1 {
    public static void main(String[] args) {
        /*
            추상 클래스(abstract class)
                : 미완성 설계도. 미완성 메서드를 갖고 있는 클래스
                : 다른 클래스 작성에 도움을 주기 위한 것. 인스턴스 생성 불가.
                : 상속을 통해 추상 메서드를 완성해야 인스턴스 생성가능

            추상 메서드(abstract method)
                : 미완성 메서드. 구현부(몸통, {})가 없는 메서드
                : 꼭 필요하지만 자손마다 다르게 구현될 것으로 예상되는 경우
        */

        // Player p = new Player(); 추상클래스의 인스턴스 생성 불가
        AudioPlayer ap = new AudioPlayer();
        Player p = new AudioPlayer();   // 다형성
        p.play(100);
        p.stop();
    }
}

abstract class AbstractPlayer extends Player {
        void play(int pos) {} // 추상클래스를 상속받았지만 추상메서드를 전부 구현하지 않았을 경우 abstract키워드 붙여주어야 함. 미완성 설계도이기 때문!
}

class AudioPlayer extends Player { // 미완성 설계도를 구현시킨 완성된 설계도!
    void play(int pos) { // 추상메서드를 구현
        System.out.println(pos + "위치부터 play합니다.");
    }

    void stop() {       // 추상메서드를 구현
        System.out.println("재생을 멈춥니다.");
    }
}

abstract class Player {
    boolean pause;
    int currentPos;

    Player() {
        pause = false;
        currentPos = 0;
    }

    abstract void play(int pos);    // 추상메서드(몸통{}이 없는 미완성 메서드)
    abstract void stop();           // 추상 메서드

    void play() {   // 추상메서드를 사용할 수 있다. 호출
        play(currentPos);   // 선언부만 있으면 호출 가능, 상속통해 자손이 완성,
                            // 자손객체 생성 후 참조변수를 통해 호출,
                            // 인스턴스 메서드이지만 어짜피 완전히 구현 후 호출 할 수 있기 때문에 호출하는 상황이 오면 메서드들이 구현되어 있을것이다.
    }
}
