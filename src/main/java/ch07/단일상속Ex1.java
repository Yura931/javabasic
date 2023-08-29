package ch07;

public class 단일상속Ex1 {
    public static void main(String[] args) {
        /*
            단일상속(Single Inheritance)
                - Java는 단일상속만을 허용한다.(C++은 다중상속 허용)
                - 비중이 높은 클래스 하나만 상속관계로, 나머지는 포함관계로 한다.
        */
    }
}

// Tv클래스를 상속받고 DVD클래스를 포함관계로 만들어 객체의 기능을 사용하도록 만듦
class TvDVD extends Tv {
    DVD dvd = new DVD();

    void play() {
        dvd.play();
    }

    void stop() {
        dvd.stop();
    }

    void rew() {
        dvd.rew();
    }

    void ff() {
        dvd.ff();
    }
}

class DVD {
    boolean power;

    void poser() {
        power = !power;
    }
    void play() {}
    void stop() {}
    void rew() {}
    void ff() {}
}
